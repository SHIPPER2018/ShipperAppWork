package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarrLogSignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carr_log_sign_in);

        Button carrWorkPlanButton = (Button) findViewById(R.id.carrWorkPlanButton);
        carrWorkPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentCarrWorkPlan = new Intent(CarrLogSignIn.this , CarrWorkPlan.class);
                startActivity(intentCarrWorkPlan);
            }

        });
    }
}
