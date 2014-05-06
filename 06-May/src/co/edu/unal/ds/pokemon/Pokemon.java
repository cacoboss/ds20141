package co.edu.unal.ds.pokemon;

import java.io.Serializable;
import java.util.Random;

public abstract class Pokemon implements Pet, Comparable<Pokemon>, Serializable{

	protected int level;
	protected int pokeId;
	private static Random generator = new Random(1000);
	private static Integer idGenerator = 0;
	public Pokemon( int level ){
		this.level = level;
		this.pokeId = idGenerator++;
	}

	public Pokemon( ){
		level = generator.nextInt(10);
		this.pokeId = idGenerator++;
	}

	public int getLevel(){
		return level;
	}

	public abstract void attack();
	
	public abstract void talk();

	@Override
	public int compareTo( Pokemon p ){
		return this.level - p.level;
	}

	@Override
	public String toString(){
		return String.format("Pokemon [level %d]" , level );
	}
	@Override
	public boolean equals(Object o){
		if ( o == null )
			return false;
		if ( !( o instanceof Pokemon) )
			return false;
		return this.pokeId == ((Pokemon)o).pokeId; 
	}	
	
	@Override
	public int hashCode(){
		return pokeId;
	}
} 
