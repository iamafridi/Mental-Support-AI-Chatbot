package com.example.chatbot;

public class User {
    private String name;
    private String mood;

    public User(String name) {
        this.name = name;
        this.mood = "neutral";
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }
}
