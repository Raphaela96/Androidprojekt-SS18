package com.android.schrank.scherer.schoen.reisetagebuchapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rapha on 31.05.2018.
 */

public class EditProfile extends Profile {
    Button fertig;
    Button editprofilepicture;
    public static final String EXTRA_TEXT = "com.android.schrank.scherer.schoen.reisetagebuchapp.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofile);
        goBackToProfileActivity();
        startEditProfilePictureActivity();
        Button benutzernameÄndern = (Button) findViewById(R.id.benutzernameÄndern);
        benutzernameÄndern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText benutzername = (EditText) findViewById(R.id.editText3);
                TextView textView = (TextView) findViewById(R.id.textView4);
                textView.setText(benutzername.getText().toString());
                //Intent i = new Intent(EditProfile.this, Profile.class);
               // i.putExtra("name", benutzername.getText());
                //startActivity(i);
            }
        });
        Button statusÄndern = (Button) findViewById(R.id.statusÄndern);
        statusÄndern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText status = (EditText) findViewById(R.id.editText2);
                TextView textView = (TextView) findViewById(R.id.textView6);
                textView.setText(status.getText().toString());


            }
        });





    }

    public void goBackToProfileActivity() {
        fertig = (Button) findViewById(R.id.fertig);
        fertig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfile.this, Profile.class);
                //intent.putExtra(EXTRA_TEXT, text);
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
