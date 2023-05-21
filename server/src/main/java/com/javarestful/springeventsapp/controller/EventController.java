package com.javarestful.springeventsapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.javarestful.springeventsapp.model.Event;
import com.javarestful.springeventsapp.service.EventService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {
    private EventService eventService;

    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }
    
    @GetMapping("/event")
    public Event getEvent(@RequestParam Integer id){
        Optional<Event> event = eventService.getEvent(id);

        if(event.isPresent()){
            return (Event) event.get();
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found.");
    }
}
