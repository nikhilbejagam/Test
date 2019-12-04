package test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean flag = true;
		for (int i = 2; i<= num/2 ; i++){
			if(num%i==0){
				flag = false;
			}
		}
		if(flag)
			System.out.println("Prime number");
		else
			System.out.println("Not Prime number");
		
	}

}
