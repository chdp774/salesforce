package javaPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(";prasad");
		ll.add("ch");
		ll.add("durga");
		ll.add("babi");
		ll.add("dp");
		
		System.out.println("*********** for loop");
		for(int i =0; i<=ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("********* adv for loop");
		
		for(String str: ll) {
			System.out.println(str);
		}
		
		System.out.println("************ Iterator loop");
		
		Iterator<String> lt = ll.iterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
			
		System.out.println("************ while loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
