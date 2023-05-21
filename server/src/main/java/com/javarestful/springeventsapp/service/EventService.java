package com.javarestful.springeventsapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javarestful.springeventsapp.model.Event;

@Service
public class EventService {
    private List<Event> eventList;

    public EventService() {
        eventList = new ArrayList<>();

        Event event1 = new Event(1, "EventName", "Tallinn", 120030030, 100);
        Event event2 = new Event(2, "EventName2", "Tallinn", 120030030, 100);

        eventList.addAll(Arrays.asList(event1, event2));
    }


    public Optional<Event> getEvent(Integer id) {
        Optional<Event> optional = Optional.empty();
        
        for (Event event: eventList) {
            if(id == event.getId()){
                optional = Optional.of(event);
                return optional;
            }
        }

        return optional;
    }
    
}
