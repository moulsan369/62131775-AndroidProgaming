package com.ntu.lovelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ClickListener {

    ImageGalleryAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<loveData> list = getData();
        recyclerView = findViewById(R.id.recyclerView);

        adapter = new ImageGalleryAdapter(list, getApplicationContext(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<loveData> getData() {
        List<loveData> list = new ArrayList<>();
        list.add(new loveData("Thứ hai", "May 17, 2024", "Mai Anh"));
        list.add(new loveData("Thứ năm", "June 5, 2024", "Ngọc Anh"));
        list.add(new loveData("Thứ bảy", "April 21, 2024", "Thúy Anh"));
        return list;
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, "Clicked item index is " + position, Toast.LENGTH_LONG).show();
    }
}
