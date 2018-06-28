package com.android.schrank.scherer.schoen.reisetagebuchapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rapha on 31.05.2018.
 */

public class EditProfile extends Profile {
    Button fertig;
    Button editprofilepicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofile);
        goBackToProfileActivity();
        startEditProfilePictureActivity();
    }

    public void goBackToProfileActivity() {
        fertig = (Button) findViewById(R.id.fertig);
        fertig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfile.this, Profile.class);
                EditProfile.this.startActivity(intent);
            }
        });
    }

    public void startEditProfilePictureActivity() {
        //camelCase?
        editprofilepicture = (Button) findViewById(R.id.editprofilepicture);
        editprofilepicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfile.this, EditProfilePicture.class);
                EditProfile.this.startActivity(intent);
            }
        });
    }


}
