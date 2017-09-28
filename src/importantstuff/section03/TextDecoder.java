package importantstuff.section03;

import java.util.Scanner;

//Fabricated by Thomas Jones, who felt that he was above it
//9/12/2017

public class TextDecoder {

	public static void main(String args[])
	{

		Scanner coolScanner = new Scanner(System.in);

		String massive;

		System.out.println("Input an abbreviation:");
		massive = coolScanner.nextLine();

		switch (massive){

			case "LOL":

				System.out.println("laughing out loud");

			break;

			case "IDK":

				System.out.println("I don't know");

				break;

			case "IMHO":

				System.out.println("in my humble opinion");

				break;

			case "TMI":

				System.out.println("too much information");

				break;

			case "BFF":

				System.out.println("best friends forever");

				break;

			default:

				System.out.println("Unknown");

		}

	}

}
