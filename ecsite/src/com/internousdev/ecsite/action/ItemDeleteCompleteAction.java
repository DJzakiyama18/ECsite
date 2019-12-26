package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport {

	private String message;



	public String execute(){
		String result = ERROR;
		ItemDeleteCompleteDAO dao = new ItemDeleteCompleteDAO();

		int res = dao.deleteItem();
		if(res > 0){

			setMessage("商品情報を削除しました");
			result = SUCCESS;
		}else{
			setMessage("商品情報削除に失敗しました");
		}
		return result;
	}














	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
