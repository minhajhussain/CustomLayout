package com.example.minhaj.customlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data = {"0","1","2","3","4","5","6","7","8","9"};

        ListAdapter myAdapter = new CustomAdapter(this,data);
        ListView myList = (ListView) findViewById(R.id.ListView);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String data = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this,data,Toast.LENGTH_SHORT).show();
                    }
                }

        );


    }
}
