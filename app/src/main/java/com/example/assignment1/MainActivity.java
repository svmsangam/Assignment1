package com.example.assignment1;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnHome, btnContact, btnCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHome = findViewById(R.id.btnHome);
        btnContact = findViewById(R.id.btnContact);
        btnCamera = findViewById(R.id.btnCamera);
    }

    public void goToHome(View view) {
        Intent i = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(i);
    }

    public void goToContact(View view) {
        Intent i = new Intent(MainActivity.this,ContactActivity.class);
        startActivity(i);
    }

    public void openCamera(View view) {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
}