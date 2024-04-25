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
public class allQuestions extends Questions {
        // Method to return entire list of questions
    ArrayList<Questions> questionsList;
    
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
       //Question 6
         Questions bQuestion6 = new Questions("What is a UML Diagram used for?"
                + "\nA.)To visualize  and document the code structure before actually executing it"
                + "\nB.)It's the place where you start coding."
                + "\nC.)Desigining user interfaces."
                + "\nD.)Debugging software."
                + "\nSubmit Answer here -->: ", "A is correct because a UML diagram does document and visualize the code structure. A sort-of rough draft.", "A");
        //Question 7
        Questions bQuestion7 = new Questions("What is Pseudocode?"
                + "\nA.)Describing the logic  of a computer program using simplified language and code-like structures."
                + " \nB.)A language used for writing code in web development \nC.)A type of code used for encrypting sensitive information."
                + " \nD.)A method that debugs applications. \nSubmit Answer Here -->: " , "A is the correct answer because"
                        + " Correct because it uses the the logic of a computer program using simplified language and code-like structures", "A");
        //Question 8
        Questions bQuestion8 = new Questions("What is the difference between a default constructor and a fully loaded constructor?"
                + " \nA.)A default constructor has no parameters, while a fully loaded constructor can have multiple parameters \nB.)A default constructor is provided by the compiler, while a fully loaded constructor must be defined by the programmer."
                + "\nC.)A default constructor initializes all instance variables to default values, while a fully loaded constructor allows the programmer to specify initial values for instance variables \nD.)A default constructor is used for creating objects without any initialization, while a fully loaded constructor is  used when specific initialization is required. \nSubmit Answer Here -->: ","This is correct because a default constructor has NO parameters, but a fully loaded constructor has MULTIPLE parameters."
                        ,"A");
        //Question 9
        Questions bQuestion9 = new Questions("What does GUI stand for? "
                + "\nA.)Graphical User Interface \nB.)G-Force Utilization Interface \nC.)Galactic Universe Investigator \nD.)Gnarly User Interaction \nSubmit Answer Here -->: ",
                "This is correct because in Java, GUI stands for Graphical User Interface","A");
        //Question 10
        Questions bQuestion10 = new Questions("What does the this function do? \nA.)It refers to the current class itself, allowing access to its member variables and methods"
                + " \nB.)It refers to the parent class of the current class, accessing inherited member variables and methods \nC.)It refers to the object currently being operated on, enabling access to its properties amd behaviors. \nD.)It refers to the global scope of the program, accessing variables and methods across all classes. \nSubmit Answer Here -->: ","Correct because it perfectly explains what a this function does","A");
        //Question 11
        Questions bQuestion11 = new Questions(")Imagine a situation where you have to collaborate with a team to solve a problem in Java. How would you approach it?"
                + "\nA.)I collaborated with my team on a Java project where we implemented a multithreading solution to improve performance"
                + "\nB.)I worked alone on all my Java projects; teamwork isn't really my thing."
                + "\nC.)I let my team handle most of the coding while I focused on other tasks."
                + "\nD.)I disagreed with my team's approach and implemented my own solution without consulting."
                + "\nSubmit Answer here -->: ", "This answer showcases the ability to work effectively within a team environment, leveraging collective skills and knowledge to tackle a problem.", "A");
        //Question 12
        Questions bQuestion12 = new Questions("Imagine a situation where you encountered a bug in a beginner-level Java program and fixed it. Which of these choices would work the best?"
                + "\nA.)I encountered a bug in a simple Java program that was caused by a typo in a variable name. I quickly identified and corrected the typo, resolving the issue."
                + "\nB.)I couldn't fix the bug, so I gave up on the program altogether"
                + "\nC.)I ignored the bug and hoped it would magically disappear on its own."
                + "\nD.)I blamed someone else for the bug and didn't attempt to fix it myself."
                + "\nSubmit Answer here -->: ", "This is correct because this response showcases the candidate's ability to analyze code, identify errors, and apply the necessary corrections. It demonstrates attention to detail and the willingness to take ownership of resolving issues. ", "A");
        
