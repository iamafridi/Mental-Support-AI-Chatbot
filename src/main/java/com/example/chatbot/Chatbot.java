package com.example.chatbot;

public class ChatBot {

    public String getResponse(String input) {
        String response;
        switch (input.toLowerCase()) {
            case "hi":
            case "hello":
                response = "Hello! How can I assist you today?";
                break;
            case "i feel anxious about my upcoming exam":
                response = "It's normal to feel anxious before an exam. Would you like some tips to manage your anxiety?";
                break;
            case "i feel sad":
                response = "I'm sorry to hear that you're feeling sad. It's okay to talk about it if you want.";
                break;
            default:
                response = "You said: " + input;
                break;
        }
        return response;
    }
}
