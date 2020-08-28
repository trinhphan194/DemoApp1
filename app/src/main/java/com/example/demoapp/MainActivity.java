package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView tvMonth;
    GridView gridView;
    ArrayAdapter arrayAdapter;
    Integer[] arrayList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();



        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        gridView.setAdapter(arrayAdapter);
    }

    private void AnhXa() {
        tvMonth = findViewById(R.id.tv_Month);
        gridView = findViewById(R.id.grv_Date);
    }

    public void FakeData(){
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> January = map.put(1, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
        map.put(2, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29)));
        map.put(3, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
        map.put(4, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)));
        map.put(5, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
        map.put(6, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)));
        map.put(7, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
        map.put(8, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
        map.put(9, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)));
        map.put(10, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
        map.put(11, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)));
        map.put(12, new ArrayList<Integer>(Arrays.asList
                (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)));
    }

}