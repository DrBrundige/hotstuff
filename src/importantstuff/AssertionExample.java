package importantstuff;

import java.util.Scanner;

public class AssertionExample {

	public static void main(String args[]) {

		Scanner coolScanner = new Scanner(System.in);

		int userAge;

		System.out.println("Input a Number:");
		userAge= coolScanner.nextInt();

		assert userAge == 8: "Output Error!";

		System.out.println("EIGHT!");

	}

}
