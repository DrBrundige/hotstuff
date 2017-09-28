package importantstuff.section04;

import java.util.Scanner;

public class GrocerySorter {
	public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};
	public static void main (String [] args) {

		GroceryItem userItem = GroceryItem.GR_APPLES;

		switch(userItem){

			case GR_APPLES:
			case GR_BANANAS:
				System.out.println("Fruit");

			break;

			case GR_JUICE:
			case GR_WATER:
				System.out.println("Drink");

			break;

			default:
				System.out.println("Nothing");
			break;
		}

		return;
	}
}