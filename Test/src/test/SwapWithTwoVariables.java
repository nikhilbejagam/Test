package test;

import java.util.Scanner;

public class SwapWithTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int var1 = scan.nextInt();
		int var2 = scan.nextInt();
		System.out.println("Number before swapping var1 is :" +var1 +" and var2 is :" +var2);
		
		var1 = var1^var2;
		var2 = var1^var2;
		var1 = var1^var2;
		
		System.out.println("Number after swapping var1 is :" +var1 +" and var2 is :" +var2);
	
	}

}
