package com.ntu.mywaifu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsWF;
        dsWF = new ArrayList<String>();
        dsWF.add("Ngoan Nhân Đại Đế");
        dsWF.add("Hóa Thân Nữ Oa");

        ArrayAdapter<String> adaterWF;
        adaterWF = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line,
                dsWF
        );

        ListView tenNv = findViewById(R.id.listView);
        tenNv.setAdapter(adaterWF);

        tenNv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }


}