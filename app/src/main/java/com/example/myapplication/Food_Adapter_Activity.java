package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

public class Food_Adapter_Activity extends RecyclerView.Adapter<Food_Adapter_Activity.FoodViewHolder> {
    private ArrayList<Food_Details> foodDetails =new ArrayList<Food_Details>();

    public Food_Adapter_Activity(ArrayList<Food_Details> foodDetails) {
        this.foodDetails = foodDetails;
    }

    public Food_Adapter_Activity() {
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_adapter_rec, null,false);
        FoodViewHolder viewHolder = new FoodViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food_Details f= foodDetails.get(position);
        holder.image.setImageResource(f.getImg());
        holder.food_name.setText(f.getName());
        holder.food_type.setText(f.getType());
        holder.calories.setText(f.getCalory());



    }

    @Override
    public int getItemCount() {
        return foodDetails.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{
        ImageView image ;
        TextView food_name, food_type, calories;
         Button edit;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.imge);
            food_name=itemView.findViewById(R.id.food_name);
            food_type=itemView.findViewById(R.id.food_type);
            calories=itemView.findViewById(R.id.calories);
            edit=itemView.findViewById(R.id.edit);
        }
    }
}
