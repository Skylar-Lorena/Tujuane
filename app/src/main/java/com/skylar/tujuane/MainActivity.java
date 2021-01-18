package com.skylar.tujuane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;
    @BindView(R.id.locationEditText)
    EditText mLocationEditText;
    @BindView(R.id.findActivityButton)
    Button mFindActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFindActivityButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, secondaryActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}