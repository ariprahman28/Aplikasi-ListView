package com.ariprahman.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvIteam;
    private String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapore",
            "Italy", "Inggris", "Belanda",
            "Argentina", "Chile",
            "Mesir", "Uganda"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List View Sederhana");

        lvIteam = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1,namanegara);

        lvIteam.setAdapter(adapter);

        lvIteam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Toast.makeText(MainActivity.this,"Memilih  : " +namanegara[position],Toast.LENGTH_LONG).show();
            }


        });
    }
    }