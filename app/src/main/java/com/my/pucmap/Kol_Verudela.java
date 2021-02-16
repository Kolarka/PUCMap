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

public class Kol_Verudela extends FragmentActivity implements OnMapReadyCallback,
        View.OnClickListener, GoogleMap.OnPolylineClickListener {

    private GoogleMap kol_verud;
    private Button dir_b_verud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kol__verudela);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_kolverud);
        mapFragment.getMapAsync(this);

        dir_b_verud = findViewById(R.id.Dir_B);
        dir_b_verud.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_B:
                startActivity(new Intent(Kol_Verudela.this, Verude_Kol.class));
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