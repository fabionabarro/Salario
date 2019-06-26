package entitie;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double taxInc;
	
	
	public double netSalary() {
		return grossSalary - tax; 
		}
	public double increaseSalary(double taxInc) {
		return (this.grossSalary * (taxInc /100)) + netSalary(); 
		}
	
}
