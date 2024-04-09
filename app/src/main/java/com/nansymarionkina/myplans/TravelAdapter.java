package com.nansymarionkina.myplans;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.TravelViewHolder>{

    private final Travel[] travelCities;

    public TravelAdapter(Travel[] travelCities) {
        this.travelCities = travelCities;
    }

    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_travel, parent, false);
        return new TravelViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, int position) {
        holder.bind(travelCities[position]);
    }


    @Override
    public int getItemCount() {
        return travelCities.length;
    }

    static class TravelViewHolder extends RecyclerView.ViewHolder {

        ImageView imageTravel;
        TextView textTravel;
        public TravelViewHolder(@NonNull View itemView) {
            super(itemView);
            imageTravel = itemView.findViewById(R.id.item_image_view_travel);
            textTravel = itemView.findViewById(R.id.text_view_item_travel);
        }

        public void bind(Travel travel) {
            imageTravel.setImageResource(travel.imageId);
            textTravel.setText(travel.city);
        }
    }
}
