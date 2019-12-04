package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

	
	public void m1(){
		System.out.println("Coolection class");
	}
	public static void main(String[] args) {
		ParentClass p = new ChildClass();
		ChildClass cc = new ChildClass();

		//
		cc.m1();
		//p.m4();
	String[] str= {"Ajay","Manoj", "Sagar", "seenugadu","Nikhil"};
	List <String> liststr = new ArrayList<String>();
	for(int i=0;i<str.length;i++){
		liststr.add(str[i]);
	}
	Collections.sort(liststr);
	System.out.println("expected list:"+liststr);
	List <String> list = new ArrayList<String>();
	
	list.add("Nikhil");
	list.add("seenugadu");
	list.add("Manoj");
	list.add("Ajay");
	list.add("Sagar");
	//System.out.println(list);
	Collections.sort(list);
	System.out.println("Values after sorting:" +list);
	
	if(liststr.equals(list)){
		System.out.println("passed");
	}else {
		System.out.println("fail");
	}
	}

}
