import java.io.*;

public class Exceptions{
	public static void main(String args[]) {
		try{
			//System.out.println(divide(3,4));
			System.out.println(divide(3,0.0));
			//System.out.println(divide(3,3));
		}
		catch(Exception e){
			System.out.println("Está dividiendo por cero amiguito");
		}
		System.out.println("Después del catch");

	}

	public static double divide(double a, double b) throws Exception{
		if(b == 0.0)
			throw new Exception("baaahhh está dividiendo por zero baaaaahhhAAAAHHH");
		return a/b;
	}
}
