package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    Map<String, String> symbolsMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        symbolsMap.put("Аард", getString(R.string.aarl));
        symbolsMap.put("Аксий", getString(R.string.aksi));
        symbolsMap.put("Игни", getString(R.string.igni));
        symbolsMap.put("Ирден", getString(R.string.irden));
        symbolsMap.put("Квен", getString(R.string.qwen));

        ListView symbolsView = (ListView) findViewById(R.id.symbolsListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                symbolsMap.keySet().toArray()
        );

        symbolsView.setAdapter(arrayAdapter);

        symbolsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AarlActivity.class);
                    startActivity(intent);
                }
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), AksiActivity.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), IgniActivity.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(), IrdenActivity.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(), QwenActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
