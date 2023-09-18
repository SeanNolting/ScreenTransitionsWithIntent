package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        Intent intent = getIntent();
        String receivedNameText = intent.getStringExtra("NAMETEXT");
        Log.i("Sean", "received :" + receivedNameText);
        TextView infoTV = findViewById(R.id.nameTextView);
        infoTV.setText(receivedNameText);
    }
    public void slideLeft(View v)
    {
        EditText lastNameET = findViewById(R.id.lastName);
        String name = lastNameET.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("LASTNAMETEXT", name );
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out);
    }
    public void fadeOut(View v)
    {
        EditText lastNameET = findViewById(R.id.lastName);
        String name = lastNameET.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("LASTNAMETEXT", name);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }
}