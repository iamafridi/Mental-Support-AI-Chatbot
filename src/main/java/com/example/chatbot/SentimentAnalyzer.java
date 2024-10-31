package com.example.chatbot;

public class SentimentAnalyzer {
    public String analyze(String input) {
        // Basic sentiment analysis (this can be improved)
        if (input.contains("sad") || input.contains("depressed")) {
            return "negative";
        } else if (input.contains("happy") || input.contains("good")) {
            return "positive";
        } else {
            return "neutral";
        }
    }
}