        //Question 13
        Questions bQuestion13 = new Questions("Imagine: Think about a time when you refactored a basic Java program to make it more organized. Pick the best option from the choices below."
                + "\nA.)I refactored a basic Java program by splitting long methods into smaller, more manageable ones and organizing related code into separate classes, improving code structure and readability."
                + "\nB.)I didn't see the point of refactoring; the program worked fine as it was."
                + "\nC.)I added more code to the existing program without restructuring anything, making it even messier."
                + "\nD.)I refactored the program by deleting code that I thought was unnecessary, without considering its impact on functionality."
                + "\nSubmit Answer here -->: ", "This is correct because this response shows an understanding of the importance of breaking down complex logic into smaller, more manageable components. By splitting long methods and organizing related code into separate classes, the candidate improves code readability and facilitates future modifications or enhancements. ", "A");
        //Question 14
        Questions bQuestion14 = new Questions("Tell me about a situation where you used comments effectively in a Java program to improve code readability. Select the best choice from the options below."
                + "\nA.)In a Java program, I used comments to document complex algorithms, explain the purpose of methods, and provide context for future modifications, enhancing code readability and maintainability for myself and other developers."
                + "\nB.)I avoided using comments in my Java projects because I think they clutter the code."
                + "\nC.)I used comments to describe what each line of code does without providing overall context or explanation, resulting in redundant and verbose comments."
                + "\nD.)I relied solely on self-explanatory variable and method names without using comments, assuming that the code would be easy to understand without additional documentation."
                + "\nSubmit Answer here -->: ", "This is correct because this response shows that the candidate recognizes the value of using comments to explain intricate parts of the code, making it easier for others (and themselves in the future) to understand the logic behind it.", "A");
        //Question 15
        Questions bQuestion15 = new Questions("Imagine you're working on a group project to create a simple Java program. One of your team members seems unsure about their tasks and frequently asks for assistance, which slows down the progress of the project. How would you handle this situation?"
                + "\nA.)Offer to provide additional explanations or tutorials to help the team member grasp the concepts better."
                + "\nB.)Take over their tasks to ensure they are completed on time, avoiding delays in the project."
                + "\nC.)Encourage the team member to seek help from online resources or tutorials to build their skills independently."
                + "\nD.)Schedule regular check-ins with the team member to review their progress and address any difficulties they may be facing."
                + "\nSubmit Answer here -->: ", "This is correct because it demonstrates a a proactive approach to supporting the struggling team member by offering assistance and guidance. It promotes teamwork and collaboration while ensuring that the project can move forward without unnecessary delays. Additionally, it shows empathy and willingness to help others learn, which are valuable qualities in a team environment.", "A");
        
        
        /*
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
        questionsList.add(bQuestion6);
        questionsList.add(bQuestion7);
        questionsList.add(bQuestion8);
        questionsList.add(bQuestion9);
        questionsList.add(bQuestion10);
        questionsList.add(bQuestion11);
        questionsList.add(bQuestion12);
        questionsList.add(bQuestion13);
        questionsList.add(bQuestion14);
        questionsList.add(bQuestion15);
    
        
        
        
        
       
        Collections.shuffle(questionsList);
        
        return questionsList;
    }
    
    protected String[] getAnswerKey() {
        String[] answerKey = {
            questionsList.get(0).getAnswer(), 
            questionsList.get(1).getAnswer(),
            questionsList.get(2).getAnswer(),
            questionsList.get(3).getAnswer(),
            questionsList.get(4).getAnswer(),
            questionsList.get(5).getAnswer(),
            questionsList.get(6).getAnswer(),
            questionsList.get(7).getAnswer(),
            questionsList.get(8).getAnswer(),
            questionsList.get(9).getAnswer(),
            questionsList.get(10).getAnswer(),
            questionsList.get(11).getAnswer(),
            questionsList.get(12).getAnswer(),
            questionsList.get(13).getAnswer(),
            questionsList.get(14).getAnswer()
        };


        
        return answerKey;
    }
    
    protected String[] getExplanationKey() {
        
        String[] answerKey = {
            questionsList.get(0).getExplanations(),
            questionsList.get(1).getExplanations(),
            questionsList.get(2).getExplanations(),
            questionsList.get(3).getExplanations(),
            questionsList.get(4).getExplanations(),
            questionsList.get(5).getExplanations(),
            questionsList.get(6).getExplanations(),
            questionsList.get(7).getExplanations(),
            questionsList.get(8).getExplanations(),
            questionsList.get(9).getExplanations(),
            questionsList.get(10).getExplanations(),
            questionsList.get(11).getExplanations(),
            questionsList.get(12).getExplanations(),
            questionsList.get(13).getExplanations(),
            questionsList.get(14).getExplanations()
        };
        return answerKey;
    }
    
}
    

