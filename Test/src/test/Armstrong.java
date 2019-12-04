package test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a, sum = 0,temp;
		temp = num;
		while(num>0){
		a = num%10;
		num = num/10;
		sum = sum+(a*a*a);
		}
		if(temp == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");

	}

}
