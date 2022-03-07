package com.example.listviewzadanya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview1);
        arrayList = new ArrayList<>();
        arrayList.add("Qizil");
        arrayList.add("Oranjviy");
        arrayList.add("Sariq");
        arrayList.add("Yashil");
        arrayList.add("Osman ko'k");
        arrayList.add("Ko'k");
        arrayList.add("Fioletoviy");
        arrayList.add("Fioletoviy");


        arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
        
        
    }
}