package com.testography.testographyradio.model;

public class Station {

    final String DRAWABLE = "drawable/";

    private String mStationTitle;
    private String mImgUri;

    public Station(String stationTitle, String imgUri) {
        mStationTitle = stationTitle;
        mImgUri = imgUri;
    }

    public String getStationTitle() {
        return mStationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + mImgUri;
    }
}
