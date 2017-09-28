package importantstuff.otherstuff;
import java.util.Scanner;

//A fairly dumb test program.

public class compareString {

	public static void main(String args[])
	{
		Scanner coolScanner = new Scanner(System.in);

		String greeting = "Wubba-Lubba Dub Dub";
		String userString = "";

		System.out.println("Input phrase");
		userString = coolScanner.nextLine();

		boolean isGreeting = (greeting.compareTo(userString) == 0);

		if (isGreeting)
		{
			userString = "I am in deep pain, please help me";
		}

		System.out.println(userString);

	}

}
