package co.edu.unal.ds.list;
import java.util.*;
import java.io.*;

public class ArrayLinearListImproved<T extends Serializable  & Comparable< ? super T >>	extends ArrayLinearList<T> implements LinearListImproved<T>{
	
	public ArrayLinearListImproved( int initialCapacity ){
		super( initialCapacity );
	}

	public ArrayLinearListImproved( ){
		this( 10 );
	}
	
	public void save( String fn ){
		try( ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream( fn ))){
			os.writeInt( size );
			for( T elem : this )
				os.writeObject( elem );
		}
		catch( IOException e ){
			e.printStackTrace();
		}
		System.out.println("Save done :) ");
	}
	
	@SuppressWarnings("unchecked")
	public void load( String fn ){
		try( ObjectInputStream is = new ObjectInputStream( new FileInputStream (fn ))){
			int n = is.readInt();
			for(int i=0; i<n ; i++ )
				add( i, (T) is.readObject() ); 
		}
		catch( IOException | ClassNotFoundException e ){
			e.printStackTrace();
		}
		System.out.println("Load done <:-{D");
	}

	public void sort( ){
		Arrays.sort( element, 0, size );
	}

	public void sort( Comparator<T> c ){
		Arrays.sort( element, 0, size, c );
	}

}
