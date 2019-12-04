package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] temp = str.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String s : temp){
			if(map.containsKey(s)){
				int count = map.get(s);
				map.put(s, count+1);
			}else{
				map.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> mp :map.entrySet()){
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
		
		
	}

}
