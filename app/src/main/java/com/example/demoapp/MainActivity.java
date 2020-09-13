package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ArrayList<Integer> arrayListViewPager;
    TextView tvMonth;
    GridView gridView;
    ArrayAdapter arrayAdapter;
    Integer[] arrayList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        InitDataMonth();



        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        gridView.setAdapter(arrayAdapter);
    }

    private void InitDataMonth() {
        arrayListViewPager = new ArrayList<Integer>();
        arrayListViewPager.add(1,R.layout.activity_main);
        arrayListViewPager.add(2,R.layout.activity_main);
        arrayListViewPager.add(3,R.layout.activity_main);
        arrayListViewPager.add(4,R.layout.activity_main);
        arrayListViewPager.add(5,R.layout.activity_main);
        arrayListViewPager.add(6,R.layout.activity_main);
        arrayListViewPager.add(7,R.layout.activity_main);
        arrayListViewPager.add(8,R.layout.activity_main);
        arrayListViewPager.add(9,R.layout.activity_main);
        arrayListViewPager.add(10,R.layout.activity_main);
        arrayListViewPager.add(11,R.layout.activity_main);
        arrayListViewPager.add(12,R.layout.activity_main);
    }

    private void AnhXa() {
        viewPager = findViewById(R.id.viewPager);
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