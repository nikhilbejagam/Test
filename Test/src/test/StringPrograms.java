package test;

public class StringPrograms {
	
	
	public static void noOfCharacters(String s){
		int count =0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				count++;
			}
			
		}
		System.out.println("No of characters in string"+count);
	}
	
	
	public static void main(String args[]){
		
		String s= "welcome to" ;
		noOfCharacters(s);
		
	}

}
