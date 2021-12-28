package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.*;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BMI_Records_Adapter_Activity extends RecyclerView.Adapter<BMI_Records_Adapter_Activity.BMIViewHolder> {
    ArrayList<BMI_Record_Activity> records=new ArrayList<BMI_Record_Activity>();
    Context context;

    public BMI_Records_Adapter_Activity(ArrayList<BMI_Record_Activity> records,Context context) {
        this.records = records;
        this.context=context;
    }


    public BMI_Records_Adapter_Activity() {
    }

    @NonNull
    @Override
    public BMIViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.bmi_record_adapter, null, false);
        BMIViewHolder viewHolder = new BMIViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BMIViewHolder holder, int position) {
      BMI_Record_Activity bmi_record= records.get(position);
        holder.date.setText(bmi_record.getDate());
        holder.weight.setText(Double.toString(bmi_record.getWeight()));
        holder.status.setText(bmi_record.getStatus());
        holder.length.setText(bmi_record.getLength());

    }

    @Override
    public int getItemCount() {
        return records.size();

    }

    class BMIViewHolder extends RecyclerView.ViewHolder{
        TextView date;
        TextView weight;
        TextView status;
        TextView length;


        public BMIViewHolder(@NonNull View itemView) {
            super(itemView);
            date=itemView.findViewById(R.id.date);
            weight=itemView.findViewById(R.id.weight);
            status=itemView.findViewById(R.id.status);
            length=itemView.findViewById(R.id.length);
        }
    }
}
