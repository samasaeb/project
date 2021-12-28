package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Add_Food_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinner ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        spinner =findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> food_details = ArrayAdapter.createFromResource(this,
                R.array.categories, android.R.layout.simple_spinner_item);
        food_details .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(food_details );
        spinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), adapterView.getItemAtPosition(position).toString().toString()
, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> adapterView) {
            }
}