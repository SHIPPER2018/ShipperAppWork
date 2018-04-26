package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarrWorkPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carr_work_plan);

        Button carrOrderApprovalButton = (Button) findViewById(R.id.carrOrderApprovalButton);
        carrOrderApprovalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentCarrOrderApprovalButton = new Intent(CarrWorkPlan.this , CarrOrderApproval.class);
                startActivity(intentCarrOrderApprovalButton);
            }

        });
    }
}
