package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        //open the intent to get the data when the screen loads
        Intent intent = getIntent();
        String receivedFullTet = intent.getStringExtra("FULLTEXT");
        //log to see if it was recived

        //finish tommorow
        Log.i("Sean", "recived" + );
    }
}