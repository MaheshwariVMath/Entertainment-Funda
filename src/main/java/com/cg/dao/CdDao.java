package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cg.dto.CD;
import com.cg.util.DBUtil;

public class CdDao {
	public boolean addCD(CD cd) {
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("Insert into CDDetails Values(?,?,?,?,?)");
			ps.setInt(1, cd.getId());
			ps.setString(2,	cd.getName());
			ps.setString(3,	cd.getDate());
			ps.setInt(4,cd.getYear());
			ps.setDouble(5, cd.getPrice());
			
			int rowsAffected=ps.executeUpdate();
			return rowsAffected==1;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
