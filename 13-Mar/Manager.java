
public class Manager extends Employee{
	private String department;
	private int officeNumber; 

	public Manager(String name, double d, String department){
		super(name,d);
		this.department = department;
	}
	
	public double calculateSalary(){
		double total = this.getSalary();
		total = total - 0.05*total + 0.1*total;
		return total;
	}

}
