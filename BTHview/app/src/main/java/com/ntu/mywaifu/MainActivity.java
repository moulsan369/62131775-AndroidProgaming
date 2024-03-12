package com.ntu.mywaifu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedName = dsWF.get(position);
                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + selectedName, Toast.LENGTH_SHORT).show();
            }
        });

        final EditText editText = findViewById(R.id.EditWF);
        Button buttonAdd = findViewById(R.id.btnAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newName = editText.getText().toString().trim();
                if (!newName.isEmpty()) {
                    dsWF.add(newName);
                    adapter.notifyDataSetChanged();
                    editText.setText(""); // Clear EditText after adding
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a name", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}