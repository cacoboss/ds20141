
public class RegionalManager extends Manager{
	private String region;
	
	public RegionalManager(String name, double s, String department){
		super(name,s, department);
	}
	
	@Override	
	public double calculateSalary(){
		return getSalary()*1.5;
	}
}
