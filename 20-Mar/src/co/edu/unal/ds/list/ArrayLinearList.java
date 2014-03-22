package co.edu.unal.ds.list;

import java.util.Objects;

@SuppressWarnings("unchecked")
public class ArrayLinearList<T> implements LinearList<T>{
	protected T[] element;
	protected int size;

	public ArrayLinearList(){
		this(10);
	}
	
	public ArrayLinearList(int initialCapacity){
		element = (T[]) new Object[initialCapacity];
		size = 0;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public int size(){
		return size;
	}

	private void checkIndex(int index){
		if( index < 0 || index >= size )
			throw new IndexOutOfBoundsException();
	}
	
	public void add(int index, T elem){
		if( index < 0 || index > size )
			throw new IndexOutOfBoundsException();
	
		if( size == element.length ){
			T[] old = element;
			element = (T[]) new Object[2 * size];
			System.arraycopy(old, 0, element, 0, size);
		}
		
		for(int i = size-1; i>=index; i--)
			element[i+1] = element[i];
		
		element[index] = elem;
		size++;
	}
}
