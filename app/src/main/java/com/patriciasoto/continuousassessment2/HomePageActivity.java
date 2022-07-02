package com.patriciasoto.continuousassessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class HomePageActivity extends AppCompatActivity {

    MaterialButton VerButton, VerButton1, VerButton2, VerButton3, VerButton4, VerButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        VerButton = findViewById(R.id.mverbtn);
        VerButton1 = findViewById(R.id.mverbtn1);
        VerButton2 = findViewById(R.id.mverbtn2);
        VerButton3 = findViewById(R.id.mverbtn3);
        VerButton4 = findViewById(R.id.mverbtn4);
        VerButton5 = findViewById(R.id.mverbtn5);

        VerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, PrincipalPageActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}