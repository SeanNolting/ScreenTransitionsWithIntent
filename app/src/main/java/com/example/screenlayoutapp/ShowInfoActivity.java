package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        //open the intent to get the data when the screen loads
        Intent intent = getIntent();

        //Changed this from ALL the text to only the name
        String receivedNameText = intent.getStringExtra("NAMETEXT");
        String receivedAgeText = intent.getStringExtra("AGETEXT");
        String receivedHobbyText = intent.getStringExtra("HOBBYTEXT");

        //log to see if it was received
        Log.i("Sean", "received :" + receivedNameText);
        Log.i("Sean", "received :" + receivedAgeText);
        Log.i("Sean", "received :" + receivedHobbyText);


        //get a reference to the text view
        //set the text of the text view

        //Changed this from the all the text to just the name
        TextView infoTV = findViewById(R.id.nameTextView);
        infoTV.setText(receivedNameText);

        TextView ageTV = findViewById(R.id.ageTextView);
        ageTV.setText(receivedAgeText);

        TextView hobbyTV = findViewById(R.id.hobbyTextView);
        hobbyTV.setText(receivedHobbyText);

        //ADD two more text views for age and hobby
        //box them individually and send them individually
        //style them
    }
}