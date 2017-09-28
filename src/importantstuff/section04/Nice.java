package importantstuff.section04;

public class Nice {

	public static void main(String args[])
	{

		int numRows = 2;
		int numCols = 3;

		int row = 1;
		int col1 = 0;
		char col = 'A';


		while(row <= numRows) {

			while (col1 < numCols){


			System.out.print(row);
			System.out.print(col + " ");

			col1 +=1;
			col  +=1;
		}
		col = 'A';
			col1 = 0;
			row += 1;

		}


		System.out.println("");

	}

}
