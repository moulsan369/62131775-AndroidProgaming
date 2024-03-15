package com.ntu.coffehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ntu.coffehouse.models.Country;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<Country> dsQG;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsQG = new ArrayList<Country>();
        dsQG.add(new Country("",91000,"Việt Nam"));
        dsQG.add(new Country("",1005000,"Nga"));
        dsQG.add(new Country("",9899000,"Mỹ"));

    }
}