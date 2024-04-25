/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit130classassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kaden
 */
public class EasyCodeDemo extends Beg {
    //Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double percent;
        int correct;
        String userChoice;
        
        do {
            percent = 0;
            correct = 0;
            String[] userKey = new String[5];
            String[] userKeyAll = new String[15];
            System.out.println("Welcome to Easy Code!");
            System.out.println("A dynamic learning platform tailored to enhance the interview skills of new Java students.");
            System.out.println("Please select which category you wish to choose from:");
            System.out.println(ANSI_BLUE + "--------------------------------------------------------" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "| Beginner | Intermediate | Behavioral | All Questions |" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "--------------------------------------------------------" + ANSI_RESET);
            System.out.print("Select by typing one of the names in here -->: ");
            userChoice = scan.next();

            Beg begInstance = new Beg();
            Interm intermInstance = new Interm();
            behavioral behavInstance = new behavioral();
            allQuestions allInstance = new  allQuestions();

            // Do this for each question type
            ArrayList<Questions> begQ = begInstance.getQuestions2();
            String[] begAnswers = begInstance.getAnswerKey();
            String[] begExplain = begInstance.getExplanationKey();
            //intermediate shuffle
            ArrayList<Questions> IntermQ = intermInstance.getQuestions2();
            String[] IntermAnswers = intermInstance.getAnswerKey();
            String[] IntermExplain = intermInstance.getExplanationKey();
            //behavioral shuffle
            ArrayList<Questions> behavQ = behavInstance.getQuestions2();
            String[] behavAnswers = behavInstance.getAnswerKey();
            String[] behavExplain = behavInstance.getExplanationKey();
            //all questions shuffle
            ArrayList<Questions> allQ = allInstance.getQuestions2();
            String[] allAnswers = allInstance.getAnswerKey();
            String[] allExplain = allInstance.getExplanationKey();
            
            
            //beginner
            if (userChoice.equalsIgnoreCase("beg") || userChoice.equalsIgnoreCase("beginner")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                    System.out.print(ANSI_BLUE + (i+1) + ".)" + begQ.get(i).getQuestions()+ ANSI_RESET);
                    userKey[i] = scan.next();
                }

                for (int i = 0; i < 5; i++) {
                    if (begAnswers[i].equalsIgnoreCase(userKey[i])) {
                        System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                        correct++;
                    } else {
                        System.out.println(ANSI_RED+ "Wrong." + ANSI_RESET);
                    }
                }

                percent = ((double) correct / 5) * 100.0;
                System.out.println("You scored " + percent + "%!");

                if (correct < 5) {
                    System.out.println("Do you want to see what was wrong? ");
                    userChoice = scan.next();
                    if (userChoice.equalsIgnoreCase("yes")) {
                        for (int i = 0; i < 5; i++) {
                            if (!begAnswers[i].equalsIgnoreCase(userKey[i])) {
                                System.out.println("Question " + (i + 1) + " explanation: ");
                                System.out.println(begExplain[i]);
                            }
                        }
                    } else {
                        System.out.println("Okay. Thanks for playing!");
                    }
                } else {
                    System.out.println("Okay. Thanks for playing!");
                }
            } //end of beginner
            //intermediate
            else if (userChoice.equalsIgnoreCase("interm") || userChoice.equalsIgnoreCase("intermediate")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                    System.out.print(ANSI_BLUE+ (i+1) + ".)" + IntermQ.get(i).getQuestions()+ ANSI_RESET);
                    userKey[i] = scan.next();
                }

                for (int i = 0; i < 5; i++) {
                    if (IntermAnswers[i].equalsIgnoreCase(userKey[i])) {
                        System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                        correct++;
                    } else {
                        System.out.println(ANSI_RED+ "Wrong." + ANSI_RESET);
                    }
                }

                percent = ((double) correct / 5) * 100.0;
                System.out.println("You scored " + percent + "%!");

                if (correct < 5) {
                    System.out.println("Do you want to see what was wrong? ");
                    userChoice = scan.next();
                    if (userChoice.equalsIgnoreCase("yes")) {
                        for (int i = 0; i < 5; i++) {
                            if (!IntermAnswers[i].equalsIgnoreCase(userKey[i])) {
                                System.out.println("Question " + (i + 1) + " explanation: ");
                                System.out.println(IntermExplain[i]);
                            }
                        }
                    } else {
                        System.out.println("Okay. Thanks for playing!");
                    }
                } else {
                    System.out.println("Okay. Thanks for playing!");
                }

            } //end of intermediate
            else if (userChoice.equalsIgnoreCase("behave") || userChoice.equalsIgnoreCase("behavioral")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                    System.out.print(ANSI_BLUE + (i+1) + ".)" + behavQ.get(i).getQuestions()+ ANSI_RESET);
                    userKey[i] = scan.next();
                }

                for (int i = 0; i < 5; i++) {
                    if (behavAnswers[i].equalsIgnoreCase(userKey[i])) {
                        System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                        correct++;
                    } else {
                        System.out.println(ANSI_RED+ "Wrong." + ANSI_RESET);
                    }
                }

                percent = ((double) correct / 5) * 100.0;
                System.out.println("You scored " + percent + "%!");

                if (correct < 5) {
                    System.out.println("Do you want to see what was wrong? ");
                    userChoice = scan.next();
                    if (userChoice.equalsIgnoreCase("yes")) {
                        for (int i = 0; i < 5; i++) {
                            if (!behavAnswers[i].equalsIgnoreCase(userKey[i])) {
                                System.out.println("Question " + (i + 1) + " explanation: ");
                                System.out.println(behavExplain[i]);
                            }
                        }
                    } else {
                        System.out.println("Okay. Thanks for playing!");
                    }
                } else {
                    System.out.println("Okay. Thanks for playing!");
                }

            }
            else if (userChoice.equalsIgnoreCase("all questions") || userChoice.equalsIgnoreCase("ALL")) {
                for (int i = 0; i < 15; i++) {
                    System.out.println("");
                    System.out.print(ANSI_BLUE+ (i+1) + ".)" + allQ.get(i).getQuestions() + ANSI_RESET);
                    userKeyAll[i] = scan.next();
                }

                for (int i = 0; i < 15; i++) {
                    if (allAnswers[i].equalsIgnoreCase(userKeyAll[i])) {
                        System.out.println(ANSI_GREEN + "Correct!" + ANSI_RESET);
                        correct++;
                    } else {
                        System.out.println(ANSI_RED+ "Wrong." + ANSI_RESET);
                    }
                }

                percent = ((double) correct / 15) * 100.0;
                System.out.println("You scored " + percent + "%!");

                if (correct < 15) {
                    System.out.println("Do you want to see what was wrong? ");
                    userChoice = scan.next();
                    if (userChoice.equalsIgnoreCase("yes")) {
                        for (int i = 0; i < 15; i++) {
                            if (!allInstance.getAnswerKey()[i].equalsIgnoreCase(userKeyAll[i])) {
                                System.out.println("Question " + (i + 1) + " explanation: ");
                                System.out.println(allExplain[i]);
                            }
                        }
                    } else {
                        System.out.println("Okay. Thanks for playing!");
                    }
                } else {
                    System.out.println("Okay. Thanks for playing!");
                }

            }

            //end of behavioral
            System.out.println("Do you want to play again? (yes/no)");
            userChoice = scan.next();
        } while (userChoice.equalsIgnoreCase("yes"));
    }
}

