package com.test;

import com.bridgelabz.MoodAnalyzer;
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
}
