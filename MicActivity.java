package com.example.karaokeeed.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.karaokeeed.R;

import java.util.ArrayList;
import java.util.List;

public class MicActivity extends AppCompatActivity {

    private ListView listview;
    private List<String> list;
    private TextView textView;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_mic_activity);

        textView = findViewById(R.id.textView5);
        listview = findViewById(R.id.listview);
        list = new ArrayList<>();
        list.add("How are you");
        list.add("I am fine");
        list.add("Hello");
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
        listview.setVerticalScrollBarEnabled(false);
    }
}