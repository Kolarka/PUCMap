package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Brij_Pu extends FragmentActivity implements View.OnClickListener {
    private Button dir_a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brij__pu);

        dir_a = findViewById(R.id.Dir_A);
        dir_a.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_A:
                startActivity(new Intent(Brij_Pu.this, Pu_Brij.class));
                break;
        }

    }
}