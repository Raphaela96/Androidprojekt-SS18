package com.android.schrank.scherer.schoen.reisetagebuchapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by rapha on 19.06.2018.
 */

public class Calendar extends MainActivity{
    private BottomNavigationView mMainNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        mMainNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        //Bottom Navigation reagiert nicht mehr, erkennt die items nicht mehr
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.nav_profile:
                        Intent intent = new Intent(Calendar.this, Profile.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_date:
                        Toast.makeText(Calendar.this, "Calendar",
                                Toast.LENGTH_LONG).show();
                        setContentView(R.layout.calendar);
                        break;

                    case R.id.nav_add:
                        Intent intent2 = new Intent(Calendar.this, Profile.class);
                        startActivity(intent2);
                        break;



                }
                return false;
            }
        });

    }



}
