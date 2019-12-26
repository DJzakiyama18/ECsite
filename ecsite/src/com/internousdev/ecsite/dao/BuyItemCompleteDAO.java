package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemStockDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {
	DBConnector db = new DBConnector();

	public void buyItemInfo(String item_transaction_id, String total_price, String total_count, String user_master_id, String pay)throws SQLException{


		Connection con = db.getConnection();

		DateUtil dateUtil = new DateUtil();


		String sql = "insert into user_buy_item_transaction("
				+ " item_transaction_id, total_price, total_count, user_master_id, pay, insert_date)"
				+ " values(?,?,?,?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, item_transaction_id);

			ps.setString(2, total_price);

			ps.setString(3, total_count);

			ps.setString(4, user_master_id);

			ps.setString(5, pay);

			ps.setString(6, dateUtil.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}

	}

	public void subtractionStock(String count, String id)throws SQLException{

		String sql = "UPDATE item_info_transaction set item_stock = item_stock - ? WHERE id = ?;";
		try(Connection con = db.getConnection()){

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, count);
			ps.setString(2, id);

			ps.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public  BuyItemStockDTO getStock( String id)throws SQLException{
		BuyItemStockDTO stockDTO = new BuyItemStockDTO();

		String sql = "select * from item_info_transaction where id = ?";

		try(Connection con = db.getConnection()){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				stockDTO.setStock(rs.getInt("item_stock"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return stockDTO;
	}

}
