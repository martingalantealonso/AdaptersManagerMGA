package com.example.a5alumno.adaptersmanager;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] mListValues = {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "MaxOSX", "Linux", "OS/2", "Ubuntu", "Windows7", "MaxOSX", "Linux", "OS/2", "Ubuntu", "Windows7", "MaxOSX", "Linux", "OS/2", "Android", "iPhone", "WindowsMobile"};

        final ListView mListView = (ListView) findViewById(R.id.listview_main);
        mListView.setOnItemClickListener(this);
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListValues));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //i -> Position     ||  l -> ID
        Snackbar.make(view, "Element " + i + " with ID: " + l, Snackbar.LENGTH_LONG).show();
    }
}
