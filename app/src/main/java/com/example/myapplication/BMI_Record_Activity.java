package com.example.myapplication;

public class BMI_Record_Activity {
    String date,id,status;
    double weight;
    int length;
    public BMI_Record_Activity(String date, double weight, int length, String status){
        this.date= date;
        this.weight= weight;
        this.length= length;
        this.status=status;
    }
    private static class Constants{
        final static String Underweight= "Underweight";
        final static String Healthy= "Healthy";
        final static String Overweight= "Overweight";
        final static String Obesity= "Obesity";
        final static String LC= "Little Cjanges";
        final static String SG= "Still Good";
        final static String GA= "Go Ahead";
        final static String BC= "Be Careful";
        final static String SB= "So Bad";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    }

