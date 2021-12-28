package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
public class SignUp_Activity extends AppCompatActivity {
    EditText name,email,password,rePassword;
    Button create,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        login = (Button)findViewById(R.id.login);
        name=(EditText )findViewById(R.id.name);
        email=(EditText )findViewById(R.id.email);
        password=(EditText )findViewById(R.id.password);
        rePassword=(EditText )findViewById(R.id.repass);
        create=(Button )findViewById(R.id.create);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignUp_Activity.this,LogIn.class);
                startActivity(i);
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(SignUp_Activity.this,complete_profile.class);
                startActivity(ii);
            }
        });




    }
}