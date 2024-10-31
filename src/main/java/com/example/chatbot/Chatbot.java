package com.example.chatbot;

import com.google.gson.Gson; // Assuming you are using Gson for JSON handling

public class ChatBot {
    private final Gson gson;

    public ChatBot() {
        this.gson = new Gson();
    }

    // Change the access modifier to public
    public String getResponse(String input) {
        // Example logic for generating a response
        if (input == null || input.isEmpty()) {
            return "Please say something!";
        }
        return "You said: " + input;
    }
}
