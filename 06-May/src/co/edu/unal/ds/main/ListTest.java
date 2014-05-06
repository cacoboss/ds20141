package co.edu.unal.ds.main;
import  co.edu.unal.ds.list.*;

public class ListTest{
	
	public static void main(String args[]){
		LinearList<Integer> list = new ArrayLinearList<>();	
		for( int i=0; i<10; i++)
			list.add(0,10-i);
		System.out.printf("List is %sempty\n", list.isEmpty()?"":"not ");
		System.out.println(list);
		for( int i=9; i>=1; i-=2 )
			list.remove(i);
		System.out.println(list);
		System.out.printf("Index of 7 is %d\n", list.indexOf(7));
		System.out.printf("Index of -70 is %d\n", list.indexOf(-70));
		System.out.println(list.get(list.indexOf(3)));
		
	}	
}

