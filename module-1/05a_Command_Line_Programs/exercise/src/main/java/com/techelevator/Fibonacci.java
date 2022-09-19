package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		final Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String fibonnaciNumberAsString = userInput.nextLine();
		int fibonnaciNumber = Integer.parseInt(fibonnaciNumberAsString);

		int [] lastSequence = new int [] {0, 1};

		System.out.print("0, 1");


			while (lastSequence[0] + lastSequence[1] <= fibonnaciNumber){

				int fibSum = lastSequence[0] + lastSequence[1];
				lastSequence[0] = lastSequence[1];
				lastSequence[1] = fibSum;

				System.out.print(", " + fibSum);
			}

	}

}
