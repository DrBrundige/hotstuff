package importantstuff.section04;

import java.util.Scanner;

public class SimonSays {
	public static void main (String [] args) {
		String simonPattern = "";
		String userPattern = "";
		int userScore = 0;
		int i = 0;

		userScore = 0;
		simonPattern = "RRGBRYYBGY";
		userPattern  = "RRGBBRYBGY";

		char userChar	=' ';	//These represent the characters in both strings
		char simonChar	= ' ';	//at an incrementing index
		boolean isEqual = false;

		while(i < simonPattern.length()) {

			simonChar 	= simonPattern.charAt(i);
			userChar 	= userPattern.charAt(i);
			isEqual		= userChar == simonChar;

			if(isEqual){
				userScore += 1;
			}else{

				break;
			}

			i += 1;
		}

		System.out.println("userScore: " + userScore);

		return;
	}
}