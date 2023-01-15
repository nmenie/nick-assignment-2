package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Pick a number between 1 and 100 ");
		int randomNumber = random.nextInt(100);
//		int userInput = scanner.nextInt();
		int guesses = 0;

		while (guesses < 5) {
			guesses++;
			int userInput = scanner.nextInt();
			if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try agian ");
				guesses--;

			} else {

				if (guesses > 4 && userInput != randomNumber) {
					System.out.println("You lose!");
					System.out.println("The number to guess was: " + randomNumber);

				} else if (userInput == randomNumber) {
					System.out.println("You win!" + userInput);
					break;

				} else if (randomNumber < userInput) {
					System.out.println("Please pick a lower number \n");

				} else if (randomNumber > userInput) {
					System.out.println("Please pick a higher number \n");
//                guesses++;
				}
			}

		}

	}

}
