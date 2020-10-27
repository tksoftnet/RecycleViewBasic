package com.example.recycleviewbasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rclName;
    private NameListAdapter nameListAdapter;
    private ArrayList<String> nameArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rclName = findViewById(R.id.rcvName);

        nameArrayList = new ArrayList<>();
        nameArrayList.add("Tuấn");
        nameArrayList.add("HIền");
        nameArrayList.add("Khôi");
        nameArrayList.add("Đoan");
        nameArrayList.add("Sỹ");
        nameArrayList.add("Mãi");
        nameArrayList.add("Diệu");
        nameArrayList.add("Tuấn");
        nameArrayList.add("HIền");
        nameArrayList.add("Khôi");
        nameArrayList.add("Đoan");
        nameArrayList.add("Sỹ");
        nameArrayList.add("Mãi");
        nameArrayList.add("Diệu");

        nameListAdapter = new NameListAdapter(this, nameArrayList);

        rclName.setAdapter(nameListAdapter);

        rclName.setLayoutManager(new LinearLayoutManager(this));

    }
}