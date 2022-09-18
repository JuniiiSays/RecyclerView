package com.example.recyclerviewpractice.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractice.R;

import org.w3c.dom.Text;

class ProgramingAdapter extends RecyclerView.Adapter<ProgramingAdapter.ProgramingViewHolder> {

    String[] data;

    public ProgramingAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProgramingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgramingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramingViewHolder holder, int position) {
        String title = data[position];
        holder.listItemTextView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgramingViewHolder extends RecyclerView.ViewHolder{

        ImageView listItemImageView;
        TextView listItemTextView;

        public ProgramingViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemImageView = itemView.findViewById(R.id.list_item_image_view);
            listItemTextView = itemView.findViewById(R.id.list_item_text_view);
        }
    }

}
