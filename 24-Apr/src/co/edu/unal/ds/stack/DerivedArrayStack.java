package co.edu.unal.ds.stack;

import java.util.EmptyStackException;
import co.edu.unal.ds.list.*;

public class DerivedArrayStack <T> extends ArrayLinearList<T> implements Stack<T>{
	
	public DerivedArrayStack( int initialCapacity ){
		super( initialCapacity );
	}

	public DerivedArrayStack( ){
		this( 10 );
	}

	public boolean isEmpty( ){
		return super.isEmpty();
	}

	public Stack< T > push( T elem ){
		add( size( ), elem );
		return this;
	}

	public T peek( ){
		return get( size( ) - 1 ); 
	}

	public T pop( ){
		return remove( size( ) - 1 );
	}

	@Override
	public String toString( ){
		return super.toString();
	}
}


