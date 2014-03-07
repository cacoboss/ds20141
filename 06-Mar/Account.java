/*
 * Account.java: A very simple bank account.
 *
 */
public class Account{
	
	private double balance;

	public Account(){
		this.balance = 200.0;
	}

	public void addMoney(double money){
		balance += money;
	}
	
	public void withdraw(double ammount){
		if( ammount > balance ){
			System.out.println("Not enough money ha ha ha ");
		}
		else{
			balance -= ammount;
			System.out.printf("New balance is %.3f\n", balance);
		}
	}
	
	public double getBalance(){
		return balance;
	}

	@Override
	public String toString(){
		return String.format("%.3f", balance);
	}

}
