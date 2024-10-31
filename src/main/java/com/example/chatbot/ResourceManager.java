package com.example.chatbot;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.io.Reader;

public class ResourceManager {
    private JsonObject responses;

    public ResourceManager() {
        loadResponses();
    }

    private void loadResponses() {
        try (Reader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("responses.json"))) {
            responses = JsonParser.parseReader(reader).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getResponse(String sentiment) {
        return responses.get(sentiment).getAsString();
    }
}
