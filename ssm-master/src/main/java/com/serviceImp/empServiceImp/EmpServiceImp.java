package com.serviceImp.empServiceImp;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapper.empmapper.EmpMapper;
import com.model.emp.EmpInfo;
import com.service.baseServiceImp.BaseServiceImp;
import com.service.empService.EmpService;

import core.utils.PageUtil;
//@Transactional
@Repository("empServiceImp")
public class EmpServiceImp extends BaseServiceImp implements EmpService {
	
	@Autowired
	private EmpMapper empmapper;
	
	@Override
	public List<EmpInfo> getEmpInfo(EmpInfo emp) {
		// TODO Auto-generated method stub
		return empmapper.getEmpInfo(emp);
	}
	@Override
	public List<EmpInfo> getEmpInfoByNameAndDept(PageUtil page) {
		// TODO Auto-generated method stub
		return empmapper.queryEmpInfoByNameAndDept(page);
	}

}
