package com.ntu.mywaifu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listViewWF);


        ArrayList<String> dsWF = new ArrayList<>();
        dsWF.add("Lâm Như An");
        dsWF.add("Lục Tuyết Kỳ");
        dsWF.add("Ngoan Nhân Đại Đế");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsWF);


        listView.setAdapter(adapter);
    }
}