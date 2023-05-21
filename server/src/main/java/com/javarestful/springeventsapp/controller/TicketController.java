package com.javarestful.springeventsapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.javarestful.springeventsapp.model.Ticket;
import com.javarestful.springeventsapp.service.TicketService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    
    @GetMapping("/ticket")
    public Ticket getEvent(@RequestParam Integer id){
        Optional<Ticket> ticket = ticketService.getTicket(id);

        if(ticket.isPresent()){
            return (Ticket) ticket.get();
        }
 
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ticket not found.");
    }
}
