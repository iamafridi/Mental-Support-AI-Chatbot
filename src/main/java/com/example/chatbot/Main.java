package com.example.chatbot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mental Support Chat Bot! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chat Bot: Goodbye!");
                break;
            }

            // Get response from the ChatBot
            String response = chatBot.getResponse(userInput);
            System.out.println("Chat Bot: " + response);
        }

        scanner.close();
    }
}
