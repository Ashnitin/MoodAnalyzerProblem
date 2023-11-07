package com.bridgelabz;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
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
        if(message.contains("SAD")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        }
        else {
            return null;
        }
    }
    public String given_null_with_should_Return_Happy(){
        try {
            if (message.contains("happy")){
                return "HAPPY";
            } else{
                return "SAD";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
    public String givenNullThrowCustomException() throws MoodNullException {
        try {
            if (message.contains("Happy")) {
                return "HAPPY";
            }
            else {
                return "SAD";
            }
        } catch (NullPointerException e) {
            throw new MoodNullException("Empty Mood");
        }
    }
}
