package importantstuff.section05;

public class CourseGradePrinter {

	public static void main (String [] args) {
		final int NUM_VALS = 4;
		int[] courseGrades = new int[NUM_VALS];
		int i = 0;

		courseGrades[0] = 7;
		courseGrades[1] = 9;
		courseGrades[2] = 11;
		courseGrades[3] = 10;

		while (i <= NUM_VALS-1) {

			System.out.print(courseGrades[i] + " ");
			i += 1;

		}

		System.out.println("");
		i = NUM_VALS -1;

		while (i >= 0) {

			System.out.print(courseGrades[i] + " ");
			i -= 1;

		}

		System.out.println();



		return;
	}
}
