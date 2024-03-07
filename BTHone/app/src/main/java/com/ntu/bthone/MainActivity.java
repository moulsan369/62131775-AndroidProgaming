package com.ntu.bthone;

import androidx.appcompat.app.AppCompatActivity;

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



}

