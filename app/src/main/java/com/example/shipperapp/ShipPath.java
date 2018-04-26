package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShipPath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_path);

        Button shipLoginButton = (Button) findViewById(R.id.shipLoginButton);
        shipLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToShipLogin = new Intent(ShipPath.this , ShipLogin.class);
                startActivity(intentToShipLogin);
            }

        });
    }
}
