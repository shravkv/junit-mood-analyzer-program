package com.bridgelabz;

public class MoodAnalyzer {
    public String analyzeMood(String message) {
        if (message.contains("Iam in Sad Mood"))
            return "SAD";
        else
            return "HAPPY";
    }
}
