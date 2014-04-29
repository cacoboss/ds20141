package co.edu.unal.ds.main;
import  co.edu.unal.ds.list.*;

public class MergeTest {
	public static void main (String [] args){
		ArrayLinearList<Integer> list1 = new ArrayLinearList<>(), list2 = new ArrayLinearList<>();
		for(int i=0; i<5; i++ )
			list1.add( i, i );
		System.out.printf("List 1 is: %s\n", list1);
		
		for( int i=0; i< 15 ; i++ ) {
			list2.add( i, 20 + i );
		}

		System.out.printf("List 2 is: %s\n", list2);

		list1.merge( list2 );

		System.out.printf("List 1 after merge is: %s\n", list1);
				
	}
}
