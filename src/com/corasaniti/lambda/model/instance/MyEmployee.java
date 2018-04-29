package com.corasaniti.lambda.model.instance;

import java.util.Arrays;
import java.util.List;

import com.corasaniti.lambda.model.Department;
import com.corasaniti.lambda.model.Employee;

public class MyEmployee {
	
	Department department1 = new Department("Deis","Cosenza","Unical");
	Department department2 = new Department("Phisic","Cosenza","Unical");
	Department department3 = new Department("Phisic","Milano","Bocconi");
	Department department4 = new Department("Mathematic","Cosenza","Unical");
	Department department5 = new Department("Electonich","Cosenza","Unical");
	
	List<Employee> myEmployee = Arrays.asList(
		       new Employee("Libero","Nigro",department1, new Double(50000.00)),
		       new Employee("Luigi","Paolopoli",department1, new Double(40000.00)),
		       new Employee("Giuseppe","Greco",department1, new Double(40000.00)),
		       new Employee("Benito","Muraca", department2, new Double(35000.00)),
		       new Employee("Luciano","Carotenuto", department1, new Double(45000.00)),
		       new Employee("Giuseppe","Cocurullo", department5, new Double(45000.00)),
		       new Employee("Fabrizio","Brambilla", department3, new Double(55000.00))
		    );

	public List<Employee> getMyEmployee() {
		return myEmployee;
	}
}
