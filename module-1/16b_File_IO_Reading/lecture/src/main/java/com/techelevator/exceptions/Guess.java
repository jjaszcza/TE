//package com.techelevator.exceptions;
//
//import java.util.Scanner;
//
//public class Guess {
//    public static void main(String[] args) {




//        try {
//            int guess = Integer.parseInt(guessInput);
//            System.out.println("the guess was : " + guess);
//            return;
//        } catch (NumberFormatException nfe) {
//            System.out.println("please enter a number");
//        } catch (RuntimeException nfe) {
//            System.out.println("Please enter a number");
//        } catch (Exception e) {
//            System.out.println("this can't happen");
//        } finally {
//            System.out.println("thanks for playing");
//        }
//    }
//    private static int getInputFromUser() {
//        final Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter a number between 0 and 99");
//        String guessInput = userInput.nextLine();
//    }
//}
