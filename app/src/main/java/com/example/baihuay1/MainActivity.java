package com.example.baihuay1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baihuay1.model.Huay;
import com.example.baihuay1.model.Huay;

public class MainActivity extends AppCompatActivity {
    private Huay huay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        huay = new Huay();
        Button btn1 = (Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Activity_Detail.class);
                intent.putExtra("text", "เลขท้าย 2 ตัว");
                intent.putExtra("huay", huay.getRandomTwoDigits());
                startActivity(intent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Detail.class);
                intent.putExtra("text", "เลขท้าย 3 ตัว");
                intent.putExtra("huay", huay.getRandomThreeDigits());
                startActivity(intent);
            }
        });
    }
}