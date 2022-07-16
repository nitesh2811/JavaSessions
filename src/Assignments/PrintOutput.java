package Assignments;

public class PrintOutput {

	public static void main(String[] args) {

		/*1. WAP to print following output:
			I am Batman﻿
			I am Batman﻿
			I am Batman﻿
			I am Batman
			I am Batman
		 */
		
		for(int i=0;i<5;i++)
		{
			System.out.println("I am Batman");
		}

		/*2. WAP to print following output:
			I am Batman 1
			I am Batman 2
			I am Batman 3
			I am Batman 4
			I am Batman 5
			I am Batman 6
			I am Batman 7
			I am Batman 8
			I am Batman 9
		*/
		
		for (int j=1;j<=9;j++)
		{
			System.out.println("I am Batman "+j);
		}
		
		/*
		 WAP to print 10 to 1 using for, while and do-while loop
		 */
		
		System.out.println("-----------------");
		for(int k=10;k>=1;k--)
		{
			System.out.println(k);
		}
		
		System.out.println("-----------------");
		int l=10;
		while(l>=1)
		{
			System.out.println(l);
			l--;
		}
		
		System.out.println("------------------------");
		int m=10;
		do {
			System.out.println(m);
			m--;
			}	
			while(m>=1);
			
		
		}
		
		
	}


