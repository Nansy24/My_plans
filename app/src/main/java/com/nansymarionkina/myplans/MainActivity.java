package com.nansymarionkina.myplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardViewTravel = findViewById(R.id.card_view_travel);
        cardViewTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTravel = new Intent(MainActivity.this, TravelActivity.class);
                startActivity(intentTravel);
            }
        });
        CardView cardViewToDoList = findViewById(R.id.card_view_to_do_list);
        cardViewToDoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ToDoListActivity.class);
                startActivity(i);
            }
        });
    }
}