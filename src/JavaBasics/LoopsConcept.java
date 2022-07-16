package JavaBasics;
/**
 * 
 * @author Nitesh Agrawal
 *
 */
public class LoopsConcept {
	
	public static void main(String[] args) {
		// 1 to 10:
		// Used mostly for repetitve task
		// 1. while loop:
		//The only difference between while and do while loop is 
		//do while loop is excuted even once also though the 
		//condition is false
		
		int i = 1;
		while (i <= 10) {// we provide a boolean condition here
			System.out.println(i);// 1 2 3 4 5 ...10
			i++;
			// ++i; we can write this also because value of i will be incremented.
			// i=i+1;
		}

		System.out.println("--------");

		int k = 1;
		while (k <= 100) {
			System.out.println(k);
			if (k % 5 == 0) {
				System.out.println("hiiii");
				break; // this break can be used beacuse if condition is acutally inside the while loop
				// alone with if break cannot be used.
				// it will break completely while loop and come out
			}
			k++;
		}

		// use cases of while loop:
		// 1. you have to use while loop when number of iterations are not fixed
		// 2. waiting for the element on the page
		// 3. waiting for the page to be loaded
		// 4. pagination : 1 2 3 4 5 6 ....11..20 //Important for interview 
		

		System.out.println("--------");

//				while(true) {
//					System.out.println("welcome to TAJ HOTEL");
//				}

		// Practical use case of Infinite Loop
		// Programming Language uses RAM memory not for hard disk.

		// 2. for loop:
		// 1 to 10:
//				for(int j = 1; j<=10; ++j) {
		// when condition is statisfied , it comes inside the for loop execute and then
		// increment
//					System.out.println(j);//12345...10
//				}

		int j = 1;
		for (; j <= 10;) {
			System.out.println(j);// 12345...10
			++j;
		}

		System.out.println("---10 to 1-----");

		for (int l = 10; l >= 1; l--) {
			System.out.println(l);// 10 9
		}

		// In for loop if the condition is not statisfied , it will terminate the loop
		// The increment of the variable in for loop happens only after the inner block
		// is excuted
		System.out.println("--------");
		//Below for loop is also an infinite loop 
		
//				for(; ;) { //this tells that condition is true
//					System.out.println("Hello");
//					//break;
//				}

		// use cases of for loop:
		// 1. use for loop when number of iterations are fixed
		// 2. drop down traversing
		// 3. menu items of the page
		// 4. calendar handling

		// 3. do-while loop:
		//Statement is excuted atleast once.
		
		//Good  ques
		int p = 1;
		do {
			p++;
			System.out.println(p);// 2 3 4 ...10 11
		} while (p <= 10);
		

		// 4. for each-applied on array and array list
		// 5. streams

	}

}


