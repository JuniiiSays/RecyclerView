package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewpractice.adapter.ProgramingAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView mProgramingList;
    String[] languages = {"Java", "JavaScript", "C#", "Php", "C", "C++", "Java", "JavaScript", "C#", "Php", "C", "C++"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgramingList = findViewById(R.id.rv_programing_list);
        mProgramingList.setLayoutManager(new LinearLayoutManager(this));
        mProgramingList.setAdapter(new ProgramingAdapter(languages));
    }
}