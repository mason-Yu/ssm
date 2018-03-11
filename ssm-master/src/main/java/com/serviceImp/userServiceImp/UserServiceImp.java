package com.serviceImp.userServiceImp;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mapper.userrolemapper.UserMapper;
import com.model.userrole.UserInfo;
import com.service.baseServiceImp.BaseServiceImp;
import com.service.userService.UserService;

import core.utils.PageUtil;
@Repository("userService")
public class UserServiceImp extends BaseServiceImp implements UserService {
	
	@Autowired
	private UserMapper usermapper;
	@Override
	public UserInfo userLogin(UserInfo user) {
		// TODO Auto-generated method stub
		return usermapper.userLogin(user);
	}

	@Override
	public List<UserInfo> queryuserInfo(PageUtil page) {
		// TODO Auto-generated method stub
		return usermapper.queryuserInfo(page);
	}

}
