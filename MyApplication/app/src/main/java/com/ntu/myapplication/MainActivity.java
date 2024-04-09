package com.ntu.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewDepartment = findViewById(R.id.textViewDepartment);
        TextView textViewHobbies = findViewById(R.id.textViewHobbies);


        textViewName.setText("Tên: Nguyễn Ngọc Anh Thư");
        textViewDepartment.setText("Khoa: Công Nghệ Thông Tin");
        textViewHobbies.setText("Sở thích: Hát");
    }
}