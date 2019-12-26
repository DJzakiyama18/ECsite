package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{

	private List<ItemListDTO> itemList = new ArrayList<ItemListDTO>();

	private Map<String, Object> session;
	public String execute(){
		ItemListDAO dao = new ItemListDAO();
		itemList = dao.listItem();

		String result = SUCCESS;

		for(ItemListDTO s : itemList){
			System.out.println(s.getId());
		}

		return result;
	}


	public List<ItemListDTO> getItemList() {
		return itemList;
	}



	public void setItemList(List<ItemListDTO> itemList) {
		this.itemList = itemList;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}


}
