# Mental Support Chat Bot

## Overview
I have created the **Mental Support Chat Bot**, an interactive console-based application designed to provide emotional support and guidance to users facing various mental health challenges. Built using Java and the Maven build system, this chatbot strives to create a friendly and understanding environment where users can freely express their feelings and receive tailored responses based on keyword recognition.

While the bot primarily operates through a set of predefined responses linked to specific keywords, it encourages open dialogue by prompting users to elaborate on their feelings and experiences. This project underscores the importance of accessibility and support in mental health, making it easier for individuals to engage in conversations about their emotional well-being.

The **Mental Support Chat Bot** serves as a valuable tool for mental health support, facilitating interactive conversations that offer empathetic feedback and guidance tailored to a range of emotions and situations. By fostering a safe space for dialogue, this application aims to help users navigate their feelings and connect with the support they need.

![image](https://github.com/user-attachments/assets/b6e57383-6bd5-4254-be28-a88cd83aced0)


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
