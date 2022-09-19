package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

	final Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the temperature (number only)");
		String tempToConvert = userInput.nextLine();
		double tempInputted = Double.parseDouble(tempToConvert);

		System.out.println("Enter F for Fahrenheit or C for Celsius");
		String farOrCel = userInput.nextLine();
		String celsius = "C";

		double celToFarCalculator = tempInputted * 1.8 + 32;
		double farToCelCalculator = (tempInputted - 32) / 1.8;

		if (farOrCel.equalsIgnoreCase (celsius)) {
			System.out.println(celToFarCalculator);
		} else  {
			System.out.println(farToCelCalculator);
		}

	}

}
