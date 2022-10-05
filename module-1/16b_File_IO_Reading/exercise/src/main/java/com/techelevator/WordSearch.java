package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		//create scanner for CLI
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter path here: ");
		String filePath = userInput.nextLine();


		System.out.println("What is the search word you are looking for?: ");
		String searchWord = userInput.nextLine();

		System.out.println("Should the search be case sensitive? (Y/N)");
		String caseSensitive = userInput.nextLine();

		//create object for book file, boolean variables for case sensitive
		File bookFile = new File(filePath);




		int lineCount = 0;
		//open book file
		try (Scanner fileInput = new Scanner(bookFile)) {
			while(fileInput.hasNextLine()) {
				String lineOfText = fileInput.nextLine();
				lineCount++;
				if (caseSensitive.equalsIgnoreCase("y")) {
					if (lineOfText.contains(searchWord)) {
						System.out.println(lineCount + ": "  + lineOfText);
					}
				} else if (caseSensitive.equalsIgnoreCase("n")) {
					if (lineOfText.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(lineCount + ": " + lineOfText);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found: " );
		}
	}

}
