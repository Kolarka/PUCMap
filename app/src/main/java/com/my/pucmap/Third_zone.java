package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class Third_zone extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map_third_z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_zone);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_zone_three);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map_third_z = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng pula = new LatLng(44.86726450096342, 13.850460687162476);
        map_third_z.moveCamera(CameraUpdateFactory.newLatLngZoom(pula, 13));

    }
}