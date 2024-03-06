package com.ntu.bthone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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
    }
}