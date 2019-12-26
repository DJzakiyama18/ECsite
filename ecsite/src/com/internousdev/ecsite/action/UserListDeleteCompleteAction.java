package com.internousdev.ecsite.action;


import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{
	private String message;

	private String deleteFlg;

	public String execute(){
		String result = ERROR;

		UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();
		int res = 0;

		if (deleteFlg.equals("1")) {
			res = dao.deleteNotMasterUserList();
			if (res > 0) {
				setMessage("管理者以外全件削除しました");
				result = SUCCESS;

			} else {
				setMessage("削除に失敗しました");
			}
		} else {
			res = dao.deleteUserList();

			if (res > 0) {
				setMessage("全件削除しました");
				result = SUCCESS;
			} else {
				setMessage("削除に失敗しました");
			}
		}

		return result;
	}



	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}



	public String getDeleteFlg() {
		return deleteFlg;
	}



	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
}
