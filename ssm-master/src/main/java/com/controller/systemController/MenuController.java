package com.controller.systemController;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.userrole.Menu;
import com.model.userrole.UserInfo;
import com.service.userService.MenuService;
import com.service.userService.UserService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	
	@Autowired
	public  UserService userService;
	@Autowired
	public  MenuService menuService;
	
	
	@RequestMapping(value="/menulist", method=RequestMethod.POST)
	@ResponseBody
	public  Object  menulist(Menu menu){
		List<Menu> menulist = menuService.findMenuList(menu);
		if(menulist.size()<1){
			menulist = new ArrayList<Menu>();
		}
		return menulist;
	}
	
}
