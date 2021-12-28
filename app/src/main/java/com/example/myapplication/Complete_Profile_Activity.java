package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Complete_Profile_Activity extends AppCompatActivity {
    RadioButton male, female;
    Button inc_weight,dec_weight, inc_length, dec_length, save_data;
    EditText edit_weight, edit_length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        save_data= findViewById(R.id.save);
        female = findViewById(R.id.female);
        male = findViewById(R.id.male);
        inc_weight = findViewById(R.id.inc_weight);
        dec_weight = findViewById(R.id.dec_weight);
        edit_weight = findViewById(R.id.edit_weight);
        dec_length = findViewById(R.id.dec_length);
        inc_length = findViewById(R.id.inc_length);
        edit_length = findViewById(R.id.edit_length);
        save_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new  Intent(Complete_Profile_Activity.this, Home_Activity.class);
                startActivity(intent);

            }
        });


            male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b)
                        Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getBaseContext(), "Un checked", Toast.LENGTH_LONG).show();
                }
            });


        inc_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edit_weight.getText().toString());
                x += 1;
                edit_weight.setText(x+"");
            }
        });

        dec_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int y = Integer.parseInt(edit_weight.getText().toString());
                y -= 1;
                edit_weight.setText(y+"");
            }
        });

        inc_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int z = Integer.parseInt(edit_length.getText().toString());
                z += 1;
                edit_length.setText(z+"");
            }
        });

        dec_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k = Integer.parseInt(edit_length.getText().toString());
                k -= 1;
                edit_length.setText(k+"");
            }
        });
    }
}