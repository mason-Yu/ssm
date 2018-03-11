package com.service.baseServiceImp;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.emp.EmpInfo;
import com.service.baseService.BaseService;


public class BaseServiceImp  extends SqlSessionDaoSupport implements BaseService {
	
	@Override
    @Autowired  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
          
        super.setSqlSessionFactory(sqlSessionFactory);  
    }

	@Override
	public List pageList(List listInfo, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		ArrayList pageList = new ArrayList<>();
		
		
		
		return null;
	} 
}
