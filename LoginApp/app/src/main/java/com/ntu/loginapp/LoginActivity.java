package com.ntu.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private final String email = "san.m.106bcl@gmail.com";
    private final String password = "donphuong10nam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnDN);
        TextInputEditText inputEmail = findViewById(R.id.inputEmail);
        TextInputEditText inputPassword = findViewById(R.id.inputPass);

        btnLogin.setOnClickListener(v -> {
            String enteredEmail = Objects.requireNonNull(inputEmail.getText()).toString();
            String enteredPassword = Objects.requireNonNull(inputPassword.getText()).toString();

            if (enteredEmail.equals(email) && enteredPassword.equals(password)) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "Tài khoản không tồn tại hoặc sai mật khẩu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
