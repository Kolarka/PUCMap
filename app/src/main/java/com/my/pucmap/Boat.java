package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

public class Boat extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {
    private RelativeLayout rel_puzd;
    private RelativeLayout rel_briju;
    private RelativeLayout rel_frat;
    private RelativeLayout rel_ven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat);


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

    }
}