package co.edu.unal.ds.main;
import co.edu.unal.ds.chain.*;
import java.util.Random;

public class SortedChainTest {
	public static void main (String [] args){
		//Random r = new Random( System.currentTimeMillis() );
		Random r = new Random( 5131 );
		Chain< Integer > sortedChain  = new SortedChain<>();
		for( int i=0; i<10; i++ ){
			int x = r.nextInt( 99 ) + 10;
			System.out.printf("Adding %3s\n", x);
			
			/* Our index parameter is not useful anymore
			 * since the index is determined by the elements'
			 * natural order. Pass -1 instead ( could be anything )
			 */
			sortedChain.add( -1, x );
			System.out.printf("chain: %s\n", sortedChain);
			
		}		
		
		System.out.printf("SortedChain is : %s\n", sortedChain);
		
		while( !sortedChain.isEmpty() ){
			//remove the middle element until the list is empty
			int kill = sortedChain.size() / 2;
			System.out.printf("Removing %3s (%s) \n", kill, sortedChain.get(kill));
			sortedChain.remove( kill );
			System.out.printf("SortedChain is : %s\n", sortedChain);
		}
	
	}
}
