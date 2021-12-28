package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Food_List_Activity extends AppCompatActivity {
    RecyclerView food_list_rec;
    ArrayList<Food_Details> food_Details =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        food_list_rec=findViewById(R.id.food_list_rec);
        food_Details.add(new Food_Details(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        food_Details.add(new Food_Details(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        food_Details.add(new Food_Details(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        food_Details.add(new Food_Details(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        Food_Adapter_Activity adapter= new Food_Adapter_Activity(food_Details);
        RecyclerView.LayoutManager manager=new GridLayoutManager( this, 2);
        food_list_rec.setHasFixedSize(true);
        food_list_rec.setLayoutManager(manager);
        food_list_rec.setAdapter(adapter);
    }

}




