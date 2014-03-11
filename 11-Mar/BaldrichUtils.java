
public class BaldrichUtils{
	
	public static void sayHello(){
		System.out.println("Hello");
	}

	public static int[] insertionSort(int a[]){
		int n = a.length, j, x;
		for( int i=1; i<n; i++ ){
			j=i;
			while( j > 0 && a[j-1]  < a[j] ){
				x = a[j];
				a[j] = a[j-1];
				a[j-1] = x;
				--j;
			}
		}
		return a;
	}

	public static boolean isPalindrome(String s){
		int n = s.length();
		for( int i=0; i<n/2; i++){
			if( s.charAt(i) != s.charAt(n - i - 1) )	
				return false;
		}
		return true;
	}
}
