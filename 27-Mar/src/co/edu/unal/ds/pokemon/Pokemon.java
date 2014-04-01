package co.edu.unal.ds.pokemon;

import java.io.Serializable;
import java.util.Random;

public abstract class Pokemon implements Pet, Comparable<Pokemon>, Serializable{

	protected int level;
	private static Random generator = new Random(1000);
	public Pokemon( int level ){
		this.level = level;
	}

	public Pokemon( ){
		level = generator.nextInt(10);
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
} 
