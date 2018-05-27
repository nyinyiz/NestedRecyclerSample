package com.nwt.nestedrecyclersample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nwt.nestedrecyclersample.R;
import com.nwt.nestedrecyclersample.viewholder.UpperRecyclerViewHolder;

public class UpperRecyclerViewAdapter extends RecyclerView.Adapter<UpperRecyclerViewHolder> {


    @NonNull
    @Override
    public UpperRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_with_rv,parent,false);
        return new UpperRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UpperRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
