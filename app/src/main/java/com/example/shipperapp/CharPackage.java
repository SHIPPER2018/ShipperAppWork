package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CharPackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_package);

        Button shipPathButton = (Button) findViewById(R.id.shipPathButton);
        shipPathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToshipPathButton = new Intent(CharPackage.this , ShipPath.class);
                startActivity(intentToshipPathButton);
            }

        });
    }
}
