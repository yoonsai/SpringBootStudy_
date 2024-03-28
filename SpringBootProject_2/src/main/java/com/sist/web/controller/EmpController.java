package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import com.sist.web.dao.*;
import com.sist.web.vo.*;

import org.springframework.ui.Model;

import com.sist.web.service.*;
@Controller
public class EmpController {
	
	private EmpService eService;
	
	@Autowired
	public EmpController(EmpService eService) {
		this.eService=eService;
	}
	
	@GetMapping("/")
	public String empListData(Model model) {
		List<EmpVO> list=eService.empListData();
		model.addAttribute("list", list);
		return "main";
	}
}
