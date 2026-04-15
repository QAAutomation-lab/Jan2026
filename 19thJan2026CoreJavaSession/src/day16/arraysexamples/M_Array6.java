package day16.arraysexamples;

import java.util.Arrays;

class M_Array6{
	
	public static void main(String[] args) {
		
		// declaring a source array
		char[] orgArray = { 'a', 'b','e', 'c', 'd'};
		//duplicate array
		char[] cloneArray= { 'a', 'b', 'c', 'd','e'};
		
		System.out.println(Arrays.equals(orgArray, cloneArray));//
		Arrays.sort(cloneArray);
		System.out.println(Arrays.equals(orgArray, cloneArray));//
		Arrays.sort(orgArray);
		System.out.println(Arrays.equals(orgArray, cloneArray));//
	}
}
/*
 * Debugging: using this you can execute a program line by line
 * Step1: add break point into required line
 * Step2: run program in debug mode(right click on required program-->Debug as --> Java Application )
	 * F5 --> to go inside the method/function
	 * F6 --> next line
	 * F8 --> continure the flow
	 * ctrl+shft+i
 */
