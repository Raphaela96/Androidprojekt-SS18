package com.android.schrank.scherer.schoen.reisetagebuchapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rapha on 09.05.2018.
 */

public class Profile extends MainActivity {
    Button profilBearbeiten;
    private BottomNavigationView mMainNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
       // String text = intent.getStringExtra(EditProfile.EXTRA_TEXT);
        TextView benutzername = (TextView) findViewById(R.id.benutzername);
        //Intent i = getIntent();
        //Bundle bd = i.getExtras();
        //String getName = (String) bd.get("name");
       // benutzername.setText(getName);
      //  benutzername.setText(text);
        hideSoftKeyboard();
        setContentView(R.layout.profile);
        startEditProfileActivity();
        mMainNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);



        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){


                    case R.id.nav_profile:
                        Toast.makeText(Profile.this, "nav_profile",
                                Toast.LENGTH_LONG).show();
                       break;

                    case R.id.nav_date:
                        Toast.makeText(Profile.this, "nav_date",
                                Toast.LENGTH_LONG).show();
                        setContentView(R.layout.calendar);
                        break;

                    case R.id.nav_add:
                        Toast.makeText(Profile.this, "nav_add",
                                Toast.LENGTH_LONG).show();

                      break;



                }
                return false;
            }
        });

    }

    public void hideSoftKeyboard(){
        if(getCurrentFocus() != null){
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void startEditProfileActivity() {
        profilBearbeiten = (Button) findViewById(R.id.profilBearbeiten);
        profilBearbeiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, EditProfile.class);
                Profile.this.startActivity(intent);
            }
        });
    }


}
