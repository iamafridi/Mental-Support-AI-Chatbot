import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DynamicChatBot {
    private static final Map<String, String> responses = new HashMap<>();

    static {
        // Basic keyword-response mappings
        responses.put("sad", "I'm sorry to hear that you're feeling sad. It's okay to feel this way sometimes.");
        responses.put("anxious", "Feeling anxious is completely normal. Would you like some tips to manage that?");
        responses.put("stressed", "Stress can be overwhelming. Have you tried taking a break or practicing mindfulness?");
        responses.put("happy", "That's great to hear! What’s making you feel happy today?");
        responses.put("help", "I'm here to help. Can you tell me more about what you need?");
        responses.put("alone", "Feeling alone can be tough. It's important to reach out to someone who can support you.");
        responses.put("overwhelmed", "It sounds like you have a lot on your plate. Would you like to talk about it?");
        responses.put("tired", "It's okay to feel tired. Rest is important. Have you had enough sleep?");
        responses.put("confused", "It's normal to feel confused sometimes. Can you share more about what's on your mind?");
        responses.put("bored", "Boredom can be a sign that you need to try something new. What interests you?");
        responses.put("scared", "Feeling scared can be frightening. What's causing your fear?");
        responses.put("excited", "Excitement is wonderful! What are you excited about?");
        responses.put("grateful", "It's great to feel gratitude! What are you grateful for today?");
        responses.put("nervous", "Nervousness is common. Would you like to discuss what's making you feel this way?");
        responses.put("angry", "It's okay to feel angry. Do you want to talk about what's bothering you?");
        responses.put("happy", "That's wonderful! What's bringing you joy?");
        responses.put("sad", "I'm here for you. Would you like to talk about what's making you sad?");
        responses.put("hopeful", "It's great to be hopeful! What gives you hope?");
        responses.put("lost", "Feeling lost can be disorienting. What specifically are you feeling lost about?");
        responses.put("stuck", "Sometimes we all feel stuck. Can you tell me more about what's holding you back?");
        responses.put("relaxed", "I'm glad to hear you're feeling relaxed! How did you achieve that state?");
        responses.put("stress", "Stress can be challenging. Have you tried any relaxation techniques?");
        responses.put("concerned", "It's natural to feel concerned. What’s been on your mind?");
        responses.put("motivated", "That's fantastic! What motivates you?");
        responses.put("bothered", "If something's bothering you, I'm here to listen. What's going on?");
        responses.put("hope", "Hope is powerful. What are you hoping for?");
        responses.put("interested", "I'm glad you're interested! What topics do you want to explore?");
        responses.put("curious", "Curiosity is great! What are you curious about?");
        responses.put("want", "Wanting something is natural. What do you want?");
        responses.put("need", "Needing something is part of being human. What do you feel you need?");
        responses.put("like", "It's okay to have preferences. What do you like?");
        responses.put("dislike", "It's normal to dislike things. Can you share what you don't like?");
        responses.put("worry", "Worry can be stressful. What are you worried about?");
        responses.put("future", "Thinking about the future can be overwhelming. What concerns you about it?");
        responses.put("present", "Focusing on the present can be grounding. How do you feel right now?");
        responses.put("past", "The past can shape us. What thoughts do you have about it?");
        responses.put("dream", "Dreams can be meaningful. What did you dream about recently?");
        responses.put("experience", "Every experience teaches us something. What have you learned recently?");
        responses.put("mind", "Our minds can be complex. What's on yours right now?");
        responses.put("feel", "Feelings are important. What are you feeling right now?");
        responses.put("think", "Thinking is a part of understanding. What’s been on your mind?");
        responses.put("talk", "Talking can help. What would you like to talk about?");
        responses.put("share", "Sharing can lighten the load. What would you like to share?");
        responses.put("connect", "Connecting with others is important. Do you feel connected?");
        responses.put("family", "Family can be a source of support. How do you feel about your family?");
        responses.put("friend", "Friends can help us through tough times. How are your friendships?");
        responses.put("relationship", "Relationships can be complex. How do you feel about yours?");
        responses.put("advice", "I'm here to listen and provide support. What advice do you seek?");
        responses.put("question", "Questions can lead to understanding. What’s your question?");
        responses.put("talking", "Talking is a great way to process feelings. What’s on your mind?");
        responses.put("support", "Support is crucial. How can I support you today?");
        responses.put("time", "Time can help with healing. How are you spending your time?");
        responses.put("life", "Life has its ups and downs. How do you feel about your life right now?");
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
                return responses.get(keyword);
            }
        }
        return "I'm not sure how to respond to that. Can you tell me more?";
    }
}
