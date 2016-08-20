package com.testography.testographyradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testography.testographyradio.R;
import com.testography.testographyradio.activities.MainActivity;
import com.testography.testographyradio.holders.StationViewHolder;
import com.testography.testographyradio.model.Station;

import java.util.ArrayList;

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> mStations;

    public StationsAdapter(ArrayList<Station> stations) {
        mStations = stations;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R
                        .layout.card_station,
                parent, false);

        return new StationViewHolder(stationCard);
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, final int position) {
        final Station station = mStations.get(position);
        holder.updateUI(station);

        final int p = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Load the details
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStations.size();
    }
}
