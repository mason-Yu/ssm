package core.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.model.userrole.Menu;

public class WebFrontHelper {
	
	public static Menu buildMenuTree(List<Menu> menus) {
		
		Map<String, Menu> menuMap = new LinkedHashMap<String, Menu>();
		Menu rootMenu = new Menu();
		rootMenu.setMenuId(10001);
		rootMenu.setMenuName("Root");
		menuMap.put("root", rootMenu);
		
		for (Menu menu : menus) {
			menuMap.put(menu.getMenuId()+"", menu);
		}
		
		for (Menu menu : menus) {
			String parentMenuId = menu.getParentMenuId()+"";
			if (parentMenuId == null || "".equals(parentMenuId) || "null".equals(parentMenuId)) {
				parentMenuId = "root";
			} 
			
			menuMap.get(parentMenuId+"").addChild(menu);
		}

		return rootMenu;
	}

	public static EasyuiTreeNode buildTreeForEasyuiTree(List<Menu> menus, List<String> menuIdsForChecked) {
		
		Map<String, EasyuiTreeNode> map = new LinkedHashMap<String, EasyuiTreeNode>();
		EasyuiTreeNode root = new EasyuiTreeNode();
		root.setId("root");
		root.setText("Root");
		map.put("root", root);
		
		for (Menu menu : menus) {
			EasyuiTreeNode node = new EasyuiTreeNode();
			node.setId(menu.getMenuId()+"");
			node.setText(menu.getMenuName());
			node.setParentId(menu.getParentMenuId()+"");
			node.setAttributes(menu);
			
			map.put(node.getId(), node);
		}
		
		for (Map.Entry<String, EasyuiTreeNode> entry : map.entrySet()) {
			EasyuiTreeNode node = entry.getValue();
			
			if ("root".equals(node.getId())) {
				continue;
			}
			
			String parentId = node.getParentId();
			
			if (parentId == null || "".equals(parentId)|| "null".equals(parentId)) {
				parentId = "root";
			}
			
			map.get(parentId).addChild(node);
		}
		
				
		if (menuIdsForChecked != null && menuIdsForChecked.size() > 0) {
			for (Map.Entry<String, EasyuiTreeNode> entry : map.entrySet()) {
				EasyuiTreeNode node = entry.getValue();
			
				if (menuIdsForChecked.contains(node.getId())) {
					node.setChecked(true);
				}
			}
		}

		return root;
	}
	
	public static EasyuiTreeNode buildTreeForEasyuiTree(List<Menu> menus) {
		return buildTreeForEasyuiTree(menus, null);
	}
	
}
