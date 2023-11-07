package com.test;

import com.bridgelabz.MoodAnalyzer;
import com.bridgelabz.MoodNullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyzer moodanalyzer =new MoodAnalyzer();
        String mood=moodanalyzer.analyzeMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood=moodAnalyzer.analyzeMood("This is Happy Message");
        Assertions.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenIn_SadMoodMessageConstructorShouldReturnSAD(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in sad Mood");
        Assertions.assertEquals("SAD",moodAnalyzer.givenConstructorShouldReturnSAD());
    }
    @Test
    public void givenIn_HappyMoodMessageConstructorShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in happy Mood");
        Assertions.assertEquals("HAPPY",moodAnalyzer.givenConstructorShouldReturnSAD());
    }
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        Assertions.assertEquals("HAPPY",moodAnalyzer.given_null_with_should_Return_Happy());
    }
    @Test
    public void givenNullMoodThrowCustomException() throws MoodNullException {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        Assertions.assertEquals(null,moodAnalyzer.givenNullThrowCustomException());
    }
}
