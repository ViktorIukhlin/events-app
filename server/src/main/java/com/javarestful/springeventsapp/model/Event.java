package com.javarestful.springeventsapp.model;

public class Event {
    private int id;
    private String name;
    private String location;
    private int time;
    private int price;

    public Event(int id, String name, String location, int time, int price){
        this.id = id;
        this.name = name;
        this.location = location;
        this.time = time;
        this.price = price;
    }

    // Id
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    // Name
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // Location
    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    // Time
    public int getTime() {
        return time;
    }
    public void setTime(int time){
        this.time = time;
    }

    // Price
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
