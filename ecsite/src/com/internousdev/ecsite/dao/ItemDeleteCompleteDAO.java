package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemDeleteCompleteDAO {


	DBConnector db = new DBConnector();

	public int deleteItem(){
		String sql = "delete from item_info_transaction";

		int a = 0;

		try(Connection con = db.getConnection()){

			PreparedStatement ps = con.prepareStatement(sql);

			a = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
		e.printStackTrace();
		}
		return a ;
	}

}
