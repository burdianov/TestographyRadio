package com.testography.testographyradio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.testography.testographyradio.R;
import com.testography.testographyradio.model.Station;

public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mMainImage;
    private TextView mTitleTextView;

    public StationViewHolder(View itemView) {
        super(itemView);

        mMainImage = (ImageView) itemView.findViewById(R.id.main_image);
        mTitleTextView = (TextView) itemView.findViewById(R.id.main_text);
    }

    public void updateUI(Station station) {
        String uri = station.getImgUri();
        int resource = mMainImage.getResources().getIdentifier(uri, null,
                mMainImage.getContext().getPackageName());
        mMainImage.setImageResource(resource);

        mTitleTextView.setText(station.getStationTitle());
    }
}
