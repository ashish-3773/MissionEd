package com.missionedappdev.missoned;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail,etPassword;
    Button btnSignIn; TextView btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /**
         * @author user : soumitri2001
         * this activity is for logging in an existing user
         * etEmail and etPassword will have the entered respective texts, email and pass are string equivalents of the same
         * btnSignIn is the button for signing in. The user needs to be authenticated before logging him in.
         */

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnSignIn=findViewById(R.id.btnSignIn);

        btnSignUp=findViewById(R.id.btnSignUpPage);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=etEmail.getText().toString().trim();
                String pass=etPassword.getText().toString().trim();
                if(TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {
                    Toast.makeText(LoginActivity.this, "Please enter all fields to sign in", Toast.LENGTH_SHORT).show();
                } else {

                    /*
                    * user authentication code : check if user exists or not and show toast messages accordingly
                    */

                    Toast.makeText(LoginActivity.this, "Logged in successfully !", Toast.LENGTH_SHORT).show();
                    Log.d("Status","Logged in");

                    startActivity(new Intent(LoginActivity.this, HomeScreen.class));
                    finish();

                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, select_grade.class));
                finish();
            }
        });

    }
}
