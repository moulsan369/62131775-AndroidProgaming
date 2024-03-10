package com.ntu.bthtwo;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editTextA = findViewById(R.id.editTextA);
        final EditText editTextB = findViewById(R.id.editTextB);


        final EditText editTextResult = findViewById(R.id.editTextResult);


        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(v -> {

            if (editTextA.getText().toString().isEmpty() || editTextB.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "Vui lòng nhập số a và số b", Toast.LENGTH_SHORT).show();
                return;
            }


            double a = Double.parseDouble(editTextA.getText().toString());
            double b = Double.parseDouble(editTextB.getText().toString());


            double result = a + b;


            editTextResult.setText(String.valueOf(result));
        });


        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(v -> {

            if (editTextA.getText().toString().isEmpty() || editTextB.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "Vui lòng nhập số a và số b", Toast.LENGTH_SHORT).show();
                return;
            }


            double a = Double.parseDouble(editTextA.getText().toString());
            double b = Double.parseDouble(editTextB.getText().toString());


            double result = a - b;


            editTextResult.setText(String.valueOf(result));
        });


        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(v -> {

            double a = Double.parseDouble(editTextA.getText().toString());
            double b = Double.parseDouble(editTextB.getText().toString());


            double result = a * b;


            editTextResult.setText(String.valueOf(result));
        });


        Button buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(v -> {

            double a = Double.parseDouble(editTextA.getText().toString());
            double b = Double.parseDouble(editTextB.getText().toString());


            if (b != 0) {

                double result = a / b;


                editTextResult.setText(String.valueOf(result));
            } else {
                // Hiển thị thông báo nếu số b là 0
                editTextResult.setText("Không thể chia cho 0");
            }
        });
    }
}