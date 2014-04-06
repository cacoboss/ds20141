
package co.edu.unal.ds.chain;
import  co.edu.unal.ds.list.*; 

public class ChainNode<T> {
	
	T element;
	ChainNode<T> next; 
	
	public ChainNode( T element ){
		this( element , null );
	}

	public ChainNode( ){
		this( null, null );
	}
	public ChainNode( T element, ChainNode<T> next ){
		this.element = element;
		this.next = next;
	}

}
