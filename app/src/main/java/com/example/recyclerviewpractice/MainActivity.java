package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewpractice.model.ContactModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<ContactModel> arrayOfContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerContact);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayOfContact.add(new ContactModel(R.drawable.girl1, "A", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl2, "B", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl3, "C", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl4, "D", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl5, "E", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl1, "F", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl2, "G", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl3, "H", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl4, "I", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl5, "J", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl1, "K", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl2, "L", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl3, "M", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl4, "N", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl5, "O", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl1, "P", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl2, "Q", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl3, "R", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl4, "S", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl5, "T", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl1, "U", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl2, "V", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl3, "W", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl4, "X", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl5, "Y", "9898989"));
        arrayOfContact.add(new ContactModel(R.drawable.girl5, "Z", "9898989"));

    }
}