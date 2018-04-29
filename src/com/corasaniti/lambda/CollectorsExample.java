package com.corasaniti.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.corasaniti.lambda.model.Employee;
import com.corasaniti.lambda.model.Persona;
import com.corasaniti.lambda.model.instance.MyEmployee;
import com.corasaniti.lambda.model.instance.MyFamily;
import com.corasaniti.lambda.model.Department;

/*
 * java.util.stream.Collectors Example
 * 
 * http://www.baeldung.com/java-8-collectors
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
 */
public class CollectorsExample {

    public static void main(String[] args) 
    {    
    	//Create My Family
    	MyFamily myFamily = new MyFamily();
    	
    	//Create a Stream instance representing a sequence of elements and collect(raccoglie) them into a LinkedList instance
    	List<Persona> familyList = myFamily.getMyFamily().stream().collect(Collectors.toCollection(LinkedList::new));
    	familyList.forEach(System.out::println);
    	
        //Accumulate il nome into a List
        List<String> list = myFamily.getMyFamily().stream().map(Persona::getNome).collect(Collectors.toList());
        list.forEach(System.out::println);        
        
        //Compute sum of dell'età delle persone della famiglia
        int totalYear = myFamily.getMyFamily().stream().collect(Collectors.summingInt(Persona::getEta));        
        System.out.println("La somma totale degli anni della mia famiglia è:\n" + totalYear);

        
        // Compute sum of salaries of employee
        List<Employee>  myEmployeeList = new MyEmployee().getMyEmployee();
        double totalSalary = myEmployeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total Salary of Employee is \n" + totalSalary);
        
        // Group employees by department
        Map<Department, List<Employee>> mapByDept = myEmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("mapByDept size" + mapByDept.size());
        
        // Compute sum of salaries by department
        Map<Department, Double> totalMapByDept = myEmployeeList.stream() .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println("totalMapByDept size " + totalMapByDept.size());

        // Partition Employee ignto THRESHOLD salary
        double THRESHOLD_SALARY = 42000.00;
        Map<Boolean, List<Employee>> employeeRich = myEmployeeList.stream().collect(Collectors.partitioningBy((e)->e.getSalary()>=THRESHOLD_SALARY));
        System.out.println("employeeRich " + employeeRich.size());
        
    	
    }
}
