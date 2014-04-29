package co.edu.unal.ds.chain;


public class SortedChain< T extends Comparable< ? super T >  > extends Chain< T >{
	@Override
	public void add( int index, T elem ){
		//Is the chain empty or the element is less than the actual first?
		if( isEmpty() || elem.compareTo( firstNode.element ) <= 0 ){
			firstNode = new ChainNode< T >( elem, firstNode ); 
		}
		else{
		//Keep moving until we find the last element or one that is greater or equal	
			ChainNode< T > p = firstNode, q = firstNode;
			while( p.next != null && elem.compareTo( p.next.element ) > 0 )
				p = p.next;
			p.next = new ChainNode< T > ( elem, p.next );
		}  
		size++;
	}
	
	/*
	 * We do not have to override remove, it is the exact same logic!
	 */
	
} 
