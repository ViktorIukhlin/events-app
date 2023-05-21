package com.javarestful.springeventsapp.model;

public class Ticket {
    private int id;
    private String name;
    private String status;
    private int event_id;

    public Ticket(int id, String name, String status, int event_id){
        this.id = id;
        this.name = name;
        this.status = status;
        this.event_id = event_id;
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

    // Status
    public String getLocation() {
        return status;
    }
    public void setLocation(String status){
        this.status = status;
    }

    // Event
    public int getEventId() {
        return event_id;
    }
    public void setEventId(int event_id){
        this.event_id = event_id;
    }
}
