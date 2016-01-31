package com.example.loc.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.loc.library.AsymmetricRecyclerView;
import com.example.loc.library.AsymmetricRecyclerViewAdapter;
import com.example.loc.library.Utils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AsymmetricRecyclerView recyclerView;

    //    private final DemoUtils demoUtils = new DemoUtils();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (AsymmetricRecyclerView) findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter((ArrayList<item>) moarItems(60));

        recyclerView.setRequestedColumnCount(3);
        recyclerView.setDebugging(true);
        recyclerView.setRequestedHorizontalSpacing(Utils.dpToPx(this, 3));
        recyclerView.addItemDecoration(
                new SpacesItemDecoration(getResources().getDimensionPixelSize(R.dimen.recycler_padding)));

        recyclerView.setAdapter(new AsymmetricRecyclerViewAdapter<>(this, recyclerView, adapter));
    }

    public void Arraylist() {


    }

    public List<item> moarItems(int qty) {
        List<item> items = new ArrayList<>();
        int currentOffset = 0;
        for (int i = 0; i < qty; i++) {
            int colSpan = Math.random() < 0.2f ? 2 : 1;
            //số dòng bằng số cột
            int rowSpan = colSpan;
            item item = new item(colSpan, rowSpan, currentOffset + i);
            items.add(item);
        }

        currentOffset += qty;

        return items;
    }
}

