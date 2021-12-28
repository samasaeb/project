package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class New_Record_Activity extends AppCompatActivity {
    Button weight_inc,weight_dec, length_inc, length_dec, save;
    EditText weight_number, length_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        save= findViewById(R.id.save);
        weight_inc = findViewById(R.id.inc1);
        weight_number = findViewById(R.id.edit_text1);
        weight_dec = findViewById(R.id.dec1);
        length_inc = findViewById(R.id.inc2);
        length_number = findViewById(R.id.edit_text2);
        length_dec = findViewById(R.id.dec2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent (New_Record_Activity.this, Add_Food_Activity.class);
                startActivity(intent);
            }
        });

        weight_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(weight_number.getText().toString());
                x += 1;
                weight_number.setText(x+"");
            }
        });

        weight_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int y = Integer.parseInt(weight_number.getText().toString());
                y -= 1;
                weight_number.setText(y+"");
            }
        });

        length_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int z = Integer.parseInt(length_number.getText().toString());
                z += 1;
                length_number.setText(z+"");
            }
        });

        length_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k = Integer.parseInt(length_number.getText().toString());
                k -= 1;
                length_number.setText(k+"");
            }
        });
    }
}