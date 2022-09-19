package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		final Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the length (number only)");
		String lengthAsString = userInput.nextLine();
		double length = Double.parseDouble(lengthAsString);

		System.out.println("Enter M to convert to meters, enter F to convert to feet:");
		String feetOrMeters = userInput.nextLine();
		String feet = "F";

		double footToMeter = length * 0.3048;
		double meterToFoot = length * 3.2808399;

		if (feetOrMeters.equalsIgnoreCase (feet)) {
			System.out.println(meterToFoot);
		} else {
			System.out.println(footToMeter);
		}
	}

}
