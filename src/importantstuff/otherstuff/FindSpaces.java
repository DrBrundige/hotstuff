package importantstuff.otherstuff;

import java.util.Scanner;

//Fabricated by Mr. Jones, 9/11/2017

public class FindSpaces {
	public static void main (String [] args) {
		String passCode = "";

		passCode = "A ";

		char aCharacter = passCode.charAt(0);
		boolean isSpace0 = Character.isWhitespace(aCharacter );

		if(isSpace0) System.out.println("Space at 0");

		aCharacter = passCode.charAt(1);
		boolean isSpace1 = Character.isWhitespace(aCharacter );

		if(isSpace1) System.out.println("Space at 1");

		return;
	}
}