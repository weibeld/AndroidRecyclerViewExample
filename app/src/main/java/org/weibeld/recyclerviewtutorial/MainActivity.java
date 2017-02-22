package org.weibeld.recyclerviewtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    public ArrayList<String> mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mData = generateData();

        // Set adapter for the RecyclerView
        mAdapter = new MyItemAdapter(mData);
        mRecyclerView.setAdapter(mAdapter);

        // Set LayoutManager for the RecyclerView
        mLayoutManager = new LinearLayoutManager(this);
        //mLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        //mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    private ArrayList<String> generateData() {
        ArrayList<String> data = new ArrayList<>();
        data.add("Android 1");
        data.add("Android 2");
        data.add("Android 3");
        data.add("Android 4");
        data.add("Android 5");
        data.add("Android 6");
        data.add("Android 7");
        data.add("Android 8");
        data.add("Android 9");
        data.add("Android 10");
        data.add("Android 11");
        data.add("Android 12");
        data.add("Android 13");
        data.add("Android 14");
        data.add("Android 15");
        data.add("Android 16");
        data.add("Android 17");
        data.add("Android 18");
        data.add("Android 19");
        data.add("Android 20");
        data.add("Android 21");
        data.add("Android 22");
        data.add("Android 23");
        data.add("Android 24");
        data.add("Android 25");
        data.add("Android 26");
        data.add("Android 27");
        data.add("Android 28");
        data.add("Android 29");
        data.add("Android 30");
        data.add("Android 31");
        data.add("Android 32");
        data.add("Android 33");
        data.add("Android 34");
        data.add("Android 35");
        data.add("Android 36");
        data.add("Android 37");
        data.add("Android 38");
        data.add("Android 39");
        data.add("Android 40");
        return data;
    }
}
