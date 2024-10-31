# Mental Support Chat Bot

## Overview
I have created the **Mental Support Chat Bot**, an interactive, AI-driven application designed to provide emotional support and guidance to users experiencing various mental health challenges. Utilizing Java and the Maven build system, this chatbot aims to create a friendly and understanding environment where users can express their feelings and receive tailored responses.

The chatbot employs a dynamic keyword-response system that allows it to recognize and respond to a wide range of emotions and situations. By leveraging a comprehensive set of predefined responses, the bot engages users in meaningful conversations, addressing their specific concerns such as stress, anxiety, sadness, and loneliness. It encourages users to elaborate on their feelings, fostering a deeper dialogue that can lead to more constructive and supportive interactions.

Additionally, the Mental Support Chat Bot is designed with user-friendliness in mind. The interface is straightforward, making it easy for users to communicate without feeling overwhelmed. The bot's goal is to provide a safe space where individuals can share their thoughts and feelings without judgment, ultimately promoting mental wellness and emotional resilience.

Through ongoing development, I aim to enhance the bot's capabilities, incorporating machine learning algorithms and natural language processing techniques to improve its understanding and responsiveness. This project not only serves as a technological endeavor but also as a personal mission to contribute positively to mental health awareness and support.

The **Mental Support Chat Bot** is a Java-based application designed to provide users with mental health support through interactive conversations. The bot utilizes a set of predefined responses based on user input to facilitate meaningful exchanges, offering empathetic feedback and guidance for various emotions and situations.

## Features
1. **Interactive Conversations**: Engages users with personalized responses based on their feelings and queries.
2. **Keyword Recognition**: Utilizes keyword matching to identify user emotions and provide relevant support.
3. **Dynamic Responses**: Offers a wide range of responses to create a more engaging user experience.
4. **User-Friendly Interface**: Simple console-based interaction that is easy to use for anyone.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 21 or higher
- Apache Maven 3.9.9 or higher

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/iamafridi/Mental-Support-ChatBot.git

### Navigate to the project directory:
cd Mental-Support-ChatBot

### Build the project using Maven:
mvn clean install

### Running the Application
To run the chat bot, use the following command:
mvn exec:java -Dexec.mainClass="com.example.chatbot.Main"

### Usage
Once the application is running, you will see a welcome message.
Type your queries or feelings and press enter.
You can exit the chat by typing exit.

### Customizing Responses
You can easily modify or add new responses by updating the DynamicChatBot class. Here’s how:

Open the DynamicChatBot.java file in your preferred code editor.
Locate the responses map initialization block.
Add new keyword-response pairs as needed. For example:
responses.put("excited", "Excitement is wonderful! What are you excited about?");

### Contributing
If you would like to contribute to this project, feel free to open a pull request or report any issues.

### License
This project is licensed under the MIT License. See the LICENSE file for details.

### Contact
For any inquiries, you can reach me at : iamafridi.netlify.app