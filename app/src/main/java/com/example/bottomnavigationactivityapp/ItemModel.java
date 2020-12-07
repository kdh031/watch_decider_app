package com.example.bottomnavigationactivityapp;

public class ItemModel {
    private int image;
    private String name, year, description;

    public ItemModel() {
    }

    public ItemModel(int image, String name, String year, String description) {
        this.image = image;
        this.name = name;
        this.year = year;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}