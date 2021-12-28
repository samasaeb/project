package com.example.myapplication;

import static com.example.myapplication.User.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity {
    static Home_Activity instance;
    TextView Hi_name;
    EditText status;
    Button add_food, add_record, view_food,logout;
    RecyclerView record_rec;
    BMI_Records_Adapter_Activity adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        record_rec = findViewById(R.id.record_rec);
        Hi_name = findViewById(R.id.txt_hi);
        status = findViewById(R.id.status);
        add_food = findViewById(R.id.add_food);
        add_record = findViewById(R.id.add_record);
        view_food = findViewById(R.id.view_food);
        logout = findViewById(R.id.logout);
        ArrayList<BMI_Record_Activity> records = new ArrayList<>();
        records.add(new BMI_Record_Activity("12/3/2020" ,2.15,    160, "Normal"));
        records.add(new BMI_Record_Activity("12/3/2020" ,2.15,    160, "Normal"));
        records.add(new BMI_Record_Activity("12/3/2020" ,2.15,    160, "Normal"));
        records.add(new BMI_Record_Activity("12/3/2020" ,2.15,    160, "Normal"));
        BMI_Records_Adapter_Activity adapter = new BMI_Records_Adapter_Activity(records,this);
        RecyclerView.LayoutManager manager= new LinearLayoutManager(this);
        record_rec.setHasFixedSize(true);
        record_rec.setLayoutManager(manager);
        record_rec.setAdapter(adapter);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });
        add_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFood();
            }
        });
        add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addRecord();
            }
        });
        view_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFood();
            }
        });

    }
    public void addFood(){
    Intent x= new Intent (Home_Activity.this, Add_Food_Activity.class);
    startActivity(x);
}
public void viewFood(){
        Intent x= new Intent (Home_Activity.this, Food_List_Activity.class);
        startActivity(x);
        }
public void addRecord(){
        Intent x= new Intent (Home_Activity.this, New_Record_Activity.class);
        startActivity(x);
        }
public void logout(){
    firebase.logout();
        Intent x= new Intent (Home_Activity.this, LogIn_Activity.class);
finish();
        startActivity(x);
}
public static void checkBMIChange(){
    if(instance==null)return;
    instance.adapter.notifyDataSetChanged();
    instance.status.setText(user.setmAuth(FirebaseAuth.getInstance()));
    instance.Hi_name.setText("Hi," + user.getName());
        }
        @Override
protected void onResume(){
  super.onResume();
        checkBMIChange();
        }
}