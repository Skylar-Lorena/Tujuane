package com.skylar.tujuane;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;
    @BindView(R.id.locationEditText)
    EditText mLocationEditText;
    @BindView(R.id.findActivityButton)
    Button findActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}