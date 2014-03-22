package co.edu.unal.ds.main;
import  co.edu.unal.ds.list.*;

public class ListTest{
	
	public static void main(String args[]){
		LinearList<Integer> list = new ArrayLinearList<>();	
		for( int i=0; i<10; i++)
			list.add(0,i);
		System.out.printf("List is %sempty\n", list.isEmpty()?"":"not ");
	}	
}

