package com.akhilsura28CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akhilsura28CRUD.entity.Employee;
import com.akhilsura28CRUD.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/list")
	public String listEmployee(Model model){
		
		//get employees from DB
		List<Employee> employees = employeeService.findAll();
		
		//add to Spring Model
		model.addAttribute("EMPLOYEES", employees);
		
		return "employees/list-employees";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		//create model attribute to bind form data
		
		Employee employee = new Employee();
		
		model.addAttribute("EMPLOYEE", employee);
		
		return "employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("EMPLOYEE") Employee employee) {
		
		//save the employee
		employeeService.save(employee);
		
		//use redirect to prevent duplicate submission
		return "redirect:/employees/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int id, Model model) {
		
		//get the employee from service
		Employee employee = employeeService.findById(id);
		
		//set employee as a model attribute to pre_populate the form
		model.addAttribute("EMPLOYEE", employee);
		
		
		
		
		return "employees/employee-form";	
	}
	
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("employeeId") int id) {
		
		employeeService.deleteById(id);
		
		return "redirect:/employees/list";
	}
	
	
	@GetMapping("/search")
	public String search(@RequestParam("employeeName") String name, Model theModel) {
		
		List<Employee> theEmployees = employeeService.searchBy(name);
		
		//add to the spring model
		theModel.addAttribute("EMPLOYEES", theEmployees);
		
		//send to /employees/list
		return "/employees/list-employees";
		
	}
	
}
