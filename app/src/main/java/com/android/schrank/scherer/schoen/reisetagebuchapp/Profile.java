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

/**
 * Created by rapha on 09.05.2018.
 */

public class Profile extends MainActivity {
    Button profilBearbeiten;
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private ProfileFragment profileFragment;
    private DateFragment dateFragment;
    private AddFragment addFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideSoftKeyboard();
        setContentView(R.layout.profile);
        startEditProfileActivity();
        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        profileFragment = new ProfileFragment();
        dateFragment = new DateFragment();
        addFragment = new AddFragment();

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.nav_profile:
                    mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                    setFragment(profileFragment);
                       return true;

                    case R.id.nav_date:
                    setFragment(dateFragment);
                        return true;

                    case R.id.nav_add:
                     mMainNav.setItemBackgroundResource(R.color.WhiteTransparent);
                    setFragment(addFragment);
                      return true;

                    default:
                        return false;

                }
            }
        });

    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
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
