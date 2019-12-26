package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemStockDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyitemConfirmAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;

	private String errorMessage;

	private BuyItemCompleteDAO buyItemCompleateDAO = new BuyItemCompleteDAO();

	private BuyItemStockDTO stockDTO = new BuyItemStockDTO();

//	public String execute()throws SQLException{
//		buyItemCompleateDAO.buyItemInfo(
//				session.get("id").toString(),
//				session.get("total_price").toString(),
//				session.get("count").toString(),
//				session.get("login_user_id").toString(),
//				session.get("pay").toString());
//
//
//		buyItemCompleateDAO.subtractionStock(session.get("count").toString(), session.get("id").toString());
//
//		String result = SUCCESS;
//
//		return result;
//
//	}




	public String execute()throws SQLException{
		buyItemCompleateDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("login_user_id").toString(),
				session.get("pay").toString());
		 stockDTO = buyItemCompleateDAO.getStock(session.get("id").toString());

		 if(stockDTO.getStock()>0){
			 buyItemCompleateDAO.subtractionStock(session.get("count").toString(), session.get("id").toString());

			 		String result = SUCCESS;
			 		return result;
		 }else{
			 setErrorMessage("在庫がたりません。");
			 String result = ERROR;
			 return result;
		 }

	}
















	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}




	public BuyItemStockDTO getStockDTO() {
		return stockDTO;
	}




	public void setStockDTO(BuyItemStockDTO stockDTO) {
		this.stockDTO = stockDTO;
	}
















	public String getErrorMessage() {
		return errorMessage;
	}
















	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}

//System.out.println(session.get("total_price").toString());
//
//for(String key : session.keySet()){
//	System.out.println(key);
//}