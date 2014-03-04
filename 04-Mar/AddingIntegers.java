/* 
	AddingIntegers.java: Read two integers and add them.
*/

import java.util.Scanner;

public class AddingIntegers{
	public static void main(String args[]){
		int i1,i2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		i1 = sc.nextInt();
		System.out.print("\nEnter second number: ");
		i2 = sc.nextInt();
		sum = i1 + i2;
		System.out.printf("The sum between %d and %d is %s\n\n", i1,i2,sum);

		if( sum % 2 == 0)
			System.out.println("\nThe sum is even");
		else 
			System.out.println("\nThe sum is odd");
		String s = (sum % 2 == 0 ? "even" : "odd");
		System.out.printf("\nThe sum is  %s\n" , s);
	}	
}
