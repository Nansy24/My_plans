package com.nansymarionkina.myplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        RecyclerView rcViewTravel = findViewById(R.id.rc_view_travel);
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        rcViewTravel.setLayoutManager(glm);
        rcViewTravel.hasFixedSize();

        Travel[] listCities = {
                new Travel("Baycal", R.drawable.baycal),
                new Travel("London", R.drawable.london),
                new Travel("New York", R.drawable.new_york),
                new Travel("Paris", R.drawable.paris)
        };

        TravelAdapter rcTravelAdapter = new TravelAdapter(listCities);
        rcViewTravel.setAdapter(rcTravelAdapter);
    }
}