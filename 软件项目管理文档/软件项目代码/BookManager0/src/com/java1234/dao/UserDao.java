package com.java1234.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java1234.model.User;

/**
 * 用户Dao类
 * @author houpu
 *
 */
public class UserDao {
//登入验证
	/*	*/	public int  login(Connection con,User user)throws Exception{
/*	*/	int a = 0;
//		User resultUser = null;
		String sql = "select * from t_user where userName=? and password =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
//			resultUser = new User();
//			resultUser.setId(rs.getInt("id"));
//			resultUser.setUserName(rs.getString("userName"));
//			resultUser.setPassword(rs.getString("password"));
/*	*/		a = 1;
		}
		String sql2 = "select * from t_readuser where userName=? and password =?";
		pstmt = con.prepareStatement(sql2);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		rs = pstmt.executeQuery();
		if(rs.next()) {
//			resultUser = new User();
//			resultUser.setId(rs.getInt("id"));
//			resultUser.setUserName(rs.getString("userName"));
//			resultUser.setPassword(rs.getString("password"));
/*	*/		a = 2;
		}
		return a;
	}
}
