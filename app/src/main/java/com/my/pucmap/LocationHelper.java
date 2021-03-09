package com.my.pucmap;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

public class LocationHelper {

    private GeoPoint geoPoint;

    public LocationHelper() {

    }

    public LocationHelper(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }
}
