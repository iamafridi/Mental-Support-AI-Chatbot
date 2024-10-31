package com.example.chatbot;

import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ResourceManager {
    private JsonObject responses;

    public ResourceManager() {
        loadResponses();
    }

    private void loadResponses() {
        try (FileReader reader = new FileReader("src/main/resources/responses.json")) {
            Gson gson = new Gson();
            responses = gson.fromJson(reader, JsonObject.class);
            System.out.println("Responses loaded successfully.");
        } catch (IOException e) {
            System.err.println("Error loading responses: " + e.getMessage());
        }
    }

    public String getResponse(String mood) {
        return responses.get(mood).getAsString();
    }
}
