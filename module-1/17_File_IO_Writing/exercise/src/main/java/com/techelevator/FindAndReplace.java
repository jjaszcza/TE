package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        final Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        final String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        final String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        final String filePath1 = userInput.nextLine();

        System.out.println("What is the destination file?");
        final String filePath2 = userInput.nextLine();

        File sourceFile = new File(filePath1);
        File destinationFile = new File(filePath2);

        try (Scanner fileInput = new Scanner(sourceFile);
             PrintWriter writer = new PrintWriter(destinationFile)) {
            while (fileInput.hasNextLine()) {
                String lineOfText = fileInput.nextLine();

                writer.println(lineOfText.replaceAll(searchWord, replacementWord));
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }


    }

}
