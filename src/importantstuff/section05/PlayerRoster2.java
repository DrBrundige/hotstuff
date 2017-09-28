package importantstuff.section05;

import java.util.Scanner;

public class PlayerRoster2 {

	public static void main(String[] args) {

		Scanner coolScanner = new Scanner(System.in);

		final int NUM_PLAYERS = 5;

		int[] jerseyNumbers = new int[NUM_PLAYERS];
		int[] playerRatings = new int[NUM_PLAYERS];

		for (int i = 0; i < NUM_PLAYERS; i += 1)
		{
			System.out.println("Enter player " + (i + 1) + "'s jersey number:");
			jerseyNumbers[i] = coolScanner.nextInt();

			System.out.println("Enter player " + (i + 1) + "'s rating:");
			playerRatings[i] = coolScanner.nextInt();

			System.out.println("");

		}

		printRoster(jerseyNumbers, playerRatings);

		char menu = ' ';

		do{

			System.out.println("");
			System.out.println("MENU");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit");
			System.out.println("\nChoose an option:");
			menu = coolScanner.next().charAt(0);

			int i =0;
			int jersey = 0;
			int rate = 0;
			int bar = 0;

			switch(menu){

				case 'u':

					i =0;

					final int LENGTH = 5;

					System.out.println("Enter a jersey number:");
					jersey = coolScanner.nextInt();

					System.out.println("Enter a new rating for player:");
					rate = coolScanner.nextInt();

					while(i < LENGTH){

						if(jerseyNumbers[i] == jersey){

							playerRatings[i] = rate;

							break;
						}

						i += 1;
					}
					break;

				case 'a':

						i =0;


						System.out.println("Enter a rating:");
						bar = coolScanner.nextInt();

						System.out.println("\nABOVE: " + bar);

						while(i < NUM_PLAYERS){

							if(playerRatings[i] > bar){
								System.out.println("Player " + (i + 1) + " -- Jersey number: "
										+ jerseyNumbers[i] + ", Rating: " + playerRatings[i]);
							}

							i += 1;
						}

					break;

				case 'r':
					//players=replacePlayer(players);

					break;


				case 'o':

					printRoster(jerseyNumbers, playerRatings);
					break;

			}

		}while (menu != 'q');


	}


	private static void printRoster(int[] jersey, int[] score)
	{
		int i =0;

		final int LENGTH = 5;

		System.out.println("ROSTER");

		while(i < LENGTH){

			System.out.println("Player " + (i + 1) + " -- Jersey number: "
					+ jersey[i]+ ", Rating: " + score[i]);

			i += 1;
		}

	}

}