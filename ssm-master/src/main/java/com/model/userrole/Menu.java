package com.model.userrole;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Menu  implements  Serializable {

	/**
	 * 菜单表
	 */
	private static final long serialVersionUID = 167857L;

	private Integer menuId;
	private String menuName;
	private String menuUrl;
	private Integer parentMenuId;
	private Date updateDate;
	
	private String parentMenuName;
	private List<Menu> children = new ArrayList<Menu>();
	
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public Integer getParentMenuId() {
		return parentMenuId;
	}
	public void setParentMenuId(Integer parentMenuId) {
		this.parentMenuId = parentMenuId;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public String getParentMenuName() {
		return parentMenuName;
	}
	public void setParentMenuName(String parentMenuName) {
		this.parentMenuName = parentMenuName;
	}
	public void addChild(Menu menu) {
		if (! this.children.contains(menu)) {
			this.children.add(menu);
		}
	}
}
