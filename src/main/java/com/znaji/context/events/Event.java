package com.znaji.context.events;

public class Event {

    private String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
