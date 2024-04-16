package com.ntu.listrecycview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    landAdapter landAdapter;
    ArrayList<LandSpace> recycVDT;

    RecyclerView recycVLS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycVDT = getDataforRecycViewLand();
        recycVLS = findViewById(R.id.recycLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recycVLS.setLayoutManager(layoutLinear);

        landAdapter = new landAdapter(this, recycVDT);
        recycVLS.setAdapter(landAdapter);
    }
    ArrayList<LandSpace> getDataforRecycViewLand(){
        ArrayList<LandSpace> dsDuLieu = new ArrayList<LandSpace>();
        LandSpace landSpace_1 = new LandSpace("ati_1","Xian Yun");
        dsDuLieu.add(landSpace_1);
        LandSpace landSpace_2 = new LandSpace("ati_2","Tống Dật");
        dsDuLieu.add(landSpace_2);
        LandSpace landSpace_3 = new LandSpace("ati_3","Vương Ẩn");
        dsDuLieu.add(landSpace_3);
        return dsDuLieu;
    }
}