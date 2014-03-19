package co.edu.unal.ds.pokemon;

public class Pokeball<P extends Pokemon>{
	private P pokemon;

	public Pokeball( P pokemon ){
		this.pokemon = pokemon;
	}
	public void restPokemon(){
		System.out.println(pokemon.sleep());
	}
}
