package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (message.contains("Iam in Sad Mood")) {
                return "SAD";
            }
            return "HAPPY";
        } catch (Exception e) {
            return "HAPPY";
        }
    }
}