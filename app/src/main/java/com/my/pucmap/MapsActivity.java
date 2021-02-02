package com.my.pucmap;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private ImageButton directions_bike;
    private ImageButton directions_bus;
    private ImageButton local_parking;
    private ImageButton local_taxi;
    private ImageButton directions_boat;
    private RelativeLayout get_home;
    private RelativeLayout get_work;
    private RelativeLayout get_me_some;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        directions_bike = findViewById(R.id.directions_bike_button);
        directions_bike.setOnClickListener(this);
        directions_bus = findViewById(R.id.directions_bus_button);
        directions_bus.setOnClickListener(this);
        local_parking = findViewById(R.id.local_parking_button);
        local_parking.setOnClickListener(this);
        local_taxi = findViewById(R.id.local_taxi_button);
        local_taxi.setOnClickListener(this);
        directions_boat = findViewById(R.id.directions_boat_button);
        directions_boat.setOnClickListener(this);
        get_home = findViewById(R.id.get_me_home);
        get_home.setOnClickListener(this);
        get_work = findViewById(R.id.get_me_work);
        get_work.setOnClickListener(this);
        get_me_some = findViewById(R.id.relLayout);
        get_me_some.setOnClickListener(this);


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.directions_bike_button:
                startActivity(new Intent(MapsActivity.this, Bike.class));
                break;
            case R.id.directions_bus_button:
                startActivity(new Intent(MapsActivity.this, Bus.class));
                break;
            case R.id.local_parking_button:
                startActivity(new Intent(MapsActivity.this, Parking.class));
                break;
            case R.id.local_taxi_button:
                startActivity(new Intent(MapsActivity.this, Taxi.class));
                break;
            case R.id.directions_boat_button:
                startActivity(new Intent(MapsActivity.this, Boat.class));
                break;
            case R.id.get_me_home:
                startActivity(new Intent(MapsActivity.this, Get_Me_Home.class));
                break;
            case R.id.get_me_work:
                startActivity(new Intent(MapsActivity.this, Get_Me_Work.class));
                break;
            case R.id.relLayout:
                startActivity(new Intent(MapsActivity.this, Get_Me_Somewhere.class));
                break;


        }
    }
}