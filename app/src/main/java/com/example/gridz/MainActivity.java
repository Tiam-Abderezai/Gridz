package com.example.gridz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    List<String> textList = new ArrayList<>();
    List<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        imageList.add(R.drawable.smile);
        imageList.add(R.drawable.bmw);
        imageList.add(R.drawable.zanzibar);
        imageList.add(R.drawable.icecream);

        textList.add("Smile");
        textList.add("BMW");
        textList.add("Zanzibar");
        textList.add("Icecream");


        mRecyclerView.setAdapter(new GridAdapter(textList, imageList));

    }

}
