package test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int a = 0, b = 1,c;
		System.out.println(a +" "+ b);
		for(int i =2; i<=num;i++){
		c = a+b;
		System.out.println(c);
		a = b;
		b = c;
		}
	}

}
