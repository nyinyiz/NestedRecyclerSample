package com.nwt.nestedrecyclersample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nwt.nestedrecyclersample.R;
import com.nwt.nestedrecyclersample.viewholder.LowerRecyclerViewHolder;

public class LowerRecyclerViewAdapter extends RecyclerView.Adapter<LowerRecyclerViewHolder> {
    @NonNull
    @Override
    public LowerRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_lower,parent,false);
        return new LowerRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LowerRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
