/*
 * InsertionSort.java: Simple implementation of IS algorithm
 */

import java.util.Arrays;

 public class InsertionSort{
	public static void main(String args[]){
	 	int[] a = new int[]{6,8,1,3,4,9,-1,-14};
		int n = a.length;
		for( int i = 1, j, x; i < n; i++ ){
			j = i;
			while( j > 0 && a[j] < a[j-1] ){
				x = a[j];
				a[j] = a[j-1];
				a[j-1] = x;
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a);
	}

 }
