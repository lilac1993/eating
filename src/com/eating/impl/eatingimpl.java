package com.eating.impl;


import com.eating.db.eatingdb;
import com.eating.pojo.order;


public class eatingimpl{
	
	public eatingimpl(){}
	public void login(String or){
		String se="select * from merchant where merchant_number = '"+or+"';";
		String num="select count(*) from order_good where order_goodstype='饮食' and order_goods_orderid=(select order_id from orders where order_merchant="+or+" and order_state='处理中')";
		String ord="select * from orders where order_state='处理中'";
		eatingdb db=new eatingdb();
		db.select(or);
		
		
	}
	
	public void insertorder(order or){
		eatingdb db=new eatingdb();
		order ord=new order();
		String order="insert into order (order_id,order_merchant,order_username,order_phone,order_school,order_dormitory,order_price,order_numberorder_state) value ("+ord.getOrder_id()+","+ord.getOrder_merchant()+","+ord.getOrder_username()+","+ord.getOrder_phone()+","+ord.getOrder_school()+","+ord.getOrder_dormitory()+","+ord.getOrder_price()+","+ord.getOrder_number()+","+ord.getOrder_state()+");";
		
		db.getConnection();
		db.insert(order);
	}

	
	
}
