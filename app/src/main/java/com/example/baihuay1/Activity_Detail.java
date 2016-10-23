package com.example.baihuay1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Chanut on 10/23/2016.
 */
public class Activity_Detail extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Intent intent = getIntent();
        String str = intent.getStringExtra("text");
        String baiHauy = intent.getStringExtra("huay");

        TextView text = (TextView) findViewById(R.id.textView1);
        text.setText(str);
        TextView huay1 = (TextView) findViewById(R.id.textView2);
        huay1.setText(baiHauy);
    }
}

