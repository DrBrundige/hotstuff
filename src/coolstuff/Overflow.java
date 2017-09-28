package coolstuff;

public class Overflow {

	public static void main(String args[])
	{

		long bean = 1;
		int binary = 0;

		while(bean >= 0)
		{
			bean = bean * 2;
			binary += 1;

			System.out.println("After " + binary + " multiplications, bean is " + bean);
		}

	}

}
