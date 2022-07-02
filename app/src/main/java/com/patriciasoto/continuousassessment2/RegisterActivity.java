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

public class RegisterActivity extends AppCompatActivity {

    TextView TextLogIn;
    MaterialButton RegisterButton;
    TextInputLayout inputLayoutEMail, inputLayoutFullName, inputLayoutPhone, inputLayoutPassword;
    TextInputEditText InputEmail, InputFullName, InputPhone, InputPassword;
    String textEmail, textFullName, textPhoneNumber, textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextLogIn = findViewById(R.id.textLogInH);
        inputLayoutEMail = findViewById(R.id.register_inputLayout_mail);
        inputLayoutFullName = findViewById(R.id.register_inputLayout_fullName);
        inputLayoutPhone = findViewById(R.id.register_inputLayout_phoneNumber);
        inputLayoutPassword = findViewById(R.id.register_inputLayout_Password);
        RegisterButton = findViewById(R.id.registerButton);
        InputEmail = findViewById(R.id.register_input_mail);
        InputFullName = findViewById(R.id.register_input_fullName);
        InputPhone = findViewById(R.id.register_input_phoneNumber);
        InputPassword = findViewById(R.id.register_input_Password);

        TextLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEmail = InputEmail.getText().toString().trim();
                textFullName = InputFullName.getText().toString();
                textPhoneNumber = InputPhone.getText().toString().trim();
                textPassword = InputPassword.getText().toString().trim();

                if(TextUtils.isEmpty(textEmail) || TextUtils.isEmpty(textFullName) || TextUtils.isEmpty(textPhoneNumber) ||  TextUtils.isEmpty(textPassword) ){
                    if(TextUtils.isEmpty(textEmail)) {
                        inputLayoutEMail.setError("E-Mail field can't be empty!");
                    } else {
                        inputLayoutEMail.setError(null);
                    }
                    if(TextUtils.isEmpty(textFullName)) {
                        inputLayoutFullName.setError("Full Name field can't be empty!");
                    }
                    else {
                        inputLayoutFullName.setError(null);
                    }
                    if(TextUtils.isEmpty(textPhoneNumber)) {
                        inputLayoutPhone.setError("Phone Number field can't be empty!");
                    }
                    else {
                        inputLayoutPhone.setError(null);
                    }
                    if(TextUtils.isEmpty(textPassword)) {
                        inputLayoutPassword.setError("Password field can't be empty!");
                    }
                    else {
                        inputLayoutPassword.setError(null);
                    }
                } else {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}