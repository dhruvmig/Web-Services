package org.accolite.msau.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	public static List<Employee> list = new ArrayList<>();
	static {
		Employee e1 = new Employee(1,"Dhruv",20000);
		Employee e2 = new Employee(2,"Rishit",20000);
		Employee e3 = new Employee(3,"Ramesh",20000);
		Employee e4 = new Employee(4,"Suresh",20000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
	}
	public List<Employee> getAllEmployees(){
		return list;
	}
	public Employee addEmployee(Employee employee) {
		int newId = list.size() + 1;
		employee.setId(newId);
		list.add(employee);
		return employee;
	}
	public Employee update(Employee employee) {
		for(int i=0;i<list.size();i++) {
			if (list.get(i).id==employee.id) {
				list.set(i, employee);
				return employee;
			}
		}
		return null;
	}
	public List<Employee>delete(int id)
	{
		for(int i=0;i<list.size();i++) {
			if (list.get(i).id==id) {
				list.remove(i);
				
			}
		}
		return list;
	}
}
