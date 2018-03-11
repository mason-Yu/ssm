package com.mapper.empmapper;

import java.util.List;

import com.model.emp.EmpInfo;

import core.utils.PageUtil;

public interface EmpMapper {
	
	
public List<EmpInfo> getEmpInfo(EmpInfo empInfo);
public List<EmpInfo> queryEmpInfoByNameAndDept(PageUtil page);


}
