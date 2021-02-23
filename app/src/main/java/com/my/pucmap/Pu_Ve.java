package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pu_Ve extends FragmentActivity implements View.OnClickListener {

    private Button dir_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu__ve);

        dir_b = findViewById(R.id.Dir_B);
        dir_b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_B:
                startActivity(new Intent(Pu_Ve.this, Ve_Pu.class));
                break;
        }
    }
}