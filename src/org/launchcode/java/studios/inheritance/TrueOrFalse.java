package org.launchcode.java.studios.inheritance;

public class TrueOrFalse extends Question{
    private Boolean correctAnswer;
    public TrueOrFalse(String query) {
        super(query);
    }
    public Boolean compareAnswers(Boolean userAnswer){
        if(userAnswer == correctAnswer){
            return true;
        }
        return false;
    }
}
