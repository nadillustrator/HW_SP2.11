package com.example.hw_sp2_11.depot;

public class Item {

    private final int id;
    private final String title;
    private final int weight;
    private final double price;

    public Item(int id, String title, int weight, double price){
        this.id = id;
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
