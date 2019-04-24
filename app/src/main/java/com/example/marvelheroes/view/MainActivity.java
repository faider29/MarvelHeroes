package com.example.marvelheroes.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.marvelheroes.R;
import com.example.marvelheroes.adapter.MainAdapter;

public class MainActivity
        extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(
                R.layout.ac_main);

        mRecyclerView.findViewById(
                R.id.rv_main);
        mRecyclerView.setAdapter(
                mAdapter);




    }
}
