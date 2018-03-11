package com.service.userService;

import java.util.List;

import com.model.userrole.Menu;
import com.model.userrole.UserInfo;

public interface MenuService {
	
	public List<Menu> findMenuByUser(UserInfo userinfo);
	
	public List<Menu> findMenuList(Menu menu);
}
