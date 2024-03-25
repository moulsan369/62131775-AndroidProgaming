package ntu.todolist62131775;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layoutList;
    ImageButton imgeBut;

    List<String> daylist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutList = findViewById(R.id.layout_list);
        imgeBut = findViewById(R.id.img_add);

        imgeBut.setOnClickListener(this);

        daylist.add("Mon");
        daylist.add("Tue");
        daylist.add("Wed");
        daylist.add("Thu");
        daylist.add("Fri");
        daylist.add("Sat");
        daylist.add("Sun");
    }

    @Override
    public void onClick(View v) {
        addView();
    }

    private void addView() {
        @SuppressLint("InflateParams") View appView = getLayoutInflater().inflate(R.layout.row_add,null, false);
        EditText editText = appView.findViewById(R.id.txt_Edit);
        AppCompatSpinner spinerDay = appView.findViewById(R.id.spiner_day);
        ImageView imgeDelete = appView.findViewById(R.id.img_delete);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,daylist);
        spinerDay.setAdapter(arrayAdapter);

        imgeDelete.setOnClickListener(v -> deleteView(appView));


        layoutList.addView(appView);
    }

    private void deleteView(View view){
        layoutList.removeView(view);
    }

}