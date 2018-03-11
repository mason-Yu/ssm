package com.mapper.userrolemapper;

import java.util.List;

import com.model.userrole.UserInfo;

import core.utils.PageUtil;

public interface UserMapper {
	public UserInfo userLogin(UserInfo user);
	public List<UserInfo> queryuserInfo(PageUtil page);
	
}
