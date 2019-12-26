package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserSingleDeleteDAO {
   DBConnector db = new DBConnector();

   public int userSingleDelete(String id){
	   int rs = 0;
	   String sql = "delete from login_user_transaction where id = ?";

	   try(Connection con = db.getConnection()){
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, id);

			rs = ps.executeUpdate();
		}catch ( SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
   }

