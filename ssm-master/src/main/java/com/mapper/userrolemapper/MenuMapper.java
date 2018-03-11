package com.mapper.userrolemapper;

import java.util.List;

import com.model.userrole.Menu;
import com.model.userrole.UserInfo;

public interface MenuMapper {
	public List<Menu> findMenuByUser(UserInfo user);
	public List<Menu> findMenuList(Menu menu);
}
