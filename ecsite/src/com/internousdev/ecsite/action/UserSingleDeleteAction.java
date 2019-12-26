package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.UserSingleDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserSingleDeleteAction extends ActionSupport{
	private String id;
	private UserSingleDeleteDAO dao = new UserSingleDeleteDAO();
	public String execute(){
		String result = ERROR;
		int res = dao.userSingleDelete(id);

		if(res>0){
		result = SUCCESS;
		}
		return result;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

