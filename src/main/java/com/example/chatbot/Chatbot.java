package com.example.chatbot;

public class ChatBot {

    public String getResponse(String input) {
        // Convert the input to lowercase for case insensitive comparison
        String lowerCaseInput = input.toLowerCase();
        String response;

        switch (lowerCaseInput) {
            case "hi":
            case "hello":
            case "hey":
            case "greetings":
                response = "Hello! How can I assist you today?";
                break;
            case "how are you?":
            case "how are you":
            case "how's it going?":
                response = "I'm just a program, but thanks for asking! How can I help you?";
                break;
            case "i feel anxious about my upcoming exam":
                response = "It's normal to feel anxious before an exam. Would you like some tips to manage your anxiety?";
                break;
            case "i feel sad":
                response = "I'm sorry to hear that you're feeling sad. It's okay to talk about it if you want.";
                break;
            case "i am stressed":
                response = "Stress can be overwhelming. Have you tried any relaxation techniques?";
                break;
            case "i feel lonely":
                response = "Feeling lonely is tough. Remember, it's okay to reach out to someone for support.";
                break;
            case "i feel happy":
                response = "That's great to hear! What made you happy today?";
                break;
            case "what should i do if i'm feeling anxious?":
                response = "Deep breathing exercises can help. Would you like me to guide you through some?";
                break;
            case "tell me a joke":
                response = "Why did the scarecrow win an award? Because he was outstanding in his field!";
                break;
            case "what is mindfulness?":
                response = "Mindfulness is the practice of being present and fully engaging with the current moment. Would you like tips on how to practice it?";
                break;
            case "i can't sleep":
                response = "I'm sorry to hear that. Have you tried creating a bedtime routine or avoiding screens before bed?";
                break;
            case "i feel overwhelmed":
                response = "It's okay to feel overwhelmed. Taking a break or talking about it can help.";
                break;
            case "what are some relaxation techniques?":
                response = "Some techniques include deep breathing, meditation, and progressive muscle relaxation. Would you like to try one?";
                break;
            case "what should i do if i feel sad?":
                response = "It's important to talk about your feelings. Have you considered speaking with a friend or a professional?";
                break;
            case "what is gratitude?":
                response = "Gratitude is recognizing and appreciating the good things in your life. Keeping a gratitude journal can help!";
                break;
            case "can you help me with my homework?":
                response = "I'd love to help! What subject are you working on?";
                break;
            case "what is your favorite color?":
                response = "I don’t have preferences, but many people like blue! What's your favorite color?";
                break;
            case "i feel tired":
                response = "It sounds like you need some rest. Have you had enough sleep lately?";
                break;
            case "what is self-care?":
                response = "Self-care is any activity that you do to take care of your mental, emotional, and physical health. What do you enjoy doing for self-care?";
                break;
            case "what can i do to improve my mood?":
                response = "Engaging in activities you enjoy, exercising, and spending time with loved ones can help boost your mood.";
                break;
            case "what's the best way to handle stress?":
                response = "Finding healthy coping mechanisms like exercise, talking to someone, or practicing mindfulness can be very effective.";
                break;
            case "what is positive thinking?":
                response = "Positive thinking involves focusing on the good aspects of situations and maintaining a hopeful attitude.";
                break;
            case "i feel unmotivated":
                response = "Lack of motivation is something we all experience. Setting small, achievable goals can help regain your drive.";
                break;
            case "how can i improve my self-esteem?":
                response = "Working on self-acceptance, surrounding yourself with positive people, and setting realistic goals can improve self-esteem.";
                break;
            case "what are some signs of burnout?":
                response = "Signs include feeling drained, lack of motivation, and a sense of detachment from your work or responsibilities.";
                break;
            case "how can i stay focused?":
                response = "Minimizing distractions, setting clear goals, and taking regular breaks can help improve focus.";
                break;
            case "what is deep breathing?":
                response = "Deep breathing involves inhaling deeply through your nose, holding for a moment, and exhaling slowly through your mouth.";
                break;
            case "what do you think about therapy?":
                response = "Therapy can be very beneficial for many people. It's a safe space to discuss feelings and develop coping strategies.";
                break;
            case "i am feeling lost":
                response = "It's okay to feel lost sometimes. Taking time to reflect on your feelings and goals can help you find clarity.";
                break;
            case "what is the importance of sleep?":
                response = "Sleep is vital for physical health, emotional well-being, and cognitive function. Aim for 7-9 hours a night!";
                break;
            case "how can i manage my time better?":
                response = "Creating a schedule, prioritizing tasks, and setting deadlines can help you manage your time more effectively.";
                break;
            case "what is the impact of social media?":
                response = "Social media can connect us, but it can also lead to feelings of inadequacy or anxiety. It's important to use it mindfully.";
                break;
            case "what are coping strategies?":
                response = "Coping strategies are techniques to help manage stress and difficult emotions. Examples include journaling and talking to someone.";
                break;
            case "how do i know if i need help?":
                response = "If you feel overwhelmed, hopeless, or unable to cope, it might be a good idea to reach out for support.";
                break;
            case "what is emotional intelligence?":
                response = "Emotional intelligence is the ability to recognize and manage your own emotions and the emotions of others.";
                break;
            case "how can i practice gratitude?":
                response = "You can keep a gratitude journal or simply take a moment each day to reflect on what you are thankful for.";
                break;
            case "what can i do to feel better?":
                response = "Engaging in activities you enjoy, spending time outdoors, or talking to someone can help improve your mood.";
                break;
            case "how can i build resilience?":
                response = "Building resilience involves developing coping skills, maintaining a positive outlook, and seeking support from others.";
                break;
            case "i feel like giving up":
                response = "It's tough to feel that way. Remember, it's okay to ask for help. You don't have to go through this alone.";
                break;
            case "how can i communicate better?":
                response = "Active listening, being clear and concise, and practicing empathy can enhance your communication skills.";
                break;
            case "what is self-compassion?":
                response = "Self-compassion involves treating yourself with kindness and understanding during difficult times, just as you would a friend.";
                break;
            case "what are affirmations?":
                response = "Affirmations are positive statements that can help challenge negative thoughts and promote self-confidence.";
                break;
            case "how can i express my feelings?":
                response = "You can express your feelings through journaling, talking to someone, or engaging in creative activities.";
                break;
            case "what is the best way to start my day?":
                response = "Starting your day with a positive routine, such as meditation or exercise, can set a good tone for the rest of the day.";
                break;
            case "what is self-acceptance?":
                response = "Self-acceptance means recognizing and embracing your strengths and weaknesses without judgment.";
                break;
            case "how can i cope with change?":
                response = "Coping with change can involve maintaining flexibility, seeking support, and focusing on the positive aspects of the change.";
                break;
            case "what is the value of friendships?":
                response = "Friendships provide support, companionship, and a sense of belonging, which are important for mental well-being.";
                break;
            case "i feel like i don't belong":
                response = "Feeling like you don't belong can be challenging. It's important to reach out to those who make you feel included.";
                break;
            case "how can i find purpose?":
                response = "Finding purpose often involves exploring your passions, values, and what brings you joy.";
                break;
            case "what should i do if i feel stuck?":
                response = "Sometimes taking a break, seeking new experiences, or talking to someone can help you feel unstuck.";
                break;
            case "how can i improve my relationships?":
                response = "Improving relationships often requires open communication, empathy, and spending quality time together.";
                break;
                case "i feel really anxious about social situations.":
                response = "It's okay to feel anxious. Consider taking small steps to gradually expose yourself to those situations.";
                break;
            case "what are some ways to cope with rejection?":
                response = "Rejection can be tough. Remember that it's not a reflection of your worth. Surround yourself with supportive people.";
                break;
            case "what can i do to build confidence?":
                response = "Start by setting small goals and celebrating your achievements, no matter how minor.";
                break;
            case "i'm feeling overwhelmed with work.":
                response = "Take a short break to clear your mind, and try to prioritize your tasks.";
                break;
            case "how do i talk to someone about my feelings?":
                response = "Be honest and open. You might start with, 'I need to talk about something that's been bothering me.'";
                break;
            case "what should i do when i'm feeling burned out?":
                response = "Taking time off to recharge is crucial. Engage in activities that bring you joy.";
                break;
            case "i'm having trouble focusing on tasks.":
                response = "Eliminate distractions and set specific time blocks for focused work.";
                break;
            case "what can i do to practice better self-care?":
                response = "Incorporate activities that relax you into your routine, like reading or taking walks.";
                break;
            case "i often feel guilty for taking time for myself.":
                response = "Remember that self-care is essential for your well-being. You deserve that time.";
                break;
            case "how do i let go of past mistakes?":
                response = "Try focusing on the lessons learned rather than dwelling on the mistake itself.";
                break;
            case "i'm struggling with body image issues.":
                response = "It's important to remember that everyone's body is different. Focus on what your body can do, not just how it looks.";
                break;
            case "what can i do to help a friend in distress?":
                response = "Be there for them. Listen without judgment and encourage them to seek professional help if needed.";
                break;
            case "i feel like i’m in a rut.":
                response = "Consider trying new activities or setting new goals to shake things up.";
                break;
            case "how can i make new friends as an adult?":
                response = "Join clubs or groups that align with your interests. Shared activities can help spark new friendships.";
                break;
            case "what are some good coping mechanisms for stress?":
                response = "Exercise, journaling, and talking to a friend are great ways to manage stress.";
                break;
            case "i often compare myself to others.":
                response = "Try to focus on your journey and accomplishments instead of comparing yourself to others.";
                break;
            case "what should i do if i feel misunderstood?":
                response = "Consider discussing your feelings with the person you feel misunderstands you; open communication can help.";
                break;
            case "how can i stop negative self-talk?":
                response = "Challenge negative thoughts by replacing them with positive affirmations.";
                break;
            case "i'm having a hard time adjusting to a new city.":
                response = "Give yourself time to settle in. Explore your new surroundings to help you feel more at home.";
                break;
            case "what are some effective ways to manage anger?":
                response = "Practicing deep breathing or taking a timeout can help you manage your anger.";
                break;
            case "i feel like i can't express my true self.":
                response = "Finding safe spaces or supportive people can help you feel more comfortable expressing yourself.";
                break;
            case "how do i overcome fear of failure?":
                response = "Reframe failure as a learning opportunity rather than a setback.";
                break;
            case "what should i do if i'm feeling jealous?":
                response = "Recognize your feelings and try to focus on your own strengths and accomplishments.";
                break;
            case "i’m struggling to find motivation to exercise.":
                response = "Start small and find activities you enjoy; consistency is key.";
                break;
            case "how do i navigate difficult conversations?":
                response = "Be calm, listen actively, and express your thoughts clearly without blaming the other person.";
                break;
            case "what are some tips for dealing with anxiety attacks?":
                response = "Practice grounding techniques, such as focusing on your breath or counting objects in the room.";
                break;
            case "i feel stuck in my career.":
                response = "Consider setting new professional goals or exploring new opportunities that excite you.";
                break;
            case "how can i be more assertive?":
                response = "Practice using 'I' statements and clearly expressing your needs and boundaries.";
                break;
            case "i'm worried about my future.":
                response = "It's natural to feel worried. Focus on what you can control and set short-term goals.";
                break;
            case "what can i do to improve my listening skills?":
                response = "Practice active listening by maintaining eye contact and summarizing what the other person says.";
                break;
            case "how do i practice mindfulness daily?":
                response = "Set aside a few minutes each day to meditate or simply focus on your breath.";
                break;
            case "i find it hard to forgive myself.":
                response = "Self-forgiveness takes time. Acknowledge your feelings and remember that everyone makes mistakes.";
                break;
            case "what are some strategies to handle difficult coworkers?":
                response = "Keep communication professional, focus on common goals, and set clear boundaries.";
                break;
            case "i'm feeling pressured to meet societal expectations.":
                response = "Remember that your path is unique. It's okay to define success on your own terms.";
                break;
            case "how can i better manage my finances to reduce stress?":
                response = "Create a budget, track your spending, and prioritize saving for emergencies.";
                break;
            case "i feel like i’m always on edge.":
                response = "Consider incorporating relaxation techniques into your routine, like deep breathing or yoga.";
                break;
            case "what can i do to create a positive environment?":
                response = "Surround yourself with positive influences, declutter your space, and practice gratitude.";
                break;
            case "how do i support someone going through a tough time?":
                response = "Be present, listen without judgment, and encourage them to seek help if needed.";
                break;
            case "i'm feeling guilty for wanting to take a break.":
                response = "Taking breaks is essential for mental health. It's okay to prioritize your well-being.";
                break;
            case "what can i do to improve my sleep quality?":
                response = "Establish a bedtime routine, limit screen time before bed, and create a comfortable sleeping environment.";
                break;
            case "i struggle with perfectionism.":
                response = "Aim for progress over perfection. It's okay to make mistakes and learn from them.";
                break;
            case "how can i become more self-aware?":
                response = "Reflect on your thoughts and feelings regularly. Journaling can be a helpful tool.";
                break;
            case "i feel disconnected from my friends.":
                response = "Consider reaching out to reconnect. Sometimes a simple message can open up communication.";
                break;
            case "what should i do if i feel socially isolated?":
                response = "Join clubs or activities that interest you to meet new people with similar interests.";
                break;
            case "i have a hard time saying no to others.":
                response = "Practice assertiveness. It's okay to prioritize your own needs and set boundaries.";
                break;
            case "what are some signs i need to take a mental health day?":
                response = "Feeling overly fatigued, unmotivated, or easily irritated are signs it's time for a mental health break.";
                break;
            case "how can i express gratitude effectively?":
                response = "Consider writing thank-you notes or verbally expressing appreciation to those around you.";
                break;
            case "i'm feeling anxious about starting a new job.":
                response = "It's natural to feel anxious. Prepare as much as you can and focus on what excites you about the role.";
                break;
            case "what are some strategies for coping with grief?":
                response = "Allow yourself to feel your emotions, talk to others, and consider joining a support group.";
                break;
            case "i often feel like i'm not good enough.":
                response = "Challenge those thoughts. Remember that everyone has strengths and weaknesses.";
                break;
            case "how do i build a healthy work-life balance?":
                response = "Set clear boundaries between work and personal time, and prioritize self-care activities.";
                break;
            case "what can i do to improve my emotional resilience?":
                response = "Develop coping strategies, maintain a support network, and practice self-compassion.";
                break;
            case "i feel like i can't cope with everything.":
                response = "It's okay to ask for help. Consider talking to a friend or professional about how you're feeling.";
                break;
            case "how can i deal with feelings of inadequacy?":
                response = "Focus on your strengths and remind yourself of past successes to counter those feelings.";
                break;
                case "i feel overwhelmed with my responsibilities.":
                response = "Try prioritizing your tasks and breaking them down into manageable steps.";
                break;
            case "how can i practice gratitude daily?":
                response = "Consider keeping a gratitude journal where you write down three things you are thankful for each day.";
                break;
            case "i'm afraid of being vulnerable.":
                response = "Vulnerability can be scary but it often leads to deeper connections with others. Start small and share with trusted people.";
                break;
            case "what should i do when i'm feeling lonely?" :
                response = "Reach out to a friend or engage in an activity that interests you to help alleviate loneliness.";
                break;
            case "i have trouble managing my time.":
                response = "Try using a planner to map out your tasks and allocate specific times for each.";
                break;
            case "what can i do to boost my mood?" :
                response = "Engage in activities you enjoy, get some fresh air, or listen to uplifting music.";
                break;
            case "i feel guilty for expressing my needs.":
                response = "Remember that your needs are valid. It's important to communicate them to maintain healthy relationships.";
                break;
            case "how do i cope with seasonal affective disorder?" :
                response = "Consider light therapy, regular exercise, and ensuring you get enough sunlight during the day.";
                break;
            case "i often feel restless.":
                response = "Incorporate regular physical activity into your routine to help manage restlessness.";
                break;
            case "what are some techniques to reduce test anxiety?" :
                response = "Practice relaxation techniques, such as deep breathing, and prepare thoroughly in advance.";
                break;
            case "i struggle to find my purpose.":
                response = "Explore your interests and passions. Sometimes, trying new things can help clarify your purpose.";
                break;
            case "how do i deal with criticism?" :
                response = "Try to view it as constructive feedback rather than a personal attack. Reflect on it and see if there's anything useful you can learn.";
                break;
            case "i feel like i don't belong.":
                response = "It can help to seek communities that share your interests or values. Finding like-minded people can enhance your sense of belonging.";
                break;
            case "what can i do to enhance my creativity?" :
                response = "Engage in activities that inspire you, take breaks, and allow yourself the freedom to experiment.";
                break;
            case "i’m often overwhelmed by emotions.":
                response = "Consider practicing emotional regulation techniques, such as mindfulness or journaling.";
                break;
            case "how can i improve my communication skills?" :
                response = "Practice active listening, maintain eye contact, and work on expressing your thoughts clearly.";
                break;
            case "i feel like i'm not living my life to the fullest.":
                response = "Reflect on what 'living fully' means to you and set small goals to align your actions with your values.";
                break;
            case "what should i do when i feel envious?" :
                response = "Acknowledge your feelings and try to shift your focus to your own accomplishments and goals.";
                break;
            case "how do i establish healthy boundaries?" :
                response = "Clearly communicate your limits to others and practice saying no when necessary.";
                break;
            case "i feel pressured to conform.":
                response = "It's important to stay true to yourself. Reflect on your values and resist external pressures that don't align with them.";
                break;
            case "what are some strategies for effective problem-solving?" :
                response = "Break the problem into smaller parts, brainstorm potential solutions, and evaluate the pros and cons of each.";
                break;
            case "i often feel insecure in my relationships.":
                response = "Open communication with your partner can help alleviate insecurities. Discuss your feelings with them.";
                break;
            case "how can i practice self-compassion?" :
                response = "Treat yourself with kindness, just as you would treat a friend in a similar situation.";
                break;
            case "i struggle with feeling overwhelmed by negative news.":
                response = "Limit your media consumption and take breaks from the news to protect your mental health.";
                break;
            case "how do i manage my expectations?" :
                response = "Set realistic and achievable goals, and be flexible with your plans to avoid disappointment.";
                break;
            case "i feel lost in my career.":
                response = "Consider seeking a mentor or career counselor to help clarify your goals and path forward.";
                break;
            case "what can i do to boost my self-esteem?" :
                response = "Engage in activities that make you feel good about yourself and surround yourself with positive influences.";
                break;
            case "i often feel disconnected from my emotions.":
                response = "Try to practice mindfulness and check in with yourself regularly to reconnect with your feelings.";
                break;
            case "how can i improve my coping skills?" :
                response = "Experiment with different coping techniques and find what works best for you, such as exercise or creative outlets.";
                break;
            case "i feel drained after social interactions.":
                response = "It's okay to take time for yourself after socializing. Schedule downtime to recharge.";
                break;
            case "what should i do if i have a negative mindset?" :
                response = "Challenge negative thoughts and try to focus on positive aspects of your life.";
                break;
            case "i feel like i'm stuck in a negative cycle.":
                response = "Identify triggers that contribute to the cycle and work on strategies to break free from them.";
                break;
            case "how do i enhance my emotional intelligence?" :
                response = "Practice self-reflection and empathy, and seek feedback from others to improve your understanding of emotions.";
                break;
            case "i struggle with saying no.":
                response = "Practice asserting your needs and remember that it's okay to prioritize your own well-being.";
                break;
            case "what are some ways to manage chronic stress?" :
                response = "Incorporate relaxation techniques into your daily routine, such as yoga or meditation.";
                break;
            case "i often feel anxious about change.":
                response = "Try to view change as an opportunity for growth and embrace the possibilities it brings.";
                break;
            case "how do i build a support network?" :
                response = "Reach out to friends, family, or community groups that share your interests to foster connections.";
                break;
            case "i feel overwhelmed by decision-making.":
                response = "Limit your options to a few choices and take your time to evaluate them before making a decision.";
                break;
            case "what can i do to stay positive during tough times?" :
                response = "Focus on gratitude and find small moments of joy to help shift your perspective.";
                break;
            case "i often feel like giving up.":
                response = "It's important to acknowledge these feelings. Consider reaching out for support to help you through difficult times.";
                break;
            case "how do i maintain motivation?" :
                response = "Set clear, achievable goals and remind yourself of your reasons for pursuing them.";
                break;
            case "i feel anxious about public speaking.":
                response = "Practice your speech in front of a trusted friend or use visualization techniques to calm your nerves.";
                break;
            case "what should i do when i feel overwhelmed with emotions?" :
                response = "Take a break, practice deep breathing, and try to identify the source of your emotions.";
                break;
            case "i struggle with focusing on positive outcomes.":
                response = "Challenge negative thoughts by actively seeking out positive aspects in your situation.";
                break;
            case "how do i find balance in my life?" :
                response = "Assess your priorities and make time for activities that nurture both your personal and professional life.";
                break;
            case "i often feel stressed about finances.":
                response = "Create a budget, track your expenses, and seek financial advice if needed to reduce stress.";
                break;
            case "what are some strategies for effective stress management?" :
                response = "Regular exercise, mindfulness practices, and hobbies you enjoy can all help manage stress.";
                break;
            case "i feel like i can't catch a break.":
                response = "It's okay to feel overwhelmed. Take a moment to breathe and consider what you can control in your life.";
                break;
            case "how can i learn to trust others?" :
                response = "Start small by opening up to someone you trust and gradually build your comfort level.";
                break;
            case "i struggle with setting personal goals.":
                response = "Start by identifying your values and interests, then set specific, measurable goals based on them.";
                break;
            case "what should i do if i feel stuck in my routine?" :
                response = "Introduce small changes to your daily routine to create variety and excitement.";
                break;
            case "how do i handle feelings of inadequacy?" :
                response = "Focus on your strengths and accomplishments, and remind yourself that everyone has challenges.";
                break;
            case "i often feel pressured to succeed.":
                response = "Remember that success is subjective. Define what success means to you, and don't compare yourself to others.";
                break;
                case "how can i deal with negative self-talk?":
                response = "Challenge negative thoughts by replacing them with positive affirmations.";
                break;
            case "i often feel burnt out.":
                response = "It's important to take breaks and prioritize self-care to prevent burnout.";
                break;
            case "what should i do when i'm feeling hopeless?":
                response = "Reach out to someone you trust for support, and consider seeking professional help.";
                break;
            case "how can i stay focused at work?":
                response = "Set clear goals and break your tasks into smaller, manageable chunks.";
                break;
            case "i feel like no one understands me.":
                response = "It can help to talk to someone who shares similar experiences or feelings.";
                break;
            case "i feel stressed about the future.":
                response = "Focus on what you can control today, and take things one step at a time.";
                break;
            case "how do i become more resilient?":
                response = "Practice positive thinking and seek support during tough times to build resilience.";
                break;
            case "i struggle with feeling motivated.":
                response = "Set small, achievable goals to build momentum and boost your motivation.";
                break;
            case "what should i do when i feel disconnected from myself?":
                response = "Try engaging in mindfulness exercises or journaling to reconnect with your feelings.";
                break;
            case "how can i find joy in everyday life?":
                response = "Practice gratitude and take time to enjoy simple pleasures each day.";
                break;
            case "i often feel anxious in social situations.":
                response = "Practice deep breathing techniques and prepare topics to discuss in advance.";
                break;
            case "what can i do to feel more grounded?":
                response = "Engage in mindfulness exercises, such as meditation or yoga, to feel more centered.";
                break;
            case "i feel trapped in my thoughts.":
                response = "Try writing down your thoughts or talking them out with someone to gain perspective.";
                break;
            case "how do i manage feelings of jealousy?":
                response = "Reflect on the underlying reasons for your jealousy and work on self-improvement.";
                break;
            case "i struggle with maintaining healthy habits.":
                response = "Start with small changes and gradually build on them to create lasting habits.";
                break;
            case "what should i do if i'm feeling overwhelmed with changes?":
                response = "Acknowledge your feelings and take time to adapt. Rely on your support network for help.";
                break;
            case "how can i find balance in my work and personal life?":
                response = "Set clear boundaries and prioritize self-care to maintain balance.";
                break;
            case "i feel like i’m always comparing myself to others.":
                response = "Focus on your own journey and accomplishments rather than comparing yourself to others.";
                break;
            case "what can i do to improve my decision-making skills?":
                response = "Gather information, weigh your options, and trust your instincts.";
                break;
            case "i often feel pressure to meet others' expectations.":
                response = "Communicate your boundaries and remember that your worth isn't defined by others.";
                break;
            case "how do i cope with grief?" :
                response = "Allow yourself to feel your emotions and seek support from friends, family, or a counselor.";
                break;
            case "i struggle with procrastination.":
                response = "Break tasks into smaller steps and set deadlines to stay on track.";
                break;
            case "what should i do when i feel unmotivated to exercise?" :
                response = "Find activities you enjoy and start with short workouts to build a routine.";
                break;
            case "how can i improve my listening skills?" :
                response = "Practice active listening by focusing fully on the speaker and responding thoughtfully.";
                break;
            case "i feel anxious about making new friends.":
                response = "Start by joining groups or activities that interest you to meet like-minded people.";
                break;
            case "what can i do to support a friend in crisis?" :
                response = "Be there for them, listen without judgment, and encourage them to seek professional help if needed.";
                break;
            case "i often feel misunderstood.":
                response = "Consider expressing your feelings openly to those around you to foster understanding.";
                break;
            case "how do i deal with feelings of inadequacy?" :
                response = "Recognize your strengths and achievements, and remember that everyone has struggles.";
                break;
            case "i struggle with making time for self-care.":
                response = "Schedule self-care activities as you would any important appointment to prioritize them.";
                break;
            case "what should i do when i feel overwhelmed by responsibilities?" :
                response = "Prioritize tasks and delegate when possible. Don’t hesitate to ask for help.";
                break;
            case "how can i overcome negative habits?" :
                response = "Identify triggers for your habits and replace them with healthier alternatives.";
                break;
            case "i feel uncomfortable in my own skin.":
                response = "Focus on self-acceptance and engage in activities that make you feel good about yourself.";
                break;
            case "what are some ways to express my feelings?" :
                response = "Consider journaling, talking to a trusted friend, or using creative outlets like art.";
                break;
            case "i often feel like an imposter.":
                response = "Remind yourself of your accomplishments and recognize that many people share these feelings.";
                break;
            case "how do i handle conflicts in relationships?" :
                response = "Communicate openly and seek to understand the other person's perspective.";
                break;
            case "i feel like i can't be myself around others.":
                response = "Practice self-acceptance and surround yourself with supportive people who appreciate you as you are.";
                break;
            case "what can i do to cultivate mindfulness?" :
                response = "Engage in meditation, focus on your breath, and practice being present in the moment.";
                break;
            case "i often feel drained after socializing.":
                response = "It's okay to take breaks and recharge after social interactions to maintain your energy.";
                break;
            case "how do i cope with feelings of loneliness?" :
                response = "Reach out to friends or engage in hobbies that bring you joy to help alleviate loneliness.";
                break;
            case "i struggle with finding my voice.":
                response = "Practice expressing your thoughts and feelings in safe environments to build confidence.";
                break;
            case "what can i do to create a positive mindset?" :
                response = "Focus on gratitude, surround yourself with positivity, and challenge negative thoughts.";
                break;
            case "i feel anxious about future events.":
                response = "Focus on the present moment and take steps to prepare for upcoming events rather than worrying.";
                break;
            case "how can i stay calm in stressful situations?" :
                response = "Practice deep breathing techniques and remind yourself to take things one step at a time.";
                break;
            case "i often feel a sense of dread.":
                response = "Reflect on what may be causing these feelings and consider discussing them with a professional.";
                break;
            case "what should i do when i feel stuck in my job?" :
                response = "Explore new opportunities for growth or consider discussing your career path with a mentor.";
                break;
            case "how can i improve my emotional regulation?" :
                response = "Practice identifying your emotions and using coping strategies to manage them effectively.";
                break;
            case "i feel overwhelmed by social media.":
                response = "Consider taking breaks from social media to focus on real-life interactions.";
                break;
            case "what can i do to feel more confident?" :
                response = "Set small goals for yourself and celebrate your achievements to build confidence.";
                break;
            case "i often struggle with self-doubt.":
                response = "Challenge negative thoughts by focusing on your strengths and accomplishments.";
                break;

            default:
                response = "I'm not sure how to respond to that. Can you tell me more or ask something else?";
        }
        return response; // Return the response for any input
    }
}
