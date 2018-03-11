package com.controller.userController;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.model.userrole.Menu;
import com.model.userrole.UserInfo;
import com.service.userService.MenuService;
import com.service.userService.UserService;

import core.utils.App;
import core.utils.EasyuiTreeNode;
import core.utils.WebFrontHelper;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public  UserService userService;
	@Autowired
	public  MenuService menuService;
	
	public  Object  Login(HttpSession session,UserInfo user,Model model){
		UserInfo loginuser = (UserInfo) session.getAttribute(App.USER_SESSION_KEY);
		if (user == null) {			
			return "login";
		}
		List<Menu> menulist = menuService.findMenuByUser(loginuser);
		System.out.println(loginuser.getUserId()+"---------"+menulist);
		
		if (menulist == null || menulist.size() == 0) {
			session.invalidate();
			return "main";
		}
		
		
		System.out.println(menulist.get(0).getMenuName()+"///////////////////");
		EasyuiTreeNode root = WebFrontHelper.buildTreeForEasyuiTree(menulist);
		session.setAttribute("treeJson", new Gson().toJson(root.getChildren()));
		
		return "main";
	}
	@RequestMapping(value="/LoginInfo", method=RequestMethod.POST)
	@ResponseBody
	public  Object  userLogin(HttpSession session,UserInfo user,Model model){
		UserInfo userinfo = userService.userLogin(user);
		System.out.println(userinfo);
		if(userinfo != null){
			session.setAttribute(App.USER_SESSION_KEY, userinfo);
			
			Login(session, userinfo, model);
			return "success";
		}
		return "error";
	} 
}
