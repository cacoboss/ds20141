package co.edu.unal.ds.main;
import co.edu.unal.ds.stack.*;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SwitchBox{
	public static void main (String [] args){
		Scanner sc = new Scanner( System.in );
		while( true ){
			System.out.print("Enter the number of pins (or <= 0 to exit ): ");
			int n;
			try{
				n = sc.nextInt();
				if( n <= 0 )
					break;
			}
			catch( InputMismatchException ex ){
				sc.skip(".*");
				continue;
			}
			int net[] = new int[n];
			System.out.printf("Enter the network ( %d pins ): ", n);
			for( int i=0;i<n ;i++ ){
				try{
					net[i] = sc.nextInt();
				}
				catch( InputMismatchException ex ){
					System.out.println("Fuck you.");
					System.exit( Integer.MIN_VALUE );
				}
			}
			System.out.printf("Network is %sroutable\n", routable( net ) ? "": "not ");
		}
	}
	
	public static boolean routable( int net[] ){
		Stack<Integer> stack = new DerivedArrayStack<>();
		for( int i=0; i < net.length; i++ ){
			if( !stack.isEmpty() )
				if( net[i] == stack.peek() )
					stack.pop();
				else stack.push( net[i] );
			else stack.push( net[i] );
		}
		return stack.isEmpty();
	}
		
} 
