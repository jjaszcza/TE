package com.techelevator.quizgame;

import java.io.FileNotFoundException;
import java.util.List;

public class QuizMaker {

	public static void main(String[] args) {

		final QuizFileReader fileReader = new QuizFileReader("path");
		try {
			List<QuizQuestion> questions = fileReader.processFile();
		} catch (FileNotFoundException e) {
			System.out.println("that file does not exist");
		}


	}

}
