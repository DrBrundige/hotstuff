package importantstuff.otherstuff;

import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double wallHeight = 0.0;
		double wallWidth = 0.0;
		double wallArea = 0.0;

		System.out.println("Enter wall height (feet):");
		wallHeight = scnr.nextDouble();

		System.out.println("Enter wall width (feet):");
		wallWidth = scnr.nextDouble();

		// Calculate and output wall area
		wallArea = wallWidth * wallHeight;
		System.out.println("Wall area: " + wallArea + " square feet");

		double gallons = wallArea / 350;
		System.out.println("Paint needed: " + gallons + " gallons");

		int cansNeeded = (int)Math.ceil(gallons);

		System.out.println("Cans needed: " + cansNeeded + " can(s)");

		return;
	}
}