package importantstuff.section03;

import java.util.Scanner;

//Fabricated by Thomas Jones, who felt that he was above it
//9/12/2017

public class TextDecoder2 {

	public static void main(String args[])
	{

		Scanner coolScanner = new Scanner(System.in);

		int isContain = 0;

		String userMessage;

		System.out.println("Enter text:");
		userMessage = coolScanner.nextLine();

		System.out.println("You entered: " + userMessage);

		String[][] textBank = new String[2][6];

		textBank[0][0] = "Wubba-Lubba Dub Dub";
		textBank[0][1] = "BFF";
		textBank[0][2] = "IDK";
		textBank[0][3] = "JK";
		textBank[0][4] = "TMI";
		textBank[0][5] = "TTYL";

		textBank[1][0] = "I am in deep pain, please help me";
		textBank[1][1] = "best friend forever";
		textBank[1][2] = "I don't know";
		textBank[1][3] = "just kidding";
		textBank[1][4] = "too much information";
		textBank[1][5] = "talk to you later";

		int bean = 0; 			//The index
		String coolString = ""; //This string has the textBank index[bean] saved to it
		isContain = 0;		//If this integer is -1, then userMessage does not contain coolString

			while (bean < 6) {

				coolString = textBank[0][bean];

				isContain = userMessage.indexOf(coolString); //checks to see if userMessage contains textBank[bean]

				if(isContain != -1) { //if true, prints the decoded string
					System.out.println(textBank[0][bean] + ": " + textBank[1][bean]);
				}
				//System.out.println(textBank[bean2][bean]);

				bean += 1;

			}


		/*
		isContain = userMessage.indexOf("Wubba-Lubba Dub Dub");

		if (isContain != -1) System.out.println("Wubba-Lubba Dub Dub: I am in deep pain, please help me");

		isContain = userMessage.indexOf("IDK");

		if (isContain != -1) System.out.println("I don't know");

		isContain = userMessage.indexOf("BFF");

		if (isContain != -1) System.out.println("best friend forever");
		*/
	}

}
