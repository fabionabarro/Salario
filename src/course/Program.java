package course;


import java.util.Scanner;

import entitie.Employee;



public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee(); 
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.print("Employee: " + employee.name + ", $ " + String.format("%.2f",employee.netSalary()));
		System.out.println();
		
		System.out.print("Which percentage to increase salary? " );
		double taxInc = sc.nextDouble();
		employee.increaseSalary(taxInc);
		System.out.println();
		System.out.print("Update data: " +  employee.name + ", $" +String.format("%.2f", employee.increaseSalary(taxInc)));
		
		
		sc.close();
		
	}

	
}
