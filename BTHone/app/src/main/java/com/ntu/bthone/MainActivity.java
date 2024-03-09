package com.ntu.bthone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeToEx_1(View view) {
        setContentView(R.layout.ex_1);
    }

    public void changeToEx_2(View view) {
        setContentView(R.layout.ex_2);
    }

    public void changeToEX_3(View view) {
        setContentView(R.layout.ex_3);

        EditText editTextA = findViewById(R.id.edit_A_ex3);
        EditText editTextB = findViewById(R.id.edit_B_ex3);
        EditText viewKetQua = findViewById(R.id.viewKq);
        Button btnXLC = findViewById(R.id.btn_Ex3);
    }

    public void backEx(View View){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    public void XulyCong(View view) {
        EditText editTextA = findViewById(R.id.edit_A_ex3);
        EditText editTextB = findViewById(R.id.edit_B_ex3);
        EditText viewKetQua = findViewById(R.id.viewKq);

        String strA = editTextA.getText().toString();
        String strB = editTextB.getText().toString();

        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB)) {
            Toast.makeText(this, "Vui lòng nhập giá trị cho cả hai ô", Toast.LENGTH_SHORT).show();
            return;
        }

        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        int tong = soA + soB;

        viewKetQua.setText(String.valueOf(tong));
    }

    EditText num_1, num_2, viewkq;
    public void changeToEx_4(View view) {
        setContentView(R.layout.ex_4);

        num_1 = findViewById(R.id.edit_one);
        num_2 = findViewById(R.id.edit_two);
        viewkq = findViewById(R.id.edit_kqview);
    }

    public void phepCong(View view) {
        phepTinh('+');
    }

    public void phepTru(View view) {
        phepTinh('-');
    }

    public void phepNhan(View view) {
        phepTinh('*');
    }

    public void phepChia(View view) {
        phepTinh('/');
    }

    @SuppressLint("SetTextI18n")
    private void phepTinh(char operator) {
        double num1 = Double.parseDouble(num_1.getText().toString());
        double num2 = Double.parseDouble(num_2.getText().toString());
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    viewkq.setText("Chia hem được");
                    return;
                }
                break;
        }
        viewkq.setText(String.valueOf(result));
    }
}

