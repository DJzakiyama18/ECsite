package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UpdateItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateItemAction extends ActionSupport{
	private String id;

	private String name = "";

    private String item_price = "";

    private String item_stock = "";


    private UpdateItemDAO dao = new UpdateItemDAO();

//	public String execute(){
//		String result = ERROR;
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(item_price);
//		System.out.println(item_stock);
//
//		try {
//			int res = dao.itemUpdate(name, item_price, item_stock, id);
//			if(res>0){
//				System.out.println("成功しました。");
//				result= SUCCESS;
//			}else{
//				System.out.println("失敗しました。");
//				result = ERROR;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}


	public String execute() {
		String result = ERROR;
		 System.out.println(name);
		 System.out.println(id);
		 System.out.println(item_price);
		 System.out.println(item_stock);
		try{

				int res = dao.itemAllUpdate(name, item_price, item_stock, id);
				if(res>0){
					System.out.println("成功しました。");
					result= SUCCESS;
				}else{
					System.out.println("失敗しました。");
					result = ERROR;
				}

		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
//
//		try{
//			int res = dao.itemNmaeUpdate(name, id);
//			if(res > 0){
//				System.out.println("1件成功しました");
//				result = SUCCESS;
//			}else {
//				System.out.println("失敗しました。");
//				result = ERROR;
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//	} else {
//		System.out.println("エラー");
//		result = ERROR;
//	}




//	else if (!(name.equals("")) || !(item_price.equals("")) || !(item_stock.equals(""))) {
//		if(!(name.equals(""))){
//			try{
//				int res = dao.itemNmaeUpdate(name, id);
//				if(res > 0){
//					System.out.println("1件成功しました");
//					result = SUCCESS;
//				}else {
//					System.out.println("失敗しました。");
//					result = ERROR;
//				}
//			}catch(SQLException e){
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("エラー");
//			result = ERROR;
//		}


































	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem_price() {
		return item_price;
	}

	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}

	public String getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(String item_stock) {
		this.item_stock = item_stock;
	}

}
