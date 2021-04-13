package org.accolite.msau.Employees;

import java.util.List;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/employees")
public class EmpResource {
	
	EmployeeService employeeService = new EmployeeService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee add(Employee employee) throws IllegalAccessException {
		return employeeService.addEmployee(employee);
	}
	
	@PUT
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee updateEmployee(@PathParam("employeeId") int id,Employee employee)
	{
		employee.setId(id);
		return employeeService.update(employee);
	}
	@DELETE
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> deleteEmployee(@PathParam("employeeId") int id)
	{
		return employeeService.delete(id);		
	}
}
