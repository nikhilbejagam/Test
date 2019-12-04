package test;

import java.util.Scanner;

public class SwapWithThreeVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String var1 = scan.nextLine();
		String var2 = scan.nextLine();
		String var3;
		System.out.println("Numbers before swapping var1 is :" +var1 + " and var2 is :" +var2);
		
		var3 = var1;
		var1 = var2;
		var2 = var3;
		
		System.out.println("Numbers after swapping var1 is :" +var1 + " and var2 is :" +var2);
		
	}

}
