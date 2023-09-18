package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String receivedlastNameText = intent.getStringExtra("LASTNAMETEXT");
        TextView infoTV = findViewById(R.id.lastNameTxtV);
        infoTV.setText(receivedlastNameText);
    }
    public void slideRight(View v)
    {
        EditText nameET = findViewById(R.id.name_text);

        String name = nameET.getText().toString();
        String fullText = name;
        Log.i("Hello", "First Screen:" + fullText);
        Intent intent = new Intent(this, ShowInfoActivity.class);
        intent.putExtra("NAMETEXT", name );
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out);
    }
    public void fadeIn(View v)
    {
        EditText nameET = findViewById(R.id.name_text);

        String name = nameET.getText().toString();
        String fullText = name;

        Log.i("Hello", "First Screen:" + fullText);

        Intent intent = new Intent(this, ShowInfoActivity.class);

        //Adding a new intent which is the name
        intent.putExtra("NAMETEXT", name );
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }


}