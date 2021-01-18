package com.skylar.tembeakenya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.skylar.tembeakenya.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    private EditText mLocationEditText;
    private Button mFindActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFindActivityButton = (Button) findViewById(R.id.findActivityButton);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindActivityButton.setOnClickListener(this);
    }


    public void onClick(View face) {
        if (face == mFindActivityButton) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, secondaryActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }

}