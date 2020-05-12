package org.launchcode.java.studios.inheritance;

import exercises.Array;

import java.util.ArrayList;

public class CheckBox extends Question{
    ArrayList<Integer> correctAnswers;
    public CheckBox(String query) {
        super(query);
    }
   public Boolean checkAnswer(ArrayList<Integer>userAnswers){
        Integer numberOfCorrectAnswers = correctAnswers.size();
        Integer counter = 0;
        if (userAnswers.size() != numberOfCorrectAnswers){
            return false;
        }
        for (Integer answer: userAnswers){
            if(!correctAnswers.contains(answer)){
                return false;
            }
            else {
                counter++;
            }
        }
        return counter == numberOfCorrectAnswers;
   }

}
