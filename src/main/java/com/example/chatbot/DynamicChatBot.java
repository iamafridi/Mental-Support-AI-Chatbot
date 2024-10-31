
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
        responses.put("sad", Arrays.asList(
                "I’m here for you. What’s been bringing you down?",
                "It’s tough to feel sad. Have you thought about what might help lift your spirits?",
                "Sadness can feel isolating. Let’s chat about it if you want."
        ));

        responses.put("anxious", Arrays.asList(
                "Anxiety can feel overwhelming. Do you want to share what’s on your mind?",
                "I understand that anxiety can be a lot to handle. What’s triggering those feelings?",
                "Feeling anxious is completely valid. Let’s discuss some ways to ease that feeling."
        ));

        responses.put("stressed", Arrays.asList(
                "Stress can be really burdensome. What’s contributing to your stress right now?",
                "It’s okay to feel stressed out. Would talking about it help?",
                "Sometimes just sharing can lighten the load. What’s been stressing you?"
        ));

        responses.put("happy", Arrays.asList(
                "I’m so glad you’re feeling happy! What’s contributing to your happiness?",
                "Happiness is contagious! What’s been making you feel so good?",
                "It’s wonderful to hear you’re feeling this way! Any special reasons?"
        ));

        responses.put("help", Arrays.asList(
                "I’m ready to help! What do you need support with today?",
                "Everyone needs help sometimes. What’s on your mind?",
                "Let’s figure this out together. How can I assist you?"
        ));

        responses.put("alone", Arrays.asList(
                "Feeling alone can be tough. What’s been going on that’s made you feel this way?",
                "You’re not alone in this world. Have you thought about connecting with someone?",
                "Let’s explore ways to feel more connected. Would that help?"
        ));

        responses.put("overwhelmed", Arrays.asList(
                "It’s normal to feel overwhelmed at times. Can you identify what’s causing it?",
                "When life gets overwhelming, it helps to talk. What’s weighing on you?",
                "Let’s take a step back. What can we do to simplify things for you?"
        ));

        responses.put("tired", Arrays.asList(
                "Feeling tired is a sign you need to rest. When was the last time you took a break?",
                "Sometimes fatigue can be a clue to your body needing something. What have you been up to?",
                "It’s important to recharge. Have you had time for yourself lately?"
        ));

        responses.put("confused", Arrays.asList(
                "Confusion is a common feeling. Can you share what’s making you feel this way?",
                "It’s okay to be confused. What do you think is at the root of that feeling?",
                "Let’s talk it out. What’s confusing you right now?"
        ));

        responses.put("bored", Arrays.asList(
                "Boredom can spark creativity. What’s something you’ve always wanted to try?",
                "Let’s find something fun to do! What hobbies interest you?",
                "Being bored can be a chance to explore. What do you feel like doing?"
        ));

        responses.put("scared", Arrays.asList(
                "Feeling scared is natural. Can you tell me what’s scaring you?",
                "It’s okay to express fear. What’s been on your mind lately?",
                "Let’s talk about those feelings. What’s causing your fear?"
        ));

        responses.put("excited", Arrays.asList(
                "Excitement is amazing! What’s got you so thrilled?",
                "It’s great to feel excitement! Can you share what’s making you feel this way?",
                "Excited emotions are wonderful! What are you looking forward to?"
        ));

        responses.put("grateful", Arrays.asList(
                "Gratitude can change our perspective. What are you thankful for today?",
                "Feeling grateful is powerful! What’s brought you this sense of gratitude?",
                "Gratitude can lift your spirits. Who or what are you grateful for right now?"
        ));

        responses.put("nervous", Arrays.asList(
                "Nervousness is a common feeling. What’s making you feel this way?",
                "It’s okay to be nervous. Would talking about it help?",
                "Let’s try to ease those nerves. Can you pinpoint what’s bothering you?"
        ));

        responses.put("angry", Arrays.asList(
                "It’s normal to feel angry sometimes. Do you want to talk about what’s triggered that anger?",
                "Anger is a valid emotion. How can I support you with these feelings?",
                "Let’s discuss what’s bothering you. What’s making you feel angry?"
        ));

        responses.put("hopeful", Arrays.asList(
                "Hope can be a powerful motivator. What are you feeling hopeful about?",
                "It’s great to feel hopeful! What are you looking forward to?",
                "Hope can guide us through tough times. What gives you hope right now?"
        ));

        responses.put("lost", Arrays.asList(
                "Feeling lost can be disorienting. What do you think is contributing to that feeling?",
                "It’s okay to feel lost. Can you share more about what’s making you feel this way?",
                "Let’s work through this together. What’s been on your mind?"
        ));

        responses.put("stuck", Arrays.asList(
                "Feeling stuck can be frustrating. What’s been holding you back?",
                "It’s tough to feel stuck. Can we talk about some options moving forward?",
                "Let’s figure this out. What steps do you think you could take to get unstuck?"
        ));

        responses.put("relaxed", Arrays.asList(
                "Relaxation is key to well-being! What helps you feel relaxed?",
                "I’m glad you’re feeling relaxed! Can you share your relaxation techniques?",
                "Feeling relaxed is wonderful! What’s your favorite way to unwind?"
        ));

        responses.put("stress", Arrays.asList(
                "Stress management is important. What strategies have you tried?",
                "Let’s find ways to reduce your stress. What’s been the most stressful part of your day?",
                "It’s okay to feel stressed. Would you like tips on how to manage it?"
        ));

        responses.put("concerned", Arrays.asList(
                "Concern can be a heavy emotion. What’s been on your mind?",
                "It’s valid to feel concerned. Can you share what’s worrying you?",
                "Let’s discuss your concerns. What’s making you feel this way?"
        ));

        responses.put("motivated", Arrays.asList(
                "Motivation is a great driver for success! What’s motivating you right now?",
                "Feeling motivated is fantastic! What’s inspiring you?",
                "Let’s harness that motivation. What’s your next goal?"
        ));

        responses.put("bothered", Arrays.asList(
                "If something’s bothering you, I’m here to listen. What’s on your mind?",
                "It’s important to express your feelings. Can you tell me what’s bothering you?",
                "I’m here to help. What’s been troubling you lately?"
        ));

        responses.put("hope", Arrays.asList(
                "Hope is essential for a positive outlook. What are your hopes for the future?",
                "It’s wonderful to feel hope! What are you hoping for right now?",
                "Hope can be a powerful force. What gives you hope today?"
        ));
        responses.put("sad", Arrays.asList(
                "It’s tough to feel this way. Want to share what’s on your mind?",
                "Sometimes, sadness can feel heavy. What would make you feel better right now?",
                "I’m here to listen. What’s been bothering you?"
        ));

        responses.put("anxious", Arrays.asList(
                "Anxiety can be a tough battle. Can you share what’s making you feel anxious?",
                "Let’s talk about those anxious feelings. What’s at the root of your anxiety?",
                "Feeling anxious is common. What helps you manage it?"
        ));

        responses.put("stressed", Arrays.asList(
                "It sounds like you’re feeling overwhelmed. What’s on your mind?",
                "Stress can really take a toll. Let’s explore what’s stressing you out.",
                "Sometimes stress can cloud our thoughts. Can we talk about it?"
        ));

        responses.put("happy", Arrays.asList(
                "I love that you’re feeling happy! What’s bringing you joy?",
                "Happiness is wonderful! Can you share what’s making you smile today?",
                "It’s great to hear you’re in a good mood! What’s your secret?"
        ));

        responses.put("help", Arrays.asList(
                "I’m here for you! What specifically would you like help with?",
                "Everyone needs help sometimes. How can I assist you today?",
                "Let’s figure this out together. What’s troubling you?"
        ));

        responses.put("alone", Arrays.asList(
                "Feeling alone can be really hard. What do you think could help?",
                "You’re not alone in this moment. Have you reached out to someone?",
                "Let’s talk about it. How do you usually cope with feeling alone?"
        ));

        responses.put("overwhelmed", Arrays.asList(
                "It sounds like a lot is happening. Can we break it down together?",
                "Being overwhelmed can be a sign to take a step back. What’s causing this feeling?",
                "Let’s tackle this together. What’s the biggest source of your overwhelm?"
        ));

        responses.put("tired", Arrays.asList(
                "It’s important to rest when you’re tired. How have you been sleeping?",
                "Feeling tired can be a sign to slow down. What’s been wearing you out?",
                "Let’s prioritize your well-being. Have you had a chance to recharge?"
        ));

        responses.put("confused", Arrays.asList(
                "Confusion can be frustrating. What’s unclear for you right now?",
                "It’s okay to feel confused. Can you pinpoint what’s causing this feeling?",
                "Let’s unravel that confusion together. What’s on your mind?"
        ));

        responses.put("bored", Arrays.asList(
                "Boredom can lead to creativity! What activities do you enjoy?",
                "Sometimes boredom is an opportunity to explore new interests. What are you curious about?",
                "Let’s shake off that boredom. What’s something you’ve always wanted to try?"
        ));

        responses.put("scared", Arrays.asList(
                "It’s normal to feel scared at times. Can you share what’s causing that fear?",
                "Fear can be overwhelming. What do you think would help you feel safer?",
                "Let’s talk about it. What’s been troubling you?"
        ));

        responses.put("excited", Arrays.asList(
                "Excitement can energize us! What are you looking forward to?",
                "I love that you’re feeling excited! What’s behind that excitement?",
                "Let’s share in your excitement! What’s the best part of your day?"
        ));

        responses.put("grateful", Arrays.asList(
                "Gratitude can lift our spirits! What are you thankful for today?",
                "Feeling grateful is beautiful! Who or what is at the center of your gratitude?",
                "Let’s celebrate your gratitude! What positive things are happening in your life?"
        ));

        responses.put("nervous", Arrays.asList(
                "Nervousness is common. What’s making you feel this way?",
                "It’s okay to feel nervous. Would it help to talk about your feelings?",
                "Let’s explore your nerves. What’s causing that anxious energy?"
        ));

        responses.put("angry", Arrays.asList(
                "Anger is a valid emotion. What’s making you feel this way?",
                "It’s important to express your anger. What’s at the root of it?",
                "Let’s talk about your feelings. What’s bothering you the most?"
        ));

        responses.put("hopeful", Arrays.asList(
                "Hope can light the way forward! What are you hoping for?",
                "Feeling hopeful is a great mindset! What gives you that hope?",
                "Let’s build on that hope! What’s something positive you’re looking forward to?"
        ));

        responses.put("lost", Arrays.asList(
                "Feeling lost can be disorienting. What’s making you feel this way?",
                "It’s okay to feel lost sometimes. Can you share more about your feelings?",
                "Let’s navigate this together. What do you feel lost about?"
        ));

        responses.put("stuck", Arrays.asList(
                "Feeling stuck is a common experience. What’s holding you back?",
                "Let’s explore ways to get unstuck. What do you think might help?",
                "Sometimes talking about it can clarify things. What’s making you feel stuck?"
        ));

        responses.put("relaxed", Arrays.asList(
                "That’s great to hear! What helps you feel relaxed?",
                "Feeling relaxed is important for well-being! How did you achieve that state?",
                "Let’s talk about relaxation! What activities help you unwind?"
        ));

        responses.put("stress", Arrays.asList(
                "Stress is something many of us deal with. What’s the main source of your stress?",
                "Let’s work on ways to manage your stress. Have you tried any techniques?",
                "It’s okay to feel stressed. What do you think could help alleviate that?"
        ));

        responses.put("concerned", Arrays.asList(
                "Concerns are valid and worth discussing. What’s on your mind?",
                "Let’s delve into your concerns. What’s been bothering you?",
                "I’m here to listen. What’s causing you to feel concerned?"
        ));

        responses.put("motivated", Arrays.asList(
                "Motivation can drive us to achieve great things! What’s fueling your motivation?",
                "It’s fantastic to feel motivated! What goals are you working towards?",
                "Let’s harness that motivation! What are you planning to do next?"
        ));

        responses.put("bothered", Arrays.asList(
                "If something’s bothering you, I’m here to listen. What’s troubling you?",
                "It’s important to express your feelings. Can you share what’s bothering you?",
                "I’m here to support you. What’s been on your mind?"
        ));

        responses.put("hope", Arrays.asList(
                "Hope can provide strength. What are you feeling hopeful about today?",
                "It’s wonderful to hold onto hope! What are your dreams for the future?",
                "Let’s talk about your hopes! What gives you hope right now?"
        ));

        responses.put("interested", Arrays.asList(
                "Interest can lead to amazing discoveries! What topics catch your interest?",
                "I’m excited to explore with you! What are you interested in learning about?",
                "Interest fuels knowledge! What are you curious about?"
        ));

        responses.put("curious", Arrays.asList(
                "Curiosity is a beautiful trait! What are you wondering about today?",
                "I love your curiosity! What questions are on your mind?",
                "Curiosity leads to growth! What’s sparking your interest?"
        ));

        responses.put("want", Arrays.asList(
                "Desires shape our aspirations. What is it that you truly want?",
                "It’s okay to express your wants! What’s on your wishlist?",
                "Let’s talk about your wants. What do you desire most right now?"
        ));

        responses.put("interested", Arrays.asList(
                "Interest can lead to discovery. What topics are you interested in exploring?",
                "I love curiosity! What are you keen to learn more about?",
                "Interest sparks learning! What’s on your mind?"
        ));

        responses.put("curious", Arrays.asList(
                "Curiosity is a wonderful trait! What are you curious about right now?",
                "It’s great to be curious. What’s sparking your interest?",
                "Curiosity drives understanding! What would you like to discover?"
        ));

        responses.put("want", Arrays.asList(
                "Wanting something is part of being human. What is it that you desire?",
                "Desires can shape our goals. What are you longing for?",
                "It’s okay to have wants. What’s something you really wish for?"
        ));

        responses.put("want", Arrays.asList(
                "Wanting something is natural. What do you want?",
                "Desires are part of life. Can you share what you’re wanting?",
                "It's okay to have wants. What’s something you wish for?"
        ));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
        }
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
