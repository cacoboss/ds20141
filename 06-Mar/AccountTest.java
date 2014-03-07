/*
 * AccountTest.java: Driver class in spanglish
 */
public class AccountTest{
	
	public static void main(String args[]){
		Account acc = new Account();
		System.out.println(acc);
		System.out.println("Nos pagaron una miseria");
		acc.addMoney(10);
		System.out.println(acc);
		System.out.println("Vamos a invitar a la chica :(");
		System.out.println(acc);
		acc.withdraw(400);
		System.out.println("Pedimos prestado");
		acc.addMoney(8000);
		System.out.println(acc);
		System.out.println("Le gastamos helado");
		acc.withdraw(4000);
		System.out.println(acc);
	}


}
