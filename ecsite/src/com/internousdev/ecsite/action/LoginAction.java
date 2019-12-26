package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private Map<String, Object> session;

	private LoginDAO loginDAO = new LoginDAO();

	private LoginDTO loginDTO = new LoginDTO();

	private BuyItemDAO buyItemDAO = new BuyItemDAO();


	public String execute(){

		String result = ERROR;

		System.out.println(loginUserId);
		System.out.println(loginPassword);
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		System.out.println(loginDTO.getLoginId());
		System.out.println(loginDTO.getLoginPassword());
		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			if("1".equals(((LoginDTO) session.get("loginUser")).getId())){
				session.put("login_user_id", loginDTO.getLoginId());
				result = "admin";
				System.out.println("thdhthrhrjerj");
			}else{
				BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

				session.put("login_user_id", loginDTO.getLoginId());
				session.put("id", buyItemDTO.getId());
				session.put("buyItem_name", buyItemDTO.getItemName());
				session.put("buyItem_price", buyItemDTO.getItemPrice());

					return SUCCESS;
			}
		}

		return result;
	}






//if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
//
//result = SUCCESS;
//
//BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
//
//session.put("login_user_id", loginDTO.getLoginId());
//session.put("id", buyItemDTO.getId());
//session.put("buyItem_name", buyItemDTO.getItemName());
//session.put("buyItem_price", buyItemDTO.getItemPrice());
//
//	return result;

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
