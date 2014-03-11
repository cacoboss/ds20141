package co.edu.unal.ds.test;

import co.edu.unal.ds.util.BaldrichUtils;
import static java.lang.System.*;
import java.util.Arrays;

public class Driver{

	public static void main(String args[]){
		out.println(BaldrichUtils.isPalindrome("ana"));
		out.println(Arrays.toString(BaldrichUtils.insertionSort(new int[]{12,-1,1,-10})));
		BaldrichUtils.sayHello();
	}
}	
