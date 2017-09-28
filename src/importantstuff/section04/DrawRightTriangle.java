package importantstuff.section04;

import java.util.Scanner;

public class DrawRightTriangle {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char triangleChar = '-';
		int triangleHeight = 0;

		System.out.println("Enter a character:");
		triangleChar = scnr.next().charAt(0);

		System.out.println("Enter triangle height:");
		triangleHeight = scnr.nextInt();

		System.out.println("");

		int bean = 0;
		int loop = 0;

		while(bean < triangleHeight){

			while(loop <= bean){
				System.out.print(triangleChar + " ");

				loop +=1 ;
			}

			bean += 1;
			loop = 0;
			System.out.println("");
		}



		return;
	}
}