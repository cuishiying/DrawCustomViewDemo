package com.irelint.drawcustomviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.irelint.drawcustomviewdemo.demo.DrawCustomViewDemo;
import com.irelint.drawcustomviewdemo.demo.MyListViewDemo;
import com.irelint.drawcustomviewdemo.demo.TitleViewDemo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = (TextView)findViewById(R.id.tv1);
        TextView tv2 = (TextView)findViewById(R.id.tv2);
        TextView tv3 = (TextView)findViewById(R.id.tv3);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv1:
                startActivity(new Intent(this, DrawCustomViewDemo.class));
                break;
            case R.id.tv2:
                startActivity(new Intent(this, TitleViewDemo.class));
                break;
            case R.id.tv3:
                startActivity(new Intent(this, MyListViewDemo.class));
                break;
        }
    }
}
