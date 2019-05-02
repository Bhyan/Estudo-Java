package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int repetition = sc.nextInt();
		
		for(int i = 0; i < repetition; i ++) {
			System.out.println("Emplyoee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			employee.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSearch = sc.nextInt();
		
		Employee employeeIncrement = employee.stream().filter(x -> x.getId() == idSearch).
				findFirst().orElse(null);
		
		if(employeeIncrement != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeeIncrement.incrementSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("List of employees:");
		for(Employee employees: employee) {
			System.out.println(employees);
		}
		
		sc.close();
	}

}
