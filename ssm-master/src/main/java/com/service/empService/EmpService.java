package com.service.empService;

import java.util.List;

import com.model.emp.EmpInfo;

import core.utils.PageUtil;

public interface EmpService {

	public List<EmpInfo> getEmpInfo(EmpInfo emp);
	public List<EmpInfo> getEmpInfoByNameAndDept(PageUtil page);
}
