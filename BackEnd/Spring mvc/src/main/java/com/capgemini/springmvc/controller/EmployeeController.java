package com.capgemini.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.bean.EmployeeInfoBean;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/empLoginForm")
	public String displayEmpLoginForm() {
		return "empLoginForm";
	}//End of method
	
	@PostMapping("/empLogin")
	public String emplogin(int empId,String password, ModelMap modelMap) {//The name of empLoginfoem name and here inpara level name must be ame
	
		EmployeeInfoBean employeeInfoBean =  service.authenticate(empId, password);
		if(employeeInfoBean != null)
		{
			return "empHomePage";
		}
		else
		{
			modelMap.addAttribute("msg", "Invalid Crdential.......");
			return "empLoginForm";
		}
		
	}//End of empLogin()

}//End of Controller
