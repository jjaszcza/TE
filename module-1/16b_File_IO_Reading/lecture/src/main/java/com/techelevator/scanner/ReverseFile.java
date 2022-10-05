package com.techelevator.scanner;

import java.io.File;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String[] args) {
        final Scanner userInput = new Scanner(System.in);
        System.out.println("enter the full path to a file");
        final String fileName = userInput.nextLine();

        final File fileToReverse = new File(fileName);
        final Scanner fileReader = new Scanner(fileToReverse);
    }
}
