package com.example.chatbot;

public class SentimentAnalyzer {
    public String analyzeMood(String userInput) {
        if (userInput.contains("happy") || userInput.contains("good")) {
            return "positive";
        } else if (userInput.contains("sad") || userInput.contains("bad")) {
            return "negative";
        } else {
            return "neutral";
        }
    }
}
