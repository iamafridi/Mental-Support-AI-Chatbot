import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DynamicChatBot {
    private static final Map<String, List<String>> responses = new HashMap<>();
    private static String userName = "User";

    static {
        // Basic keyword-response mappings with varied responses
        responses.put("sad", Arrays.asList(
            "I'm sorry to hear that you're feeling sad. It's okay to feel this way sometimes.",
            "Sadness can be tough to handle. Want to share more about it?",
            "It's completely normal to feel sad. What do you think is causing that?"
        ));
        responses.put("anxious", Arrays.asList(
            "Feeling anxious is completely normal. Would you like some tips to manage that?",
            "Anxiety can be overwhelming. What's been making you feel anxious?",
            "I understand that feeling anxious can be tough. How can I help you right now?"
        ));
        responses.put("stressed", Arrays.asList(
            "Stress can be overwhelming. Have you tried taking a break or practicing mindfulness?",
            "I hear you; stress can be challenging. Would you like to talk about what's stressing you out?",
            "Stress affects many people. What’s the source of your stress?"
        ));
        responses.put("happy", Arrays.asList(
            "That's wonderful! What's bringing you joy?",
            "It's great to hear you're happy! Can you share what made you feel this way?",
            "Happiness is important! What are some things that make you feel this way?"
        ));
        responses.put("help", Arrays.asList(
            "I'm here to help. Can you tell me more about what you need?",
            "Support is what I'm here for! What do you feel you need help with?",
            "How can I assist you today? Your concerns are important to me."
        ));
        responses.put("alone", Arrays.asList(
            "Feeling alone can be tough. It's important to reach out to someone who can support you.",
            "You're not alone in feeling this way. Can you talk to someone close to you?",
            "Being alone can be difficult. What are your thoughts on this?"
        ));
        responses.put("overwhelmed", Arrays.asList(
            "It sounds like you have a lot on your plate. Would you like to talk about it?",
            "Feeling overwhelmed is understandable. What specifically is overwhelming you?",
            "When things pile up, it can be hard to cope. Can I help you prioritize?"
        ));
        responses.put("tired", Arrays.asList(
            "It's okay to feel tired. Rest is important. Have you had enough sleep?",
            "Fatigue can weigh you down. How have you been sleeping lately?",
            "Sometimes, a little break can help. When was the last time you rested?"
        ));
        responses.put("confused", Arrays.asList(
            "It's normal to feel confused sometimes. Can you share more about what's on your mind?",
            "Confusion can be part of life. What’s causing your confusion?",
            "It's okay to be confused. Do you want to talk about what's bothering you?"
        ));
        responses.put("bored", Arrays.asList(
            "Boredom can be a sign that you need to try something new. What interests you?",
            "Feeling bored? Let’s brainstorm some activities together!",
            "Boredom can be tough. What’s something you've always wanted to try?"
        ));
        responses.put("scared", Arrays.asList(
            "Feeling scared can be frightening. What's causing your fear?",
            "Fear is a natural response. Can you talk about what's making you feel this way?",
            "It’s okay to be scared sometimes. What's on your mind?"
        ));
        responses.put("excited", Arrays.asList(
            "Excitement is wonderful! What are you excited about?",
            "That's fantastic! What’s making you feel this way?",
            "Excitement is contagious! Care to share what’s got you feeling this way?"
        ));
        responses.put("grateful", Arrays.asList(
            "It's great to feel gratitude! What are you grateful for today?",
            "Gratitude can boost your mood. What made you feel grateful recently?",
            "Being thankful is powerful. Can you share what you’re thankful for?"
        ));
        responses.put("nervous", Arrays.asList(
            "Nervousness is common. Would you like to discuss what's making you feel this way?",
            "It’s normal to feel nervous sometimes. What’s on your mind?",
            "Feeling nervous is okay. Can I help ease your nerves?"
        ));
        responses.put("angry", Arrays.asList(
            "It's okay to feel angry. Do you want to talk about what's bothering you?",
            "Anger can be a strong emotion. Can you share what's making you feel this way?",
            "It’s important to express anger. What’s bothering you right now?"
        ));
        responses.put("hopeful", Arrays.asList(
            "It's great to be hopeful! What gives you hope?",
            "Hope can be a strong motivator. What are you hopeful about?",
            "Feeling hopeful is wonderful! What are your aspirations?"
        ));
        responses.put("lost", Arrays.asList(
            "Feeling lost can be disorienting. What specifically are you feeling lost about?",
            "It’s okay to feel lost sometimes. What’s been confusing you?",
            "When you feel lost, it helps to talk about it. Can you share more?"
        ));
        responses.put("stuck", Arrays.asList(
            "Sometimes we all feel stuck. Can you tell me more about what's holding you back?",
            "Feeling stuck is normal. What’s been preventing you from moving forward?",
            "It can be tough to feel stuck. What would you like to change?"
        ));
        responses.put("relaxed", Arrays.asList(
            "I'm glad to hear you're feeling relaxed! How did you achieve that state?",
            "Relaxation is key to well-being. What helps you feel relaxed?",
            "Feeling relaxed is wonderful! Can you share what brought you to this state?"
        ));
        responses.put("stress", Arrays.asList(
            "Stress can be challenging. Have you tried any relaxation techniques?",
            "Managing stress is crucial. What helps you relieve stress?",
            "Stress management can be tricky. Can I offer some suggestions?"
        ));
        responses.put("concerned", Arrays.asList(
            "It's natural to feel concerned. What’s been on your mind?",
            "Concerns can weigh heavy. What do you feel concerned about?",
            "Let’s talk about what’s bothering you. What are you concerned about?"
        ));
        responses.put("motivated", Arrays.asList(
            "That's fantastic! What motivates you?",
            "Feeling motivated is great! What’s driving your motivation?",
            "Motivation can lead to great things. What inspires you?"
        ));
        responses.put("bothered", Arrays.asList(
            "If something's bothering you, I'm here to listen. What's going on?",
            "It’s important to express feelings. What’s bothering you?",
            "I’m here to support you. Can you share what’s on your mind?"
        ));
        responses.put("hope", Arrays.asList(
            "Hope is powerful. What are you hoping for?",
            "Hope can fuel your journey. What gives you hope?",
            "Feeling hopeful is essential. What are your hopes for the future?"
        ));
        responses.put("interested", Arrays.asList(
            "I'm glad you're interested! What topics do you want to explore?",
            "Interest is the start of discovery. What are you curious about?",
            "Exploring interests can be fun! What’s on your mind?"
        ));
        responses.put("curious", Arrays.asList(
            "Curiosity is great! What are you curious about?",
            "Being curious can lead to learning. What’s sparking your curiosity?",
            "Curiosity drives understanding. What would you like to know?"
        ));
        responses.put("want", Arrays.asList(
            "Wanting something is natural. What do you want?",
            "Desires are part of life. Can you share what you’re wanting?",
            "It's okay to have wants. What’s something you wish for?"
        ));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to the Dynamic Mental Support Chat Bot! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                break;
            }

            String response = getResponse(userInput);
            System.out.println("Chat Bot: " + response);
        }
        scanner.close();
    }

    private static String getResponse(String userInput) {
        for (String keyword : responses.keySet()) {
            if (userInput.contains(keyword)) {
                List<String> possibleResponses = responses.get(keyword);
                // Pick a random response from the list
                return possibleResponses.get(new Random().nextInt(possibleResponses.size()));
            }
        }
        return "I'm not sure how to respond to that. Can you tell me more?";
    }
}
