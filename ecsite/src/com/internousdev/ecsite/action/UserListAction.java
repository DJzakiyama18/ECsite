package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	private List<UserListDTO> userList = new ArrayList<>();

	UserListDAO dao = new UserListDAO();

	public String execute() {

		userList = dao.listuser();

		for (UserListDTO a : userList) {
			System.out.println(a.getUser_name());
		}

		String result = SUCCESS;
		return result;
	}










	public List<UserListDTO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserListDTO> userList) {
		this.userList = userList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
