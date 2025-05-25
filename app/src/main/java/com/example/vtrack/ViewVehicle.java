package com.example.vtrack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.vtrack.Adapters.CarAdapter;
import com.example.vtrack.Models.CarModel;


import java.util.ArrayList;

public class ViewVehicle extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_vehicle);

        recyclerView = findViewById(R.id.recyclerView);

        // Toolbar back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayList <CarModel> list = new ArrayList<>();
        list.add(new CarModel(R.drawable.car_swift, "Swift Dezire","MH40V7215", "Akash_Patils Company", "98/104, Dadiseth Agiary Lane, Kalbadevi"));
        list.add(new CarModel(R.drawable.car_bulero,"Bulero", "WP1AC2965", "Ranjan_Sheikh Company", "8, Market, Behind Sangam Cinema, R K Puram"));
        list.add(new CarModel(R.drawable.car_volks, "Volks Vogan","TRT2A5101", "VehiBandra Company", "2nd FLR, 201/203, Narshi Natha Street, Masjid Bunder (east)"));
        list.add(new CarModel(R.drawable.car_alto, "Alto","WA10GA1058", "Columbus_State Company", "Arshiwala Bldg, 59 Wodehouse Road, Colaba"));
        list.add(new CarModel(R.drawable.car_swift2,"Swift Dezire", "JH4KA3140", "AK Tripathi Company", "112, Sati Indl Estate, I B Patel Rd, Goregaon (east)"));

        CarAdapter carAdapter = new CarAdapter(list, this);
        recyclerView.setAdapter(carAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch(position){
                    case 0:
//                        Toast.makeText(ViewVehicle.this, "Vehicle 1", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), VehicleDetails.class));
                        break;
                    case 1:
                        Toast.makeText(ViewVehicle.this, "Vehicle 2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(ViewVehicle.this, "Vehicle 3", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(ViewVehicle.this, "Vehicle 4", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(ViewVehicle.this, "Vehicle 5", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }
        ));
    }
}