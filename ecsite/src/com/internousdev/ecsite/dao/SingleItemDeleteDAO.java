package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class SingleItemDeleteDAO {

	DBConnector db = new DBConnector();

	public int singleDelete(String id){
		int rs = 0;
		String sql = "delete from item_info_transaction where id = ?";

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
