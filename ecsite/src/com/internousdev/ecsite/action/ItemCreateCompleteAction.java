package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

//	private String item_name;
//
//	private String item_price;
//
//	private String item_stock;

	ItemCreateCompleteDAO dao = new ItemCreateCompleteDAO();

	public String execute(){

		dao.insertItem(session.get("item_name").toString(), session.get("item_price").toString(), session.get("item_stock").toString());

		System.out.println(session.get("item_name").toString());


        System.out.println(session.get("item_price").toString());

        System.out.println(session.get("item_stock").toString());

        String result = SUCCESS;

		return result;


	}



	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
