package com.android.schrank.scherer.schoen.reisetagebuchapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by rapha on 31.05.2018.
 */

public class EditProfilePicture extends EditProfile {
    Button abbrechen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofilepicture);
        cancelEditProfilePicture();
    }

    public void cancelEditProfilePicture() {
        abbrechen = (Button) findViewById(R.id.abbrechen);
        abbrechen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfilePicture.this, EditProfile.class);
                EditProfilePicture.this.startActivity(intent);
            }
        });
    }


}
