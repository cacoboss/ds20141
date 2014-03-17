
public class Driver{
	public static void main(String args[]){
		Manager emp = new Manager("Steve Jobs", 600000, "ceo");
		System.out.println(emp);
		System.out.println(emp.calculateSalary());
	}
}
