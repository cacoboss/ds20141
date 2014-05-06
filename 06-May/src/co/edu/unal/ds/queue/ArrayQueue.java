package co.edu.unal.ds.queue;
import java.util.Objects;
@SuppressWarnings("unchecked")
public class ArrayQueue<T> implements Queue<T>{
	T queue[];
	int front;
	int rear;

	public ArrayQueue( int initialCapacity ){
		if( initialCapacity  < 1 )
			throw new IllegalArgumentException(" duh ");
		queue = (T[]) new Object[ initialCapacity + 1 ];
		front = rear = 0;
	}
	
	public ArrayQueue( ){
		this( 10 );
	}

	public boolean isEmpty(){
		return front == rear;
	}

	public T getFrontElement( ){
		if( isEmpty() )
			return null;
		return queue[( front + 1 )  % queue.length];
	}

	public T getRearElement( ){
		return isEmpty() ? null : queue[ rear ];
	}

	public void put( T elem ){
		if( (rear + 1 ) % queue.length == front ){
			T[] old = queue;
			queue = (T[]) new Object[ 2 * queue.length ];
			int start = (front + 1) % queue.length;
			if( start < 2 )
				System.arraycopy( old, start, queue, 0, old.length - 1  );
			else{
				System.arraycopy( old, start, queue, 0, old.length - start );
				System.arraycopy( old, 0, queue, old.length - start, rear + 1 );
			}
			front = queue.length - 1;
			rear = old.length - 2;
		}
		rear = ( rear + 1 ) % queue.length;
		queue[ rear ] = elem;
	}
	
	public T remove( ){
		if( isEmpty() ) return null;
		front = ( front + 1 ) % queue.length;
		T elem = queue[ front ];
		queue[ front ] = null;
		return elem;
	}
	@Override
	public String toString(){
		throw new UnsupportedOperationException();
	}
}


