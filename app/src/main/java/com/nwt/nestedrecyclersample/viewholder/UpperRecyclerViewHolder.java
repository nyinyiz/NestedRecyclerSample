package com.nwt.nestedrecyclersample.viewholder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nwt.nestedrecyclersample.R;
import com.nwt.nestedrecyclersample.adapter.LowerRecyclerViewAdapter;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UpperRecyclerViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rv_lower_view)
    RecyclerView rvLowerView;
    @BindView(R.id.tv_title)
    TextView tvTitle;

    public UpperRecyclerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

        rvLowerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false));
        rvLowerView.setAdapter(new LowerRecyclerViewAdapter());

    }
}
