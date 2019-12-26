package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;



public class UserListDeleteCompleteDAO {

	DBConnector db = new DBConnector();

	public int deleteUserList(){

		String sql = "delete  from login_user_transaction";

		int result = 0;
		try(Connection con = db.getConnection()){

			PreparedStatement ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	public int deleteNotMasterUserList(){

		String sql = "delete  from login_user_transaction where not id like '1' ";

		int result = 0;
		try(Connection con = db.getConnection()){

			PreparedStatement ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
