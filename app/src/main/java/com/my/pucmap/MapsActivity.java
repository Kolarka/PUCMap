package com.my.pucmap;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.my.pucmap.R.id.directions_bike_button;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private ImageButton directions_bike;
    private ImageButton directions_bus;
    private ImageButton local_parking;
    private ImageButton local_taxi;
    private ImageButton directions_boat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        directions_bike = findViewById(directions_bike_button);
        directions_bike.setOnClickListener(this);
        directions_bus = findViewById(R.id.directions_bus_button);
        directions_bus.setOnClickListener(this);
        local_parking = findViewById(R.id.local_parking_button);
        local_parking.setOnClickListener(this);
        local_taxi = findViewById(R.id.local_taxi_button);
        local_taxi.setOnClickListener(this);
        directions_boat = findViewById(R.id.directions_boat_button);
        directions_boat.setOnClickListener(this);


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

        }
    }
}