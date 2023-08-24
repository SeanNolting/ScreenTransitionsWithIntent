package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*create a method that can be called when the user clicks on the button
    In order for this method to be called, It MUST have a specific method signature
     must be public void must take only one parameter of type View
     */
    public void switchScreens(View v)
    {
        //first make reference to the edit text by locating it with its id
        EditText nameET = findViewById(R.id.name_text);
        //Use the reference to extract the text and save it into a String var
        //getText() returns an editable not a string so we call
        //toString to make it string
        String name = nameET.getText().toString();

        EditText ageET = findViewById(R.id.age_text);
        String age = ageET.getText().toString(); //We will learn to make numeric later

        EditText hobbyET = findViewById(R.id.hobby_text);
        String hobby = hobbyET.getText().toString();

        String fullText = name +", " + age + "\n" + hobby;

        //First param is searchable tag, second is what you are logging
        Log.i("Hello", "First Screen:" + fullText);

        /*
        To switch screens we need to create an intent. tell it where to go
        put data into it(optional)
        startActivity to actually launch the intent (go to other screen)

        (Make package, address it, stuff it, mail it)
         */
        //coming from this screen going to ShowInfoActivity
        Intent intent = new Intent(this, ShowInfoActivity.class);

        //optional you don't have to put anything in the intent
       //intent.putExtra("FULLTEXT", fullText);

        //Adding a new intent which is the name
        intent.putExtra("NAMETEXT", name );
        intent.putExtra("AGETEXT", age);
        intent.putExtra("HOBBYTEXT", hobby);

        //launch a new screen
        startActivity(intent);
    }

}