package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShipLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_login);

        Button shipOrderApprovalButton = (Button) findViewById(R.id.shipOrderApprovalButton);
        shipOrderApprovalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToShipOrderApproval = new Intent(ShipLogin.this , shipOrderApproval.class);
                startActivity(intentToShipOrderApproval);
            }

        });
    }
}
