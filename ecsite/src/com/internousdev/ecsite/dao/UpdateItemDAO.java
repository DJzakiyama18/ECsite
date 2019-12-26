package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UpdateItemDAO {

	DBConnector db = new DBConnector();

	DateUtil date = new DateUtil();

	public int itemAllUpdate(String item_name, String item_price, String item_stock, String id) throws SQLException{
		int res = 0;
		if(!(item_name.equals("")) && !(item_price.equals("")) && !(item_stock.equals(""))){
			String sql = "update item_info_transaction set item_name = ? ,item_price = ? ,item_stock = ?  ,update_date = ? where id = ?";

			try(Connection con = db.getConnection()){
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, item_name);
				ps.setString(2, item_price);
				ps.setString(3, item_stock);
				ps.setString(4, date.getDate());
				ps.setString(5, id);

				res = ps.executeUpdate();
			}
		}if(!(item_name.equals(""))){
			String sql = "update item_info_transaction set item_name = ? , update_date = ? where id = ?";

					try(Connection con = db.getConnection()){
						PreparedStatement ps = con.prepareStatement(sql);

						ps.setString(1, item_name);
						ps.setString(2, date.getDate());
						ps.setString(3, id);

						res = ps.executeUpdate();
		   }
	    }if(!(item_price.equals(""))){
	    	String sql = "update item_info_transaction set item_price = ? , update_date = ? where id = ?";

	    			try(Connection con = db.getConnection()){
	    				PreparedStatement ps = con.prepareStatement(sql);

	    				ps.setString(1, item_price);
	    				ps.setString(2, date.getDate());
	    				ps.setString(3, id);

	    				res = ps.executeUpdate();
	    			}
	    }if(!(item_stock.equals(""))){
	    	String sql = "update item_info_transaction set item_stock = ? , update_date = ? where id = ?";

			try(Connection con = db.getConnection()){
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, item_stock);
				ps.setString(2, date.getDate());
				ps.setString(3, id);

				res = ps.executeUpdate();
			}
}
		return res;
	}
}
//	public int itemNmaeUpdate(String item_name, String id) throws SQLException{
//		int res = 0;
//		String sql = "update item_info_transaction set item_name = ? , update_date = ? where id = ?";
//
//		try(Connection con = db.getConnection()){
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setString(1, item_name);
//			ps.setString(2, date.getDate());
//			ps.setString(3, id);
//
//			res = ps.executeUpdate();
//		}
//		return res;
//	}
//
//	public int itemPriceUpdate(String item_price, String id) throws SQLException{
//		int res = 0;
//		String sql = "update item_info_transaction set item_price = ? , update_date = ? where id = ?";
//
//		try(Connection con = db.getConnection()){
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setString(1, item_price);
//			ps.setString(2, date.getDate());
//			ps.setString(3, id);
//
//			res = ps.executeUpdate();
//		}
//		return res;
//	}
