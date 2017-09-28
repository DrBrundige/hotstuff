package importantstuff.section05;

import java.util.Scanner;

public class PlayerRoster {
	public static void main(String[] args) {

		int[][] players = new int[2][5];

		Scanner coolScanner = new Scanner(System.in);

		int i = 0;

		//players = fillRoster(players);

		while(i < 5){

			System.out.println("Enter player " + (i + 1) + "'s jersey number:");
			players[0][i] = coolScanner.nextInt();

			System.out.println("Enter player " + (i + 1) + "'s rating:");
			players[1][i] = coolScanner.nextInt();

			System.out.println("");

			i += 1;
		}


		printRoster(players);

		char menu = ' ';

		do{

			/* MENU
			u - Update player rating
			a - Output players above a rating
			r - Replace player
			o - Output roster
			q - Quit

			Choose an option:
			*/

			System.out.println("");
			System.out.println("MENU");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit");
			System.out.println("\nChoose an option:");
			menu = coolScanner.next().charAt(0);

			switch(menu){

				case 'u':

					players=updatePlayer(players);
				break;

				case 'a':

					printRosterAbove(players);
				break;

				case 'r':
					players=replacePlayer(players);

				break;


				case 'o':

					printRoster(players);
				break;

			}

		}while (menu != 'q');

	}

	//This static method prints the roster
	public static void printRoster(int[][] roster)
	{
		int i =0;

		final int LENGTH = 5;

		System.out.println("ROSTER");

		while(i < LENGTH){

			System.out.println("Player " + (i + 1) + " -- Jersey number: "
					+ roster[0][i]+ ", Rating: " + roster[1][i]);

			i += 1;
		}

	}

	public static void printRosterAbove(int[][] roster)
	{
		Scanner coolScanner = new Scanner(System.in);

		int i =0;
		int bar = 0;

		final int LENGTH = 5;

		System.out.println("Enter a rating:");
		bar = coolScanner.nextInt();

		System.out.println("\nABOVE: " + bar);

		while(i < LENGTH){

			if(roster[1][i] > bar){
				System.out.println("Player " + (i + 1) + " -- Jersey number: "
						+ roster[0][i] + ", Rating: " + roster[1][i]);
			}

			i += 1;
		}

	}

	// Prompts the user for a player's jersey number.
	// Prompts again for a new rating for the player. Changes that player's rating.
	public static int[][] updatePlayer(int[][] roster)
	{
		Scanner coolScanner = new Scanner(System.in);

		int i =0;
		int jersey = 0;
		int rate = 0;

		final int LENGTH = 5;

		System.out.println("Enter a jersey number:");
		jersey = coolScanner.nextInt();

		System.out.println("Enter a new rating for player:");
		rate = coolScanner.nextInt();

		while(i < LENGTH){

			if(roster[0][i] == jersey){

				roster[1][i] = rate;

				break;
			}

			i += 1;
		}

		return roster;
	}

	public static int[][] replacePlayer(int[][] roster)
	{
		Scanner coolScanner = new Scanner(System.in);

		int i =0;
		int jersey = 0; //User inputted jersey number. Later reused for data entry
		int jerseyIndex = -1;

		final int LENGTH = 5;

		System.out.println("Enter a jersey number:");
		jersey = coolScanner.nextInt();

		//Considers Roster to see if user input jersey is in it
		while(i < LENGTH){

			if(roster[0][i] == jersey){

				jerseyIndex = i;

				break;
			}

			i += 1;
		}

		if(jerseyIndex != -1){

			System.out.println("Enter a new jersey number:");
			jersey = coolScanner.nextInt();
			roster[0][jerseyIndex] = jersey;

			System.out.println("Enter a rating for the new player:");
			jersey = coolScanner.nextInt();
			roster[1][jerseyIndex] = jersey;

		}

		return roster;
	}

	public static int[][] fillRoster(int[][] roster)
	{

		roster[0][0] = 15;
		roster[0][1] = 26;
		roster[0][2] = 37;
		roster[0][3] = 48;
		roster[0][4] = 59;

		roster[1][0] = 3;
		roster[1][1] = 5;
		roster[1][2] = 7;
		roster[1][3] = 8;
		roster[1][4] = 9;

		return roster;
	}



}