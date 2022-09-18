package com.example.recyclerviewpractice.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ProgramingAdapter extends RecyclerView.Adapter<ProgramingAdapter.ProgramingViewHolder> {

    String[] data;

    public ProgramingAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProgramingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgramingViewHolder extends RecyclerView.ViewHolder{

        public ProgramingViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
