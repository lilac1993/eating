package com.eating.db;

import java.sql.*;

import com.eating.pojo.merchant;
import com.eating.pojo.number;
import com.eating.pojo.order;
import com.eating.pojo.users;


public class eatingdb {
	
	public PreparedStatement pre = null;
	static Connection con=null;
	
	
	
	
	/*
	 * 跟数据库获得连接
	 */
	public Connection getConnection(){
		
		System.out.println("数据库连接1");
		try{
			System.out.println("数据库连接32");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库连接a");
			con = (Connection) DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/chowhound", "root", "root");
            System.out.println("数据库连接2");
            
		}
		catch(Exception e){
	         e.printStackTrace();
             System.out.println("数据库连接失败"+e.getStackTrace());
		}
		return con;
	}
	/*
	 * 操作数据库
	 */
	public void insert(String insert){
		
		try {
			pre = (PreparedStatement) getConnection().prepareStatement(insert);
			pre.close();
			System.out.println(" 成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("失败！"+e.getStackTrace());
		}		
	}
	/*
	 * 商家信息提取数据
	 */
	public void select(String sele){
			merchant mer = new merchant();
			try {
				Statement stmt = getConnection().createStatement();
				ResultSet rs = stmt.executeQuery(sele);
		        while(rs.next()){
					
					mer.setMerchant_number(rs.getString(1));
					mer.setMerchant_password(rs.getString(2));
					mer.setMerchant_name(rs.getString(3));
					mer.setMerchant_phone(rs.getString(4));
					mer.setMerchant_address(rs.getString(5));
					mer.setMerchant_email(rs.getString(6));
					mer.setMerchant_store(rs.getString(7));
					mer.setMerchant_school(rs.getString(8));
		        }
				System.out.println(" 成功！");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("失败！"+e.getStackTrace());
			}		
		}
	public void count(String sele){
		number num = new number();
		try {
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sele);
	        num.setFood(rs.getInt(1));
			System.out.println(" 成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("失败！"+e.getStackTrace());
		}	
		
	}
	public void select_order(String sele){
		order ord = new order();
		try {
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sele);
	        while(rs.next()){
				
				
	        }
			System.out.println(" 成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("失败！"+e.getStackTrace());
		}		
	}
}
