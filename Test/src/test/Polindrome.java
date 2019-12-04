package test;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********* method 1 : for Strings ***************");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String reverse ="";
		System.out.println("Original word is :" +str);
		char ch[] = str.toCharArray();
		for(int i =ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
			reverse = reverse + ch[i];
			
		}
		System.out.println("");
		System.out.println(reverse);
		if(reverse.equals(str)){
			System.out.println("Polindrome");
		}else{
			System.out.println("Not polindrome");
		}
		
		System.out.println("********* method 2 : for Integers ***************");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0,sum = 0;
		int temp = num;
		while(num>0){
			r = num%10;
		sum = (sum*10)+r;
		num = num/10;
		}
		if(temp == sum){
			System.out.println("Polindrome number");
		}
		else{
			System.out.println("Not Polindrome number");
		}
		
			
	}

}
