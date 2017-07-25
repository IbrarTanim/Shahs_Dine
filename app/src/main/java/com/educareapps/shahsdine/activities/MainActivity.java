package com.educareapps.shahsdine.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.educareapps.shahsdine.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MainActivity activity;
    ImageButton ibtnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        ibtnInfo = (ImageButton) findViewById(R.id.ibtnInfo);
        ibtnInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibtnInfo:
                Intent intent = new Intent(activity, DescriptionActivity.class);
                startActivity(intent);

                break;

            /*case R.id.ibtnInfo:
                break;*/

        }
    }
}
