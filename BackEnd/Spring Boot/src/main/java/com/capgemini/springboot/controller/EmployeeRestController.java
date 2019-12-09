package com.capgemini.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.capgemini.springboot.beans.EmployeeInfoBean;
import com.capgemini.springboot.beans.EmployeeResponse;
import com.capgemini.springboot.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeRestController {

	
	@Autowired
	private EmployeeService service;
	
	@GetMapping(path="/getEmployee",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody   
	public EmployeeResponse getEmployee(int empid) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empid);
		EmployeeResponse response = new EmployeeResponse();
		if(employeeInfoBean != null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Employee Record Found");
			response.setEmployeeInfoBean(employeeInfoBean);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee failed to add");
		}
		return response;		// might have error
		
	}
	@PutMapping(path="/addEmployee",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		
		EmployeeResponse response = new EmployeeResponse();
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Added Successfully");
		}
		else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Employee failed to add");
		}
		return response;
	}
	
	@DeleteMapping(path="/deleteEmployee/{empid}",
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse deleteEmployee(@PathVariable("empid") int empid) {
		boolean isDeleted =  service.deleteEmployee(empid);
		
		EmployeeResponse response = new EmployeeResponse();
		if(isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Deleted Successfully");
		}
		else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Employee failed to delete");
		}
		return response;
		
	}
	
	@PostMapping(path="/updateEmployee",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse updateEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if(isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Updated Successfully");
		}
		else {
			response.setStatusCode(400);
			response.setMessage("Failed");
			response.setDescription("Employee failed to update");
		}
		return response;
	}
	@GetMapping(path="/getall",
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployee() {
		List<EmployeeInfoBean> employeeList = service.getAllEmployee();
		EmployeeResponse response = new EmployeeResponse();
		
		if(employeeList != null && !employeeList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record found");
			response.setEmployeeList(employeeList);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to add record ");
		}
		return response;
	}
	
}
