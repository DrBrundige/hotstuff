package coolstuff;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class BrundigesMath {

	public static int coolMethod(int bean)
	{

		bean = bean * 4;

		return bean;
	}

	//This method receives an integer and returns the number of zeroes it has.
	public static int howManyZeroes(int value)
	{
        int zeroes = 0;
        int baseTen = 10;
        Boolean isLarger = false;

        System.out.println("Initialized: howManyZeroes. " +
                "This method will determine how many zeroes are in: " + value);

        //TODO get the absolute value of int value

        if(value < 10)
        {
            System.out.println(baseTen + " is larger than " + value);
            isLarger = true;
        }

        while(!isLarger)
        {
            if(baseTen <= value)
            {
                zeroes += 1;
                baseTen *= 10;

                System.out.println((baseTen / 10) + " is smaller than " + value +
                        " incrementing zeroes to: " + zeroes + " baseTen to: " + baseTen);
            }

            if(baseTen > value)
            {
                System.out.println("");
                isLarger = true;
            }
        }

        System.out.println("Returning: " + zeroes);

        return zeroes;
    }

    //This static method receives two integers and returns the greatest common divisor thereof
	public static int GCDotron(int numA, int numB)
		{

		while (numA != numB) { // Euclid's algorithm
			if (numB > numA) {
				numB = numB - numA;
			}
			else {
				numA = numA - numB;
			}

			System.out.println(numA + "   " + numB);
		}

		System.out.println("GCD is: " + numA);

		return numA;
	}

	public boolean binaryReader(int x){


		int b = 1;

		while(8 == 8)
		{

			if (b == x)
				return true;

			if (b > x)
				return false;

			b *= 2;

		}

	}

}
