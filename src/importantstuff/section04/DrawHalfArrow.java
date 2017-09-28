package importantstuff.section04;

import java.util.Scanner;

public class DrawHalfArrow {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int arrowBaseHeight = 0;
		int arrowBaseWidth  = 0;
		int arrowHeadWidth = 0;

		System.out.println("Enter arrow base height:");
		arrowBaseHeight = scnr.nextInt();

		System.out.println("Enter arrow base width:");
		arrowBaseWidth = scnr.nextInt();

		while(1<2){

			System.out.println("Enter arrow head width:");
			arrowHeadWidth = scnr.nextInt();
			System.out.println("");

			if (arrowHeadWidth > arrowBaseWidth) break;

		}

		int x = 0;
		int y = 0;

		while(x < arrowBaseHeight){

			while(y < arrowBaseWidth){

				System.out.print("*");
				y += 1;
			}

			System.out.println("");
			x += 1;
			y = 0;
		}

		x = arrowHeadWidth;
		y = arrowHeadWidth;

		while(x > 0){

			while(y > 0){

				System.out.print("*");
				y -= 1;

			}

			x -= 1;
			y = x;
			System.out.println("");

		}



		return;
	}
}

