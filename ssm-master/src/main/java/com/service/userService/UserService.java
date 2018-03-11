package com.service.userService;

import java.util.List;

import com.model.userrole.UserInfo;

import core.utils.PageUtil;

public interface UserService {
	public UserInfo userLogin(UserInfo user);
	public List<UserInfo> queryuserInfo(PageUtil page);
}
