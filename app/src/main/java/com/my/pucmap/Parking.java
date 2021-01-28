package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Parking extends AppCompatActivity implements View.OnClickListener {
    private Button zone_one;
    private Button zone_two;
    private Button zone_three;
    private Button SMS;
    private Button slots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        zone_one = findViewById(R.id.first_zone);
        zone_one.setOnClickListener(this);
        zone_two = findViewById(R.id.second_zone);
        zone_two.setOnClickListener(this);
        zone_three = findViewById(R.id.third_zone);
        zone_three.setOnClickListener(this);
        SMS = findViewById(R.id.SMS_parking);
        SMS.setOnClickListener(this);
        slots = findViewById(R.id.slots_btn);
        slots.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.first_zone:
                startActivity(new Intent(Parking.this, First_zone.class));
                break;
            case R.id.second_zone:
                startActivity(new Intent(Parking.this, Second_zone.class));
                break;
            case R.id.third_zone:
                startActivity(new Intent(Parking.this, Third_zone.class));
                break;
            case R.id.SMS_parking:
                startActivity(new Intent(Parking.this, SMS_parking.class));
                break;
            case R.id.slots_btn:
                startActivity(new Intent(Parking.this, Slots.class));
                break;
        }
    }
}