package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;


public class UserListDAO {

	DBConnector db = new DBConnector();



	public List<UserListDTO> listuser(){
		List<UserListDTO> userList = new ArrayList<>();

		String sql = "select * from login_user_transaction";

		try(Connection con = db.getConnection()){

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){

			UserListDTO dto = new UserListDTO();

			dto.setId(rs.getString("id"));
			dto.setLogin_id(rs.getString("login_id"));
			dto.setLogin_pass(rs.getString("login_pass"));
			dto.setUser_name(rs.getString("user_name"));
			dto.setInsert_date(rs.getString("insert_date"));
			dto.setUpdate_date(rs.getString("updated_date"));

			userList.add(dto);

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return userList;

	}


}
