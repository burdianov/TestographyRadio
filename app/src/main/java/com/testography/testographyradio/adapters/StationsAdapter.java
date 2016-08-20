package com.testography.testographyradio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
