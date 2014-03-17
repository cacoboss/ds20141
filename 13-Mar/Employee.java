
public abstract class Employee{

	private String name;
	private double salary;

	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	protected double getSalary(){
		return salary;
	}

	public abstract double calculateSalary();

	@Override
	public String toString(){
		return String.format("%s - %f", name, salary);
	}
}
