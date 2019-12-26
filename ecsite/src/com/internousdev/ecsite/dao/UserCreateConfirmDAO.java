package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {

	DBConnector db = new DBConnector();

	private String loginUserId = "null";

//	public String userSelect(String Id ){
//
//		String loginUserId = "null";
//
//		String sql = "select * from login_user_transaction where login_id = ? ";
//
//		try(Connection con = db.getConnection()){
//
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setString(1, Id);
//
//			ResultSet rs = ps.executeQuery();
//			if(rs.next()){
//
//			loginUserId = rs.getString("login_id");
//			}
//		}catch (SQLException e) {
//		e.printStackTrace();
//		}
//		return loginUserId;
//	}

	public String userSelect(String loginUserId ){



		String sql = "select * from login_user_transaction where login_id = ? ";

		try(Connection con = db.getConnection()){

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUserId);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){

			this.setLoginUserId(rs.getString("login_id"));
			}
		}catch (SQLException e) {
		e.printStackTrace();
		}
		return this.loginUserId;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

}
