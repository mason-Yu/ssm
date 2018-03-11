package com.serviceImp.userServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapper.userrolemapper.MenuMapper;
import com.mapper.userrolemapper.MenuRoleMapper;
import com.model.userrole.Menu;
import com.model.userrole.UserInfo;
import com.service.baseServiceImp.BaseServiceImp;
import com.service.userService.MenuService;
@Repository("menuService")
public class MenuServiceImp extends BaseServiceImp implements MenuService{
	@Autowired
	private MenuRoleMapper menuRolemapper;
	@Autowired
	private MenuMapper menumapper;
	@Override
	public List<Menu> findMenuByUser(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return menumapper.findMenuByUser(userinfo);
	}
	@Override
	public List<Menu> findMenuList(Menu menu) {
		// TODO Auto-generated method stub
		return menumapper.findMenuList(menu);
	}
	
	
}
