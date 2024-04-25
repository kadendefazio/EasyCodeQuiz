/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit130classassignments;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kaden
 */
public class Interm extends Questions{
        // Method to return entire list of questions
            ArrayList<Questions> questionsList = new ArrayList();

    public ArrayList<Questions> getQuestions2() {
        // The list to store all questions
        questionsList = new ArrayList();
       
        
        // Create question Object
        // Question 1
        Questions bQuestion1 = new Questions("What is a UML Diagram used for?"
                + "\nA.)To visualize  and document the code structure before actually executing it"
                + "\nB.)It's the place where you start coding."
                + "\nC.)Desigining user interfaces."
                + "\nD.)Debugging software."
                + "\nSubmit Answer here -->: ", "A is correct because a UML diagram does document and visualize the code structure. A sort-of rough draft.", "A");
        //Question 2
        Questions bQuestion2 = new Questions("What is Pseudocode?"
                + "\nA.)Describing the logic  of a computer program using simplified language and code-like structures."
                + " \nB.)A language used for writing code in web development \nC.)A type of code used for encrypting sensitive information."
                + " \nD.)A method that debugs applications. \nSubmit Answer Here -->: " , "A is the correct answer because"
                        + " Correct because it uses the the logic of a computer program using simplified language and code-like structures", "A");
        //Question 3
        Questions bQuestion3 = new Questions("What is the difference between a default constructor and a fully loaded constructor?"
                + " \nA.)A default constructor has no parameters, while a fully loaded constructor can have multiple parameters \nB.)A default constructor is provided by the compiler, while a fully loaded constructor must be defined by the programmer."
                + "\nC.)A default constructor initializes all instance variables to default values, while a fully loaded constructor allows the programmer to specify initial values for instance variables \nD.)A default constructor is used for creating objects without any initialization, while a fully loaded constructor is  used when specific initialization is required. \nSubmit Answer Here -->: ","This is correct because a default constructor has NO parameters, but a fully loaded constructor has MULTIPLE parameters."
                        ,"A");
        //Question 4
        Questions bQuestion4 = new Questions("What does GUI stand for? "
                + "\nA.)Graphical User Interface \nB.)G-Force Utilization Interface \nC.)Galactic Universe Investigator \nD.)Gnarly User Interaction \nSubmit Answer Here -->: ",
                "This is correct because in Java, GUI stands for Graphical User Interface","A");
        //Question 5
        Questions bQuestion5 = new Questions("What does the this function do? \nA.)It refers to the current class itself, allowing access to its member variables and methods"
                + " \nB.)It refers to the parent class of the current class, accessing inherited member variables and methods \nC.)It refers to the object currently being operated on, enabling access to its properties amd behaviors. \nD.)It refers to the global scope of the program, accessing variables and methods across all classes. \nSubmit Answer Here -->: ","Correct because it perfectly explains what a this function does","A");
        /*
        public Questions(String question, String questChoice, 
                 String explanations, String answer) 
        */
        
        // Add question Object to the list
        questionsList.add(bQuestion1);
        questionsList.add(bQuestion2);
        questionsList.add(bQuestion3);
        questionsList.add(bQuestion4);
        questionsList.add(bQuestion5);
       
        Collections.shuffle(questionsList);
        
        return questionsList;
    }
    
    protected String[] getAnswerKey() {
        String[] answerKey = {
              questionsList.get(0).getAnswer(), 
            questionsList.get(1).getAnswer(),
            questionsList.get(2).getAnswer(),
            questionsList.get(3).getAnswer(),
            questionsList.get(4).getAnswer()};
        return answerKey;
    }
    
    protected String[] getExplanationKey() {
        
        String[] answerKey = {
            questionsList.get(0).getExplanations(),
            questionsList.get(1).getExplanations(),
            questionsList.get(2).getExplanations(),
            questionsList.get(3).getExplanations(),
            questionsList.get(4).getExplanations(),
        };
        return answerKey;
    }
    
}
    
}
