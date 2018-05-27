package com.nwt.nestedrecyclersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nwt.nestedrecyclersample.adapter.UpperRecyclerViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_upper_view)
    RecyclerView rvUpperView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        rvUpperView.setLayoutManager(new LinearLayoutManager(this));
        rvUpperView.setAdapter(new UpperRecyclerViewAdapter());

    }

}
