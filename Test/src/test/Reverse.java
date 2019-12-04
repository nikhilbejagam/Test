package test;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****** MEthod 1 using String builder *********");
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		String str = Scan.nextLine();
		System.out.println("Original word is :" +str);
		StringBuilder rev = new StringBuilder();
		rev.append(str);
		rev.reverse();
		System.out.println("Reverse word is :" +rev);
		
		System.out.println("****** MEthod 2 using string buffer *********");
		@SuppressWarnings("resource")
		Scanner Scan1 = new Scanner(System.in);
		String str1 = Scan1.nextLine();
		System.out.println("Original word is :" +str1);
		StringBuffer rev1 = new StringBuffer();
		rev1.append(str1);
		rev1.reverse();
		System.out.println("Reverse word is :" +rev1);
		
		System.out.println("****** MEthod 3 without using inbuilt functions *********");
		String str3 = "Nikhil";
		char ch[] = str3.toCharArray();
		for(int i = ch.length-1; i>=0; i--){
			System.out.print(ch[i]);
			
		}
		System.out.println();
	        System.out.println("****** MEthod 4 without using inbuilt functions *********");
	        String str4 = "Nikhil is a good boy";
	        System.out.println(str4);
	        String[] str5 = str4.split(" ");
	        for(int j = str5.length-1;j>=0;j--)
	        	System.out.println(str5[j]);
	        
		
	}

}
