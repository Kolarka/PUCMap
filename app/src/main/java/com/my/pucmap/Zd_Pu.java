package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Zd_Pu extends FragmentActivity implements View.OnClickListener {

    private Button directi_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zd__pu);

        directi_a = findViewById(R.id.Dir_A);
        directi_a.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_A:
                startActivity(new Intent(Zd_Pu.this, Pu_Zd.class));
                break;
        }

    }
}