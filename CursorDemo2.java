package com.corejava;
import java.util.*;

public class CursorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();
		String ele;
		al.add("pig");
		al.add("cat");
		al.add("dog");
		al.add("dog");
		al.add("pig");
		al.add("cat");
		al.add("rat");
		al.add("dog");
	
    System.out.println(al);
    ListIterator<String> lt =al.listIterator();
    while(lt.hasNext()) {
    	ele=lt.next();
    	if(ele.equals("rat"))lt.remove();
    	else if(ele.equals("pig"))lt.add("snake");
    	else if(ele.equals("cat")) lt.set("bird");
    	
    }
    System.out.println(al);

	}

}
