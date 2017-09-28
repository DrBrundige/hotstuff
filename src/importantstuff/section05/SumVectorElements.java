package importantstuff.section05;

public class SumVectorElements {
	public static void main(String[] args) {
		final int SIZE_LIST = 4;
		int[] keysList = new int[SIZE_LIST];
		int[] itemsList = new int[SIZE_LIST];
		int i = 0;

		keysList[0] = 42;
		keysList[1] = 105;
		keysList[2] = 101;
		keysList[3] = 100;

		itemsList[0] = 10;
		itemsList[1] = 20;
		itemsList[2] = 30;
		itemsList[3] = 40;

		while (i < SIZE_LIST) {

			if (keysList[i] > 100) {

				System.out.print(itemsList[i] + " ");
			}

			i += 1;
		}

		System.out.println("");

		return;
	}
}