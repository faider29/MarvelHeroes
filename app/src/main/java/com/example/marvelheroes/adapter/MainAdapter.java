package com.example.marvelheroes.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maxim Andrienko Maxim
 * {4/24/19}
 */
public class MainAdapter
        extends RecyclerView.Adapter<
                MainAdapter
                .HeroesHolder> {




    @NonNull
    @Override
    public HeroesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,
                                           int i) {
        return null;
    }



    @Override
    public void onBindViewHolder(@NonNull HeroesHolder heroesHolder,
                                 int i) {

    }



    @Override
    public int getItemCount() {
        return 0;
    }



    public class HeroesHolder
            extends RecyclerView
                .ViewHolder {

        public HeroesHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
