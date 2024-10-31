package com.example.chatbot;

public class Chatbot {
    private ResourceManager resourceManager;
    private SentimentAnalyzer sentimentAnalyzer;

    public Chatbot() {
        resourceManager = new ResourceManager();
        sentimentAnalyzer = new SentimentAnalyzer();
    }

    public void start() {
        // Placeholder for chatbot interaction logic
        System.out.println("Chatbot is ready to help.");
    }
}
