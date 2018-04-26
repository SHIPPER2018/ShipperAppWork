package com.example.shipperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class ShipperOrCarrierActivity extends AppCompatActivity {

    final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        // myRef.setValue("Hello, World - Testing!"); // --> test conn. to DB

        //JAVA to JSON - Carrier
        Carrier carrier_test = new Carrier(10000, "he", "hello2","hello3","hello4","hello5");
        Gson gsonObj_java_to_json = new Gson();
        String jsonStrJson = gsonObj_java_to_json.toJson(carrier_test); // converts object to json string
        myRef.setValue(jsonStrJson); // Push object to Firebase

        // JSON string to JAVA Object - Carrier
        Gson gson = new Gson();
        String jsonInString = jsonStrJson;
        Carrier carrier_json_str_to_java= gson.fromJson(jsonInString, Carrier.class);
        Gson gsonObj_json_to_java = new Gson();
        String jsonStrJava = gsonObj_json_to_java.toJson(carrier_json_str_to_java); // converts object to json string
        myRef.setValue(jsonStrJava);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.

                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipper_or_carrier);

        Button shipperButton = (Button) findViewById(R.id.shipperButton);
        shipperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentIsAShipper = new Intent(ShipperOrCarrierActivity.this , ShippCat.class);
                startActivity(intentIsAShipper);
            }

        });

        Button carrierButton = (Button) findViewById(R.id.carrierButton);
        carrierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentIsACarrier = new Intent(ShipperOrCarrierActivity.this , CarrLogSignIn.class);
                startActivity(intentIsACarrier);
            }

        });
    }


}
