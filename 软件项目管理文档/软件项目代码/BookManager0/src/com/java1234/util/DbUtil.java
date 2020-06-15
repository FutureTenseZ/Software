package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库工具类
 * @author houpu
 *
 */
public class DbUtil {
	private String dbUrl = "jdbc:mysql://localhost:3306/db_book?serverTimezone=Asia/Shanghai";
	private String dbUserName = "root";
	private String dbPassword = "623001493";
	private String jdbcName = "com.mysql.cj.jdbc.Driver";
	
	//获取数据库连接
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	//关闭连接
	public void closeCon(Connection con)throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("连接异常");
		}
	}
}
