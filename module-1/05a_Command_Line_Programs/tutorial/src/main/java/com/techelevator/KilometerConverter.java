package com.techelevator;

import java.util.Scanner;

public class KilometerConverter {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.print("Enter a kilometer value to start at: ");
        String value = input.nextLine();
        int kilometerStart = Integer.parseInt(value);

        System.out.print("Enter a kilometer value to end with: ");
        value = input.nextLine();
        int kilometerEnd = Integer.parseInt(value);

        System.out.print("Enter a kilometer value to end with: ");
        value = input.nextLine();
        int incrementBy = Integer.parseInt(value);

        System.out.println("Going from " + kilometerStart + "km to " + kilometerEnd + "km in increments of " + incrementBy + "km.");

        for (int km = kilometerStart; km <= kilometerEnd; km += incrementBy) {
            double miles = km * 0.621371;
            System.out.println(km + "km is " + miles + "mi.");
        }
    }


    
}
