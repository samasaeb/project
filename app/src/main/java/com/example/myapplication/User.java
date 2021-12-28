package com.example.myapplication;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.*;
public class User {
    public static User user;
    private FirebaseAuth mAuth;
    private ArrayList<BMI_Record_Activity> records=new ArrayList<BMI_Record_Activity>();
    private ArrayList<Food_Details> foodDetails =new ArrayList<Food_Details>();
    private String name, email, password,re_password,bd;
    private boolean male;
    Context context;
    private String status;


    public User() throws UserInfoException {
        this(user.name, user.email, user.password, user.re_password, user.bd , (AppCompatActivity) user.context);
    }

    public User(String name, String email, String password, String re_password, String bd, AppCompatActivity context) throws UserInfoException{
        if(!name.matches("[A-Za-z\\s]+")) throw new UserInfoException("name");
        if(!email.matches("[A-Za-z][\\w]{0,31}@[\\w]{2,10}\\.com"))throw new UserInfoException("email");
        if(!password.equals(re_password))throw new UserInfoException("re-password");
        if(password.length()<3)throw new UserInfoException("re-password");
        this.name=name;
        this.email=email;
        this.password=password;
        firebase.registration(User.this,(AppCompatActivity) user.context);
    }

    public String getName() {
        return name;
    }


    public static User getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public String getBd() {
        return bd;
    }

    public String getPassword() {
        return password;
    }

    public String getRe_password() {
        return re_password;
    }

    public FirebaseAuth  getmAuth() {
        return mAuth;
    }

    public int setmAuth(FirebaseAuth instance) {
        this.mAuth = mAuth;
        return 0;
    }
    public User(String email, String password){
        this.email=email;
        this.password=password;
    }
    public boolean isMale(){ return male;}



}
