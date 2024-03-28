package com.sist.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.dao.EmpDAO;
import com.sist.web.entity.Emp;

@Controller
public class MainController {
	private EmpDAO dao;
	
	@Autowired
	public MainController(EmpDAO dao)
	{
		this.dao=dao;
	}
	@GetMapping("/")
	public String emp_list(Model model)
	{
		List<Emp> list=dao.findAll();
		model.addAttribute("list",list);
		return "main";
	}
	
}
