package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMaker {

    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter path here: ");
        final String filePath = userInput.nextLine();

        File quizFile = new File(filePath);

        try (Scanner fileInput = new Scanner(quizFile)) {
                while(fileInput.hasNextLine()) {

                }
                    // to access text

                //string split

                //display quiz questions

                //user input to guess

                //check if correct

                //record accuracy stat


        } catch (FileNotFoundException e) {
            System.out.println("the file was not found");

        }

    }

}
