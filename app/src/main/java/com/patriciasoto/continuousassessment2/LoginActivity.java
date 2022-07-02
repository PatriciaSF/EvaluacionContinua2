package com.patriciasoto.continuousassessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextView TextRegisterH;
    MaterialButton LoginButton;
    TextInputLayout inputLayoutEMail, inputLayoutPassword;
    TextInputEditText InputEmail, InputPassword;
    String textEmail, textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextRegisterH = findViewById(R.id.textRegisterH);
        LoginButton = findViewById(R.id.LogInButton);
        inputLayoutEMail = findViewById(R.id.login_inputLayout_mail);
        inputLayoutPassword = findViewById(R.id.login_inputLayout_Password);
        InputEmail = findViewById(R.id.login_input_mail);
        InputPassword = findViewById(R.id.login_input_Password);

        TextRegisterH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textEmail = InputEmail.getText().toString().trim();
                textPassword = InputPassword.getText().toString().trim();

                if(TextUtils.isEmpty(textEmail) ||  TextUtils.isEmpty(textPassword) ){
                    if(TextUtils.isEmpty(textEmail)) {
                        inputLayoutEMail.setError("E-Mail field can't be empty!");
                    } else {
                        inputLayoutEMail.setError(null);
                    }
                    if(TextUtils.isEmpty(textPassword)) {
                        inputLayoutPassword.setError("Password field can't be empty!");
                    }
                    else {
                        inputLayoutPassword.setError(null);
                    }
                } else {
                    Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}