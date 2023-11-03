package com.bridgelabz;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
        analyzeMood(message);
    }

    public String analyzeMood(String message) {
        if(message.contains("Sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
    public String givenConstructorShouldReturnSAD(){
        if(message.contains("sad")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        }
        else {
            return null;
        }
    }
}
