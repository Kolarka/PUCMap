package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class Bike extends FragmentActivity implements OnMapReadyCallback{
    private GoogleMap bike_map;
    private LatLng rent1 = new LatLng(44.87238925238926, 13.850799480767304);
    private LatLng rent2 = new LatLng(44.872371194523964, 13.849194178676013);
    private LatLng rent3 = new LatLng(44.85654700049942, 13.834163749905828);
    private LatLng rent4 = new LatLng(44.862068258567234, 13.864821398913923);
    private LatLng rent5 = new LatLng(44.862840127791856, 13.860556686639796);
    private LatLng rent6 = new LatLng(44.87005831529066, 13.848961497063426);
    private LatLng rent7 = new LatLng(44.8676341355889, 13.84790805945053);



    private MarkerOptions ren1_option;
    private MarkerOptions rent2_option;
    private MarkerOptions rent3_option;
    private MarkerOptions rent4_option;
    private MarkerOptions rent5_option;
    private MarkerOptions rent6_option;
    private MarkerOptions rent7_option;

    private List<MarkerOptions> markerOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_bike);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        bike_map = googleMap;
        bike_map.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        markerOptionsList = new ArrayList<>();

        ren1_option= new MarkerOptions().position(rent1)
                .title("T.O. Malupe")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(ren1_option);

        rent2_option= new MarkerOptions().position(rent2)
                .title("PARMULA RENT A CAR, SCOOTER & BIKE")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(rent2_option);

        rent3_option= new MarkerOptions().position(rent3)
                .title("Bike Planet")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(rent3_option);

        rent4_option= new MarkerOptions().position(rent4)
                .title("Buggy & bike adventures")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(rent4_option);

        rent5_option= new MarkerOptions().position(rent5)
                .title("Enduro Bikes & Stuff ")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(rent5_option);

        rent6_option= new MarkerOptions().position(rent6)
                .title("Bike Tours Istria")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(rent6_option);

        rent7_option= new MarkerOptions().position(rent7)
                .title("Valcic Cycling Concept")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(rent7_option);



        for (MarkerOptions options : markerOptionsList){
            LatLng latLng = new LatLng(options.getPosition().latitude, options.getPosition().longitude);
            bike_map.addMarker(options);
            bike_map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,15));
        }

    }
}