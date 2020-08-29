package com.infrrd;

import java.util.ArrayList;

public class Solution {
	static int personTodelete = 0;

	public static void main(String[] args) {
		//int winner = winnerOfMusicalPillowGame(11, 4);
		int winner = winnerOfMusicalPillowGame(5, 2);
		System.out.println("Winner of the Game : " + winner);
	}

	private static int winnerOfMusicalPillowGame(int numOfPerson, int seconds) {
		int incCount = 0;
		personTodelete = seconds;
		ArrayList<Integer> listOfPerson = new ArrayList<>();
		for (int i = 1; i <= numOfPerson; i++) {
			listOfPerson.add(i);
		}

		while (listOfPerson.size() != 2) {
			if (listOfPerson.size() > seconds) {
				if (personTodelete > listOfPerson.size()) {
					personTodelete = personTodelete - listOfPerson.size();
				}
				System.out.println("Removing the person : " + listOfPerson.get(personTodelete - 1));
				listOfPerson.remove(personTodelete - 1);
				personTodelete = personTodelete + seconds - 1;
			} else {
				personTodelete = Math.abs(seconds - listOfPerson.size() -incCount);
				System.out.println("Removing the person : " + listOfPerson.get(personTodelete));
				listOfPerson.remove(personTodelete);
				incCount++;
			}
		}
		return listOfPerson.get(0);
	}
}
