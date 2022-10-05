package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        final Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the name of a file");
        final String path = userInput.nextLine(); //program will "block" until the user presses <enter>

        final File f = new File(path);
        if (f.exists()) {
            System.out.printf("name: %\n,", f.getName());
            System.out.printf("path: %\n", f.getAbsolutePath());
            if (f.isFile()) {
                System.out.printf("is a file");
                System.out.printf("size: %s\n", f.length());
            } else {
                System.out.println("is a folder");
            }

        } else {
            System.out.printf("%s does not exist", path);
        }
    }
}
