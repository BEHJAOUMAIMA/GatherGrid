package com.example.service;

import com.example.repository.EventRepository;

public class EventService {

    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }

}
