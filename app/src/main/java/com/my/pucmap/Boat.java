package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class Boat extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {
    private RelativeLayout rel_puzd;
    private RelativeLayout rel_briju;
    private RelativeLayout rel_frat;
    private RelativeLayout rel_ven;

    private GoogleMap boat_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        rel_puzd = findViewById(R.id.Pu_Zd);
        rel_puzd.setOnClickListener(this);
        rel_briju =findViewById(R.id.Pu_brij);
        rel_briju.setOnClickListener(this);
        rel_frat = findViewById(R.id.pu_fra);
        rel_frat.setOnClickListener(this);
        rel_ven = findViewById(R.id.pu_ve);
        rel_ven.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Pu_Zd:
                startActivity(new Intent(Boat.this, Pu_Zd.class));
                break;
            case R.id.Pu_brij:
                startActivity(new Intent(Boat.this, Pu_Brij.class));
                break;
            case R.id.pu_fra:
                startActivity(new Intent(Boat.this, Pu_Fra.class));
                break;
            case R.id.pu_ve:
                startActivity(new Intent(Boat.this, Pu_Ve.class));
                break;
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        boat_map = googleMap;

        // Add a marker in Pula and move the camera
        LatLng pula = new LatLng(44.87495729746017, 13.846417207372719);
        boat_map.moveCamera(CameraUpdateFactory.newLatLngZoom(pula, 16));

    }
}