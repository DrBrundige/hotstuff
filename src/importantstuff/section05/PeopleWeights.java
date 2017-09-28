package importantstuff.section05;

import java.util.Scanner;

public class PeopleWeights {
	public static void main(String[] args)
	{
		double[] weights = new double[5];

		Scanner coolScanner = new Scanner(System.in);

		int i = 0;



		while(i < weights.length){

			System.out.println("Enter weight " + (i + 1) + ":");
			weights[i] = coolScanner.nextDouble();

			i += 1;
		}

		i = 0;
		double max = weights[0];
		double total = 0;

		System.out.print("You entered:");

		while(i < weights.length){

			System.out.print(" " + weights[i]);

			if(weights[i] > max){

				max = weights[i];
			}

			total += weights[i];

			i += 1;
		}

		System.out.println("");
		System.out.println("Total weight: " + total);
		System.out.println("Average weight: " + (total / weights.length));

		System.out.println("Max weight: " + max);

	}
}