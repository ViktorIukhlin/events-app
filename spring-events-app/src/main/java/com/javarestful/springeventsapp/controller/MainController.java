package com.javarestful.springeventsapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javarestful.springeventsapp.entity.Event;

// To automatically process the result in JSON - we use the library https://github.com/FasterXML/jackson
// which is automatically connected in SpringBoot

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    @GetMapping("/")
    public ResponseEntity<String> main() {
        return ResponseEntity.ok("bingo");
    }

    @GetMapping("/task")
    public ResponseEntity<Event> task() {
        return ResponseEntity.ok(new Event(1l, "Something"));
    }
}
