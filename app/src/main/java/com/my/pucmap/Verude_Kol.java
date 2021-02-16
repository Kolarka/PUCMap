package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Polyline;

public class Verude_Kol extends FragmentActivity implements OnMapReadyCallback,
        View.OnClickListener, GoogleMap.OnPolylineClickListener {
    private GoogleMap verud_sijd;
    private Button dir_A_verudsij;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verude__kol);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_verudsij);
        mapFragment.getMapAsync(this);

        dir_A_verudsij = findViewById(R.id.Dir_A);
        dir_A_verudsij.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_A:
                startActivity(new Intent(Verude_Kol.this, Kol_Verudela.class));
                break;
        }

    }

    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}