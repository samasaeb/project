package com.example.myapplication;

public class Food_Details {
     int img;
     String name, type, calories,id;

    public Food_Details(int img, String name, String type, String calories,String id) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.id=id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCalory() {
        return calories;
    }

    public void setCalory(String calory) {
        this.calories = calory;
    }

    public Food_Details(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
