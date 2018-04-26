package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShippCat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipp_cat);

        Button charPackageButton = (Button) findViewById(R.id.charPackageButton);
        charPackageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentToChatPackage = new Intent(ShippCat.this , CharPackage.class);
                startActivity(intentToChatPackage);
            }

        });
    }
}
