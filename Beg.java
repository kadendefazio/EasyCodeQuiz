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
 * array list goes in beg,intermediate,behavioral
 */
public class Beg extends Questions {
    
    
   ArrayList<Questions> questionsList;
    // Method to return entire list of questions
    public ArrayList<Questions> getQuestions2() {
        // The list to store all questions
        
       questionsList = new ArrayList();
        
        // Create question Object
        // Question 1
        Questions bQuestion1 = new Questions("What is the difference between a 'while' loop and a 'do while' loop?"
                + "\nA.)A 'while' loop checks the condition first and if true, the code within runs. However, if returned false, the code will stop. "
                + "A 'do while' loop runs code once before it checks and the code runs again if true." + "\nB.)A 'do while' loop checks the condition first "
                + "and if true, the code within runs. However, if returned false, the code will stop. A 'while' loop runs code once vefore it checks the code and runs again if true. "
                + "\nC.)The 'while' loop is a block of code that one calls to perform specific actions mentioned in it. The 'do while' loop is a template used to create objects that can define data types and methods."
                + "\nD.)A 'do while' loop is a given set of statements multiple times. The 'while' loop is a loop that can only be used in a collection of items."
                + "\nSubmit Answer here -->: ", "Correct because A 'while' loop checks the condition first and if true, the code within runs. However, if returned false, the code will stop.", "A");
        //Question 2
        Questions bQuestion2 = new Questions("How do you calculate the average of integers? "
                + "\nA.)(intOne + intTwo + intThree) / totalAverage; \nB.)stringOne + stringTwo"
                + " + stringThree * totalAverage; \nC.)intOne * intTwo * intThree / totalAverage;"
                + " \nD.)intOne - intTwo - intThree / totalAverage; \nSubmit Answer Here -->: " , "A is the correct answer because"
                        + " the equation to find the average is (a + b + c) / average.", "A");
        //Question 3
        Questions bQuestion3 = new Questions("Which of the following is NOT a valid method declaration?"
                + " \nA.)public void doSomething(Scanner sc){} \nB.)private int calculate(int x, int y){} \nC.)public void myMethod(int x, int y){}"
                + " \nD.)protected String getName(){} \nSubmit Answer Here -->: "," This is correct because it lacks a type for the second parameter 'y'. It requires an int"
                        + " before the 'y' to work properly.","C");
        //Question 4
        Questions bQuestion4 = new Questions("How do you declare an array in java? Select the correct answer. "
                + "\nA.)int arr[] \nB.)int arr[5] \nC.)int arr[5] = {1, 2, 3, 4, 5} \nD.)int[] arr \nSubmit Answer Here -->: ",
                "Correct because it declares an array variable named 'arr' and type 'int[]' indicating "
                        + " that 'arr' will be referenced as an array of integers","D");
        //Question 5
        Questions bQuestion5 = new Questions("What is the purpose of the 'Scanner' class in Java? \nA.)To print the output to the console"
                + " \nB.)To read input from the user \nC.)To perform mathematical calculations \nD.)To create methods \nSubmit Answer Here -->: ","Correct because the scanner does read user input","B");
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

       
        // Attempt to shuffle
        Collections.shuffle(questionsList);
//        ArrayList<Integer> duplicates = new ArrayList();
//        System.out.println(duplicates + " HERE IS THE LIST");
//        int random;
//        ArrayList<Questions> shuffledQuestionsList = new ArrayList();
//        for (int i = 0; i < questionsList.size(); i++) {
//            random = (int)(Math.random() * questionsList.size());
//            if (duplicates.contains(random)) {
//                System.out.println("Question " + (random + 1) + " Already in list");
//                i--;
//            } else {
//                System.out.println("Adding question " + (random + 1) + " to the list");
//                duplicates.add(random);
//                shuffledQuestionsList.add(questionsList.get(random));
//                
//            }
//        }
        
        
        
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
