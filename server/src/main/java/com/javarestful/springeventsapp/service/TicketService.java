package com.javarestful.springeventsapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javarestful.springeventsapp.model.Ticket;

@Service
public class TicketService {
    private List<Ticket> ticketList;

    public TicketService() {
        ticketList = new ArrayList<>();

        Ticket ticket1 = new Ticket(1, "EventName", "Ready", 1);
        Ticket ticket2 = new Ticket(2, "EventName2", "Ready", 1);

        ticketList.addAll(Arrays.asList(ticket1, ticket2));
    }


    public Optional<Ticket> getTicket(Integer id) {
        Optional<Ticket> optional = Optional.empty();
        
        for (Ticket ticket: ticketList) {
            if(id == ticket.getId()){
                optional = Optional.of(ticket);
                return optional;
            }
        }

        return optional;
    }
    
}
