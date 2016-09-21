package com.example.kevin.sanguoshaenglish;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartingActivity extends AppCompatActivity {
    private Context mContext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

    }

    public void regularBut(View view){
        nextPage(0);
    }
    public void kingdomWarsBut(View view){
        nextPage(1);
    }

    public void nextPage(int index){
        Intent myIntent = new Intent(StartingActivity.this,MainActivity.class);
        myIntent.putExtra("choice",index);
        startActivity(myIntent);
    }
}
