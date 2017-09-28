package importantstuff.otherstuff;

public class CheckingPasscodes
{
	public static void main(String args[])
	{

		boolean hasDigit;
		String passCode;

		hasDigit = false;
		passCode = "abc";

		char digit = passCode.charAt(0);
		boolean isDigit0 = Character.isDigit(digit);

		digit = passCode.charAt(1);
		boolean isDigit1 = Character.isDigit(digit);

		digit = passCode.charAt(2);
		boolean isDigit2 = Character.isDigit(digit);

		System.out.println(isDigit0);
		System.out.println(isDigit1);
		System.out.println(isDigit2);

		if(isDigit0 || isDigit1 || isDigit2) hasDigit = true;

		if (hasDigit) {
			System.out.println("Has a digit.");
		}
		else {
			System.out.println("Has no digit.");
		}

	}
}
