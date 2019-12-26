package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.SingleItemDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class SingleItemDeleteAction extends ActionSupport{

	private String id;
	private SingleItemDeleteDAO dao = new SingleItemDeleteDAO();
	public String execute(){
		String result = ERROR;
		int res = dao.singleDelete(id);

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
