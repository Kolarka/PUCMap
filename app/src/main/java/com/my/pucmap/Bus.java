package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Bus extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout bus_one;
    private RelativeLayout bus_two;
    private RelativeLayout bus_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        bus_one = findViewById(R.id.relLay);
        bus_one.setOnClickListener(this);
        bus_two = findViewById(R.id.rel_layout4);
        bus_two.setOnClickListener(this);
        bus_three = findViewById(R.id.rel_layout_6);
        bus_three.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.relLay:
                startActivity(new Intent(Bus.this, Kol_stoja.class));
                break;
            case R.id.rel_layout4:
                startActivity(new Intent(Bus.this, Kol_Verudela.class));
                break;
            case R.id.rel_layout_6:
                startActivity(new Intent(Bus.this, Sijans_Verudela.class));
                break;
        }

    }
}