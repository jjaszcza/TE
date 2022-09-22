package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, Integer> scores = new HashMap<>();
		scores.put("ray", 3);
		scores.put("nick", 3);
		scores.put("jon", 1);
		scores.put("Nick", 3); //keys are case sensitive.
		scores.put("jon", 2); //maps are mutable, jon is updated from 1 to 2

		System.out.println(scores);

		System.out.println("jon's score is: " + scores.get("jon")); //use get method to retrieve key
		System.out.println("number of items: " + scores.size());

		if(scores.size() == 0) {
			//do something
		}

		if(!scores.isEmpty()){

		}

		scores.remove("Nick");
		System.out.println(scores);

		System.out.println(scores.get("juno"));
		scores.put("juno", null);
		System.out.println(scores);

		System.out.println("is juno in the maps? " + scores.containsKey("juno"));

		Map<Integer, String> letterGrades = new HashMap<>();
		letterGrades.put(3, "A");
		letterGrades.put(2, "C");
		letterGrades.put(1, "D");
		letterGrades.put(0, "F");

		for(String studentKey : scores.keySet()) {
			Integer score = scores.get(studentKey);
			String letterGrade = letterGrades.get(score);

			System.out.printf("%s received the grade %s\n", studentKey, letterGrade);
		}

		Map<String, Integer> moreScores = new HashMap<>();
		moreScores.put("nick", 3);
		moreScores.put("jon", 2);
		moreScores.put("ray", 3);

		System.out.println("scores equals moreScores: " + scores.equals(moreScores));
		moreScores.put("juno", null);
		System.out.println("scores equals moreScores: " + scores.equals(moreScores));
		System.out.println("scores == moreScores: " + (scores == moreScores));


		Map<String, Integer> anotherRed = scores;
		System.out.println(scores == anotherRed); //true because they hold the same address in the memory.
	}

}
