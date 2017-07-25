package com.educareapps.shahsdine.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.educareapps.shahsdine.R;

public class DescriptionActivity extends AppCompatActivity implements View.OnClickListener {
    DescriptionActivity activity;
    Button btnDescription;
    ImageButton ibtnBackDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        activity = this;
        btnDescription = (Button) findViewById(R.id.btnDescription);
        ibtnBackDescription = (ImageButton) findViewById(R.id.ibtnBackDescription);
        btnDescription.setOnClickListener(this);
        ibtnBackDescription.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDescription:
                Intent intent = new Intent(activity, SliderActivity.class);
                startActivity(intent);
                break;
            case R.id.ibtnBackDescription:
                startActivity(new Intent(activity, MainActivity.class));
                finish();
                break;


        }
    }
}
