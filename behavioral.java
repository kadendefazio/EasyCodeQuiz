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
public class behavioral extends Questions{
       ArrayList<Questions> questionsList;

    
    public ArrayList<Questions> getQuestions2() {
        // The list to store all questions
        questionsList = new ArrayList();
       
        
        // Create question Object
        // Question 1
        Questions bQuestion1 = new Questions("Imagine a situation where you have to collaborate with a team to solve a problem in Java. How would you approach it?"
                + "\nA.)I collaborated with my team on a Java project where we implemented a multithreading solution to improve performance"
                + "\nB.)I worked alone on all my Java projects; teamwork isn't really my thing."
                + "\nC.)I let my team handle most of the coding while I focused on other tasks."
                + "\nD.)I disagreed with my team's approach and implemented my own solution without consulting."
                + "\nSubmit Answer here -->: ", "This answer showcases the ability to work effectively within a team environment, leveraging collective skills and knowledge to tackle a problem.", "A");
        //Question 2
        Questions bQuestion2 = new Questions("Imagine a situation where you encountered a bug in a beginner-level Java program and fixed it. Which of these choices would work the best?"
                + "\nA.)I encountered a bug in a simple Java program that was caused by a typo in a variable name. I quickly identified and corrected the typo, resolving the issue."
                + "\nB.)I couldn't fix the bug, so I gave up on the program altogether"
                + "\nC.)I ignored the bug and hoped it would magically disappear on its own."
                + "\nD.)I blamed someone else for the bug and didn't attempt to fix it myself."
                + "\nSubmit Answer here -->: ", "This is correct because this response showcases the candidate's ability to analyze code, identify errors, and apply the necessary corrections. It demonstrates attention to detail and the willingness to take ownership of resolving issues. ", "A");
        //Question 2
        //Question 3
        Questions bQuestion3 = new Questions("Imagine: Think about a time when you refactored a basic Java program to make it more organized. Pick the best option from the choices below."
                + "\nA.)I refactored a basic Java program by splitting long methods into smaller, more manageable ones and organizing related code into separate classes, improving code structure and readability."
                + "\nB.)I didn't see the point of refactoring; the program worked fine as it was."
                + "\nC.)I added more code to the existing program without restructuring anything, making it even messier."
                + "\nD.)I refactored the program by deleting code that I thought was unnecessary, without considering its impact on functionality."
                + "\nSubmit Answer here -->: ", "This is correct because this response shows an understanding of the importance of breaking down complex logic into smaller, more manageable components. By splitting long methods and organizing related code into separate classes, the candidate improves code readability and facilitates future modifications or enhancements. ", "A");
        //Question 4
        Questions bQuestion4 = new Questions("Tell me about a situation where you used comments effectively in a Java program to improve code readability. Select the best choice from the options below."
                + "\nA.)In a Java program, I used comments to document complex algorithms, explain the purpose of methods, and provide context for future modifications, enhancing code readability and maintainability for myself and other developers."
                + "\nB.)I avoided using comments in my Java projects because I think they clutter the code."
                + "\nC.)I used comments to describe what each line of code does without providing overall context or explanation, resulting in redundant and verbose comments."
                + "\nD.)I relied solely on self-explanatory variable and method names without using comments, assuming that the code would be easy to understand without additional documentation."
                + "\nSubmit Answer here -->: ", "This is correct because this response shows that the candidate recognizes the value of using comments to explain intricate parts of the code, making it easier for others (and themselves in the future) to understand the logic behind it.", "A");
        //Question 5
        Questions bQuestion5 = new Questions("Imagine you're working on a group project to create a simple Java program. One of your team members seems unsure about their tasks and frequently asks for assistance, which slows down the progress of the project. How would you handle this situation?"
                + "\nA.)Offer to provide additional explanations or tutorials to help the team member grasp the concepts better."
                + "\nB.)Take over their tasks to ensure they are completed on time, avoiding delays in the project."
                + "\nC.)Encourage the team member to seek help from online resources or tutorials to build their skills independently."
                + "\nD.)Schedule regular check-ins with the team member to review their progress and address any difficulties they may be facing."
                + "\nSubmit Answer here -->: ", "This is correct because it demonstrates a a proactive approach to supporting the struggling team member by offering assistance and guidance. It promotes teamwork and collaboration while ensuring that the project can move forward without unnecessary delays. Additionally, it shows empathy and willingness to help others learn, which are valuable qualities in a team environment.", "A");
        //Question 2
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


