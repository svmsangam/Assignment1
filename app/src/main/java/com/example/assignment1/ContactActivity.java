package com.example.assignment1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    Button btnMain;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        btnMain = findViewById(R.id.btnHome);
    }

    public void goToHome(View view) {
        Intent i = new Intent(ContactActivity.this, MainActivity.class);
        startActivity(i);
    }
}
