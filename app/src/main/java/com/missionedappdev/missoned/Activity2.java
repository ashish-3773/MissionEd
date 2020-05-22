package com.missionedappdev.missoned;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ArrayList<physics_item> physics_itemArrayList = new ArrayList<>();
        physics_itemArrayList.add(new physics_item("chapter 1", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 2", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 3", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 4", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 5", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 6", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 7", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 8", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 9", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 10", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 11", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 12", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 13", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 14", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 15", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 1", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 2", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 3", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 4", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 5", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 6", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 7", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 8", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 9", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 10", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 11", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 12", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 13", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 14", R.drawable.ic_check_box));
        physics_itemArrayList.add(new physics_item("chapter 15", R.drawable.ic_check_box));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new physics_itemAdapter(physics_itemArrayList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
