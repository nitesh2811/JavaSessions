package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// default class in Java
		// dynamic Array
		// order based /index based AL
		// Part of Collections Framework
		//ArrayList is an ordered List. We cannot add the 
		//values at any index position before filling the above index positions 
		

		ArrayList<Object> al = new ArrayList<Object>();
		// If the argument is not passed
		// the default size of VC=10

		System.out.println(al.size());
		// It gives the physical capacity
		// PC=0

		al.add(100);
		al.add(200);

		System.out.println(al.size());
		// Now the size will be 2

		al.add(300);
		al.add(400);
		al.add(12.33);
		al.add('h');
		al.add(true);
		al.add("Nitesh");

		System.out.println(al.get(1));
		// li=0
		// len=ar.size()-->PC=8
		// hi=len-1=7

		// System.out.println(al.get(-1));
		// Run time exception of IOOB
		// System.out.println(ar.get(8));//IOB

		System.out.println("-------------");

		// To get all the values of the Array List

		for (Object e : al) {
			System.out.println(e);
		}

		System.out.println("--------------");

		ArrayList<Integer> ar = new ArrayList<Integer>(20);
		System.out.println(ar.size());
		// Physical capacity is 0
		// virtual capacity is 20

		// generics
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
//		marksList.add("hello");
//		marksList.add(12.33);

		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add('m');
		empData.add(12.33);
		empData.add(true);

		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Tom");
		namesList.add("naveen");
		System.out.println(namesList.size());

		//
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);// 0
		numbers.add(200);// 1
		numbers.add(300);// 2
		numbers.add(400);// 3
//		System.out.println(numbers.get(2));//300
//		System.out.println(numbers.size());//4
//		
//		numbers.remove(2);
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.size());//3

		System.out.println(numbers.get(3));// 400
		numbers.add(3, 500);
		System.out.println(numbers.get(3));// 500

		int i[] = new int[4];
		i[2] = 10;
		System.out.println(i[2]);// 10
		System.out.println(i[0]);// 0

		int j[] = { 1, 2, 3, 4, 5, 6 };// static array literals
		System.out.println(j.length);
		j[0] = 200;
		System.out.println(j[0]);

	}

}
