package importantstuff.section04;

import java.util.Scanner;

public class CountDown {

	public static void main(String args[])
	{

		int numStars = 0;
		int numPrinted = 0;

		numStars = 12;
		numPrinted = 1;

		while (numPrinted != numStars) {
			System.out.print("*");
			numPrinted +=1;
		}

		return;



	}

}
