package com.skylar.tembeakenya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.skylar.tembeakenya.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class secondaryActivity extends AppCompatActivity {
    @BindView(R.id.secondaryActivityTitle)
    TextView mSecondaryActivityTitle;
    @BindView(R.id.listActivity)
    ListView mListActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        ButterKnife.bind(this);
    }
}