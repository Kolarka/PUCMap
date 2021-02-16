package com.my.pucmap;


import androidx.fragment.app.FragmentActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Bus extends FragmentActivity implements View.OnClickListener {
    private RelativeLayout bus_one;
    private RelativeLayout bus_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        bus_one = findViewById(R.id.lay_stoj_kol);
        bus_one.setOnClickListener(this);
        bus_two = findViewById(R.id.rel_layout4);
        bus_two.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lay_stoj_kol:
                startActivity(new Intent(Bus.this, Kol_stoja.class));
                break;
            case R.id.rel_layout4:
                startActivity(new Intent(Bus.this, Kol_Verudela.class));
                break;

        }

    }
}