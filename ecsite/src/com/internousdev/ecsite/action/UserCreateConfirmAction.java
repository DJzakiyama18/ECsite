package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String userName;

	private Map<String, Object> session;

	private String errorMessage;


	public String execute(){

		String result = SUCCESS;


		if (!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))) {

			UserCreateConfirmDAO dao = new UserCreateConfirmDAO();

			String userId = dao.userSelect(loginUserId);

			if (!(userId.equals("null"))) {
				setErrorMessage("そのIDは登録されています。");

				result = ERROR;
			} else {
				session.put("loginUserId", loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("userName", userName);

				result = SUCCESS;
			}

		} else {
			setErrorMessage("未入力の項目があります。");

			result = ERROR;
		}

		return result;
	}

//	public String execute(){
//		String result = ERROR;
//
//		UserCreateConfirmDAO dao = new UserCreateConfirmDAO();
//
//		String userId = dao.userSelect(loginUserId);
//
//		if(!(userId.equals("null"))){
//			System.out.println("そのIDは登録されています");
//			System.out.println(userId);
//
//			result = SUCCESS;
//		}else{
//			System.out.println("そのIDは未登録です");
//			System.out.println(userId);
//			result = SUCCESS;
//		}
//		return result;
//	}




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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
