package co.edu.unal.ds.stack;

import java.util.EmptyStackException;

public interface Stack<T>{
	Stack< T > push( T data );
	T pop( );
	T peek( );
	boolean isEmpty( );
}
