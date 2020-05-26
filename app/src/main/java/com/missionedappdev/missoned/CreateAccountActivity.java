package com.missionedappdev.missoned;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.*;
import java.util.*;

import com.squareup.picasso.Picasso;

public class CreateAccountActivity extends AppCompatActivity {

    EditText etEmailNew,etPasswordNew,etUsernameNew, etClass,etMobile;
    Button btnCreateAcc; TextView btnLoginPage;
    Button btnAddImage; ImageView ivImage;
    Uri imageUri;

    int STD_CLASS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        /**
         * @author user : soumitri2001
         * this activity is for creating account for a new user
         * uname, email and pass are string equivalents of the EditText fields
         * btnAddImage is button to choose image from gallery, ivImage is the ImageView object that will store the image (NEED ASSISTANCE IN THIS)
         * btnCreateAcc is the button for signing up. The user needs to be authenticated before signing him up.
         */

        etEmailNew=findViewById(R.id.etEmailNew);
        etPasswordNew=findViewById(R.id.etPasswordNew);
        etUsernameNew=findViewById(R.id.etUsernameNew);
        btnCreateAcc=findViewById(R.id.btnCreateAcc);
        etClass=findViewById(R.id.etClass);
        etMobile=findViewById(R.id.etPhoneNumber);
        ivImage=findViewById(R.id.profile_picture);

        btnLoginPage=findViewById(R.id.btnLoginPage);

        btnAddImage=findViewById(R.id.btnAddImage);

        btnAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent, 1);
            }
        });



        btnLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateAccountActivity.this,LoginActivity.class));
                finish();
            }
        });

        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=etEmailNew.getText().toString().trim(),
                        pass=etPasswordNew.getText().toString().trim(),
                        uname=etUsernameNew.getText().toString().trim(),
                        mobile=etMobile.getText().toString().trim(),
                        stdClass=etClass.getText().toString().trim();

                if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass) && !TextUtils.isEmpty(uname)
                        && !TextUtils.isEmpty(mobile) && !TextUtils.isEmpty(stdClass)) {

                    STD_CLASS = Integer.parseInt(stdClass);
                    if(STD_CLASS<8 || STD_CLASS>12) {
                        Toast.makeText(CreateAccountActivity.this, "Invalid Class entered !", Toast.LENGTH_SHORT).show();
                        etClass.setText(null);
                    }
                    else
                    {
                        /*
                         * authentication and adding user to database : code
                         */
                        Toast.makeText(CreateAccountActivity.this, "Successfully created account !", Toast.LENGTH_SHORT).show();
                        /*startActivity(new Intent(CreateAccountActivity.this, HomeScreen.class));
                        finish();*/
                        Intent intent=new Intent(CreateAccountActivity.this,HomeScreen.class);
                        intent.putExtra("Email",email);
                        intent.putExtra("Username",uname);
                        startActivity(intent);
                        finish();
                    }

                } else {
                    Toast.makeText(CreateAccountActivity.this, "All fields are compulsory to be filled up", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 & resultCode==RESULT_OK) {
            if(data!=null) {
                imageUri = data.getData();
//                Picasso.(CreateAccountActivity.this).load(imageUri).noPlaceholder().centerCrop().fit()
//                        .into(ivImage);
//                ivImage.setImageURI(imageUri);

                Picasso.get()
                        .load(imageUri)
                        .noPlaceholder()
                        .fit()
                        .into(ivImage); btnAddImage.setVisibility(View.INVISIBLE);

                Log.d("Status" , "Profile picture added");
            }
        }
    }
}
