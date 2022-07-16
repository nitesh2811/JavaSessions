package Assignments;

public class DiamondPattern {
	
	public static int i = 0;
	public static int j = 0;
	public static int k = 0;
	public static int l = 0;
	public static void main(String[] args) {
		
		
		for (i = 1; i <= 5; i++) 
		{	
			for (j = 4; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) 
			{
				System.out.print("*");
			}
			for (l = 1; l < i; l++) 
			{
				System.out.print("*");
			}
			for (j = 4; j >= i; j--) 
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
