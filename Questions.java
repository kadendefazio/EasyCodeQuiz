/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit130classassignments;

/**
 *
 * @author kaden
 */
public class Questions {
    
    private int questionsRight = 5;
    private int questionsWrong; 
    private int questionPercentage;
    private boolean questTrue; //may not need
    public String question;
    public String questChoice;
    public String explanations;
    private String answer;
    
    
    //Default Constructuor
    public Questions(){}

    //Overloaded Constructor
    public Questions(String question, 
                 String explanations, String answer) 
    {
      //this.questionsRight = questionsRight;
      //this.questionsWrong = questionsWrong;
      //this.questionPercentage = questionPercentage;
      this.question = question;
      this.explanations = explanations;
      //this.questTrue = questTrue;
      this.questChoice = questChoice; // TODO: How/Where will we get this info?
      this.answer = answer;
    }


    

    public void setQuestionsRight(int questionsRight) {
        this.questionsRight = questionsRight;
    }

    public int getQuestionsAnswer() {
         if(!answer.equalsIgnoreCase(questChoice)){
           questionsRight--;
        }

         return questionsRight;
    }

    public void setQuestionsWrong(int questionsWrong) {
        this.questionsWrong = questionsWrong;
    }

    public double getQuestionPercentage() {
        int totalQuestions = questionsRight + questionsWrong;
        if(totalQuestions == 0) {
            return 0;
        }
        return (questionsRight * 100) / (double)totalQuestions;
    }

    public void setQuestionPercentage(int questionPercentage) {
        this.questionPercentage = questionPercentage;
    }

    public boolean isQuestTrue() {
        return questTrue;
    }

    public void setQuestTrue(boolean questTrue) {
        this.questTrue = questTrue;
    }

    public String getQuestions() {
        return question;
    }

    public void setQuestions(String questions) {
        this.question = question;
    }

    public String getQuestChoice(String questChoice) {
        this.questChoice = questChoice;
        return this.questChoice;
    }

    public void setQuestChoice(String questChoice) {
        this.questChoice = questChoice;
    }

    public String getExplanations() {
        return explanations;
    }

    public void setExplanations(String explanations) {
        this.explanations = explanations;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
   
    
   
    
    
}
