package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        final Scanner userInput = new Scanner(System.in);
        System.out.println("what is the name of the file to create?");
        final String filename = userInput.nextLine();

        final File f = new File(filename);

        try {
            final PrintWriter writer = new PrintWriter(f);
            writer.printf("the time is now %s \n", LocalDateTime.now());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("could not create the file");
        }

    }
}
