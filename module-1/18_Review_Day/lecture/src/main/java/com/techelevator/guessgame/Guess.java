//package com.techelevator.guessgame;
//
//import java.util.Scanner;
//
//public class Guess {
//    public static void main(String[] args) {
//
//        final Scanner userInput = new Scanner(System.in);
//        final GameLogic logic = new GameLogic();
//
//
//        while (true) {
//            System.out.println("Guess a number between 1 and 100");
//            String guessAsString = userInput.nextLine();
//            int guess = Integer.parseInt(guessAsString);
//            GameLogic.GuessResult result = logic.guessOutcome(guess);
//            switch (result) {
//
//                case CORRECT:
//                    break;
//                case TOOLOW:
//                    break;
//                case TOOHIGH:
//                    break;
//            }
//            if (guess == secret) {
//                System.out.println("CORRECT!!");
//                break;
//            } else if (guess > secret) {
//                System.out.println("lower");
//            } else {
//                System.out.println("higher");
//            }
//        }
//
//    }
//}
