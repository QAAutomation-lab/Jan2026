package day20.collectionsexamples;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		//ArrayList ref=new ArrayList();
			//or
		List ref=new ArrayList();
		ref.add("Pune");//String object --> converted into Object class object(Auto up casting)
		ref.add(123);//int --> converted into Integer class object(Auto boxing)--> converted into Object class object(Auto up casting)
		ref.add(null);//converted into Object class object(Auto up casting)
		ref.add("Pune");//duplicate value but allowed in List
		System.out.println("Eleements of ArrayList: "+ref);
		System.out.println("Element count in ArrayList: "+ref.size());
		//System.out.println("Element at index 1: "+ref.get(1));
		for(int i=0;i<ref.size();i++) {
			System.out.println("Element at index "+i+": "+ref.get(i));
		}
		System.out.println("*****************************");
		for(Object obj:ref) {
			System.out.println("Objects of ArrayList: "+obj);
		}
		System.out.println("*****************************");
		ref.add(2, "Mumbai");//Adding Mumbai in index 2
		System.out.println("Eleements of ArrayList: "+ref);
		System.out.println("Element count in ArrayList: "+ref.size());
		ref.set(4, "Apple");//index number 4 object will be updated by Apple
		System.out.println("Eleements of ArrayList: "+ref);
		System.out.println("Element count in ArrayList: "+ref.size());
	}
}
