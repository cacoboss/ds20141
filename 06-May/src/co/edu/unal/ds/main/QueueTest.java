package co.edu.unal.ds.main;
import  co.edu.unal.ds.queue.*;
import java.util.Random;

public class QueueTest{
	private static Random random = new Random( System.currentTimeMillis() );
	
	public static void main (String [] args){
		Queue<Integer> queue = new ArrayQueue<>();
		for( int i=0,x; i<10; i++ ){
			x = random.nextInt(90) + 10; 
			System.out.printf("Adding %s to queue: \n", x);
			queue.put( x );
			System.out.printf("Queue: %s\n", queue);
			
		}
		while( !queue.isEmpty() ){
			queue.remove();
			System.out.printf("Queue: %s\n", queue);
		}
	}
}
