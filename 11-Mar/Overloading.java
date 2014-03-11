/*
* Overloading.java: Simple class to show Overloading & varargs.
* 
*/
public class Overloading{
	
	private static double max( double... a ){ //varargs
		double m = a[0];
		for( double d : a)
			if( m < d )
				m = d;
		return m;
	}

	private static double max( double a, double b){
		if( a > b )
			return a;
		return b;
	}

	public static void main(String args[]){
		System.out.println(max(1,2,4));
		//System.out.println(max(3,5,7,-1,4,-1,-2,34));
		
	}	
}
