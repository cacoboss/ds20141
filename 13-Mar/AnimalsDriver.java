
public class AnimalsDriver{
	public static void examine(Animal animal){
		animal.makeSound();
		animal.eat();
		animal.move();
	}

	public static void main(String args[]){
		Animal a = new Shark();
		examine(a);

		a = new Dog();
		examine(a);

		a = new Snake();
		examine(a);

	}
}
