package com.example.vtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CompanyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}