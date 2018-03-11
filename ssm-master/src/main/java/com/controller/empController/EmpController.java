package com.controller.empController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.emp.EmpInfo;
import com.service.empService.EmpService;

import core.utils.PageUtil;

@Controller
@RequestMapping("/empController")
public class EmpController {
	@Autowired
	public  EmpService empServiceImp;
	
	
	@RequestMapping("/queryEmpInfo")
	public @ResponseBody PageUtil  queryEmpInfo(EmpInfo emp,HttpServletRequest request,HttpSession session,PageUtil page){
		page.setQueryObj(emp);
		List<EmpInfo> list = empServiceImp.getEmpInfoByNameAndDept(page);
		page.setData(list);
		return page;
	} 
	
	
	

	
}
