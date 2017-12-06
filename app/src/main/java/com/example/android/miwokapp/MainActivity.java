package com.example.android.miwokapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInestenceState){
        super.onCreate(savedInestenceState);
        setContentView(R.layout.activity_main);

        // Create Obj from all TextViews
        TextView numbersView = findViewById(R.id.numbers);
        TextView familyView = findViewById(R.id.family);
        TextView colorsView = findViewById(R.id.colors);
        TextView phrasesView = findViewById(R.id.phrases);
        /**
         * This method to move to numbers Activity
         */
        numbersView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                Intent toNumbers = new Intent(MainActivity.this ,NumbersActivity.class);
                startActivity(toNumbers);
            }
        });

        /**
         * This method to move to Family Activity
         */

        familyView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent toFamilyMembers = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(toFamilyMembers);
            }
        });

        /**
         * This method to move to numbers Activity
         */

        phrasesView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent toPhrases = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(toPhrases);
            }
        });

        /**
         * This method to move to numbers Activity
         */

        colorsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent toColors = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(toColors);
            }
        });




    }



}