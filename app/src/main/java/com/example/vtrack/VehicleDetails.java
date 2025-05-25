package com.example.vtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.example.vtrack.databinding.ActivityLoginBinding;
import com.example.vtrack.databinding.ActivityVehicleDetailsBinding;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VehicleDetails extends AppCompatActivity {
    ActivityVehicleDetailsBinding binding;
    Handler handler;
    int RandomNum;
    String min="50", max="65";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_vehicle_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Binding
        binding = ActivityVehicleDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = getPackageManager().getLaunchIntentForPackage("com.appstock.vehicletracking");
                startActivity(intent1);
            }
        });

       RunEverySecond();

    }

    public void RunEverySecond(){
        handler=new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 3000);
                RandomNum = ThreadLocalRandom.current().nextInt(55, 65+1);
                binding.tvSpeed.setText(String.valueOf(RandomNum));
            }
        };
        handler.post(run);
    }
}