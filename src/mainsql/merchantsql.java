package mainsql;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.json.*;



public class merchantsql {
	public static final String GBK = "GBK";
	Connection conn=null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/chowhound", "root", "123");
            
		}
		catch(Exception e){
	         e.printStackTrace();
             System.out.println("数据库连接失败"+e.getStackTrace());
		}
		return conn;
	}
	
/*	//字符串转换编码
	public String changeCharset(String str, String newCharset)
	   throws UnsupportedEncodingException {
	  if (str != null) {
	   //用默认字符编码解码字符串。
	   byte[] bs = str.getBytes();
	   //用新的字符编码生成字符串
	   return new String(bs, newCharset);
	  }
	  return null;
	 }
	*/
	
	
	//商家登录验证并提取商家信息
	public String login(String user,String password) throws JSONException{

		String sql = "select id,name,m_head,ranges,school,address,phone,private_name,private_phone,email,status from merchant where username = ? and password = ?;";
	
		JSONStringer J_login = new JSONStringer(); 
		JSONObject js = new JSONObject();
		byte status = 0;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, user);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if(rs.next()){
				status = rs.getByte("status");
				if(status == 1){
					js.put("status", status);//账号是否冻结，冻结为1
					js.put("loginerror", 0);
					J_login.object().key("login").value(js).endObject();
				}else{
					js.put("user", user);
					js.put("id", rs.getString("id"));
					js.put("name", rs.getString("name"));
					js.put("phote", rs.getString("m_head"));
					js.put("range", rs.getString("ranges"));
					js.put("school", rs.getString("school"));
					js.put("address", rs.getString("address"));
					js.put("phone", rs.getString("phone"));
					js.put("private_name", rs.getString("private_name"));
					js.put("private_phone", rs.getString("private_phone"));
					js.put("email", rs.getString("email"));
					js.put("status", status);
					js.put("loginerror", 0);
					J_login.object().key("login").value(js).endObject();
				}
				
			}else{
				js.put("loginerror", 1);//账号密码是否错误，错为1
				js.put("status", status);
				J_login.object().key("login").value(js).endObject();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return J_login.toString();
	}
	
	//商家所对应的排行榜
	public String ranking(String username) throws JSONException{
		String b = "set @y=0;";
		String sql = "select rownum,username from(select (@y:=@y+1) as rownum,username from sale_view) as a where a.rownum=1||a.rownum=2||a.rownum=3;";
		String sqluser = "select rownum,username from(select (@y:=@y+1) as rownum,username from sale_view) as a where a.username='"+username+"';";
		System.out.println(sqluser);
		JSONStringer J_ranking = new JSONStringer(); 
		JSONObject js = new JSONObject();
		String[][] num = new String[3][2];
		String user = null,useruser = null;
		try {
			Connection a = getConnection();
			stmt = a.prepareStatement(b);
			rs = stmt.executeQuery();
			stmt = a.prepareStatement(sql);
			rs = stmt.executeQuery();
			int i = 0;
			while(rs.next()){
				num[i][0] = rs.getString("rownum");
				System.out.println(num[i][0]);
				num[i][1] = rs.getString("username");
				System.out.println(num[i][1]);
				i++;
			}
			rs.close();
			stmt.close();
			a.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection a = getConnection();
			stmt = a.prepareStatement(b);
			rs = stmt.executeQuery();
			stmt = a.prepareStatement(sqluser);
			rs = stmt.executeQuery();
			while(rs.next()){
				user = rs.getString("rownum");
				useruser = rs.getString("username");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.put("frist", num[0][0]);
		js.put("fristuser", num[0][1]);
		js.put("second", num[1][0]);
		js.put("seconduser", num[1][1]);
		js.put("third", num[2][0]);
		js.put("thirduser", num[2][1]);
		js.put("user", user);
		js.put("useruser", useruser);
		J_ranking.object().key("ranking").value(js).endObject();
		System.out.println();
		return J_ranking.toString();
	}
	//讯息栏
	public String xunxi(String user) throws JSONException{
		//公告
		String sql = "select announcement.num,announcement.contacts,announcement.employee,announcement.times from announcement where user = "+user+"||user = 11111111111 order by times desc;";
		JSONStringer xunx = new JSONStringer(); 
		JSONObject js11 = new JSONObject();
		JSONObject js111 = new JSONObject();
		JSONObject js112 = new JSONObject();
		JSONObject js113 = new JSONObject();
		String[][] xun = new String[3][3];
		String[] contact = new String[3];
		try {
			stmt = getConnection().prepareStatement(sql);
			rs = stmt.executeQuery();
			int i = 0;
			while(i<3){
				if(rs.next()){
					xun[i][0] = rs.getString("num");
					xun[i][1] = rs.getString("employee");
					xun[i][2] = rs.getString("times");
					contact[i] = rs.getString("contacts");
					i++;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js111.put("num", xun[0][0]);
		js111.put("employee", xun[0][1]);
		js111.put("times", xun[0][2]);
		js112.put("num", xun[1][0]);
		js112.put("employee", xun[1][1]);
		js112.put("times", xun[1][2]);
		js113.put("num", xun[2][0]);
		js113.put("employee", xun[2][1]);
		js113.put("times", xun[1][2]);
		js11.put("first", js111);
		js11.put("second", js112);
		js11.put("second", js113);
		xunx.object().key("firstxun").value(js11);
		//未处理订单
		String sql21 = "select count(*) from (select * from food_order where food_order.m_username  = '"+user+"' and food_order.state = 'submitted')as a;" ;
		String sql22 = "select count(*) from (select * from entertainment_order where entertainment_order.m_username  = '"+user+"' and entertainment_order.state = 'submitted')as b;" ;
		String sql23 = "select count(*) from (select * from stay_order where stay_order.m_username  = '"+user+"' and stay_order.state = 'submitted')as c;" ;
		int a = 0,b = 0,c = 0;
		System.out.println(sql21);
		try {
			stmt = getConnection().prepareStatement(sql21);
			rs = stmt.executeQuery();
			while(rs.next()){
				a = rs.getInt(1);
			}
			rs.close();
			stmt.close();
			stmt = getConnection().prepareStatement(sql22);
			rs = stmt.executeQuery();
			while(rs.next()){
				b = rs.getInt(1);
			}
			rs.close();
			stmt.close();
			stmt = getConnection().prepareStatement(sql23);
			rs = stmt.executeQuery();
			while(rs.next()){
				c = rs.getInt(1);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int s = a + b + c;
		String second = Integer.toString(s);
		xunx.key("secondxun").value(second);
		System.out.println("123456");
		//最新评论
		String sql3 = "select count(*) from comment where merchant = '"+user+"' and status = 0;";
		
		try {
			stmt = getConnection().prepareStatement(sql3);
			rs = stmt.executeQuery();
			while(rs.next()){
				xunx.key("thirdxun").value(rs.getInt(1)).endObject();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xunx.toString();
	}
	
//	//折线图数据
//	public String chartdata(String user,String first,String last,int a) throws ParseException, JSONException{
//		//在输入参数a前判断a必须大于0
//		JSONStringer J_chart = new JSONStringer(); 
//		JSONObject js11 = new JSONObject();
//		JSONObject js21 = new JSONObject();
//		JSONObject js31 = new JSONObject();
//		JSONObject js41 = new JSONObject();
//		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
//		int day = 0;
//		int num = 0;
//		int lastnum = 0;
//		long from = 0;//开始日期
//		long to = 0;//最后日期
//		String str,str1 = null,str2 = null;
//		try {
//			to = df.parse(last).getTime();
//			from = df.parse(first).getTime();
//			day = (int) ((to - from) / (1000 * 60 * 60 * 24))+1;
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(day);
//		if(a > day){
//			System.out.println("分割的点多于天数");
//		}else{
//			num = day/a; //平均下来每一个点包含的天数
//			lastnum = day%a; //最后一天包含的天数
//			java.util.Date dt = df.parse(first);
//			java.util.Date dt1 = df.parse(first);
//			java.util.Date dt2 = df.parse(last);
//			
//			//美食
//			double[] foodnum = new double[num+1]; 
//			double foodlast = 0;
//			try {
//				for(int i = 0;i < a;i++){
//					int day1 = dt.getDate()+num*i;
//					int day2 = dt.getDate()+num*(i+1);
//					dt.setDate(day1);
//					dt1.setDate(day2);
//					str=df.format(dt);
//					str1=df.format(dt1);
//					str2=df.format(dt2);
//					String sql1 = "select sum(total) from fooddata where m_username = "+user+" and order_time between "+str+" and "+str1+";";
//					System.out.println("food:"+sql1);
//					stmt = getConnection().prepareStatement(sql1);
//					rs = stmt.executeQuery();
//					while(rs.next()){
//						foodnum[i] = rs.getFloat(1);
//						System.out.println("jieguo"+foodnum[i]);
//					}
//					
//				}
//				
//				if(lastnum != 0){
//					String sql1 = "select sum(total) from fooddata where m_username = "+user+" and order_time between "+str2+" and "+str1+";";
//					stmt = getConnection().prepareStatement(sql1);
//					rs = stmt.executeQuery();
//					while(rs.next()){
//						foodlast = rs.getFloat(1);
//					}
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			//娱乐
//			double[] entertainmentnum = new double[num+1]; 
//			double entertainmentlast = 0;
//			try {
//				for(int i = 0;i < a;i++){
//					int day1 = dt.getDate()+num*i;
//					int day2 = dt.getDate()+num*(i+1);
//					dt.setDate(day1);
//					dt1.setDate(day2);
//					str=df.format(dt);
//					str1=df.format(dt1);
//					str2=df.format(dt2);
//					String sql1 = "select sum(total) from entertainmentdata where M_username = "+user+" and order_time between "+str+" and "+str1+";";
//					System.out.println("娱乐"+sql1);
//					stmt = getConnection().prepareStatement(sql1);
//					rs = stmt.executeQuery();
//					while(rs.next()){
//						entertainmentnum[i] = rs.getFloat(1);
//					}
//					
//				}
//				if(lastnum != 0){
//					String sql1 = "select sum(total) from entertainmentdata where M_username = "+user+" and order_time between "+str2+" and "+str1+";";
//					stmt = getConnection().prepareStatement(sql1);
//					rs = stmt.executeQuery();
//					while(rs.next()){
//						entertainmentlast = rs.getFloat(1);
//					}
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			//住宿
//			double[] staynum = new double[num+1]; 
//			double staylast = 0;
//			System.out.println(num);
//			try {
//				for(int i = 0;i < a;i++){
//					int day1 = dt.getDate()+num*i;
//					int day2 = dt.getDate()+num*(i+1);
//					dt.setDate(day1);
//					dt1.setDate(day2);
//					str=df.format(dt);
//					str1=df.format(dt1);
//					str2=df.format(dt2);
//					String sql1 = "select sum(total) from staydata where M_username = "+user+" and order_time between "+str+" and "+str1+";";
//					System.out.println("stay"+sql1);
//					stmt = getConnection().prepareStatement(sql1);
//					rs = stmt.executeQuery();
//					while(rs.next()){
//						staynum[i] = rs.getFloat(1);
//					}
//					
//				}
//				System.out.println("n::"+dt1+":"+dt2);
//				String sql1 = "select sum(total) from staydata where M_username = "+user+" and order_time between "+str2+" and "+str1+";";
//				stmt = getConnection().prepareStatement(sql1);
//				rs = stmt.executeQuery();
//				while(rs.next()){
//					staylast = rs.getFloat(1);
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			System.out.println("a:"+a);
//			//全部
//			double[] sum = new double[num-1];
//			double sumlast;
//			for(int i = 0;i < a;i++){
//				System.out.println("i:"+i);
//				sum[i] = foodnum[i] + entertainmentnum[i] + staynum[i]; 
//				System.out.println("总数"+sum[i]);
//			}
//			sumlast = foodlast + entertainmentlast + staylast;
//			
//			
//			
//			
//			for(int i = 0;i < a;i++){
//				String key = Integer.toString(i+1);
//				System.out.println("key:"+key);
//				js11.put(key, foodnum[i]);
//				js21.put(key, entertainmentnum[i]);
//				js31.put(key, staynum[i]);
//				js41.put(key, sum[i]);
//			}
//			String key = Integer.toString(a+1);
//			js11.put(key, foodlast);
//			js21.put(key, entertainmentlast);
//			js31.put(key, staylast);
//			js41.put(key, sumlast);
//			
//			J_chart.object().key("food").value(js11).key("entertainment").value(js21).key("stay").value(js31).key("sum").value(js41).endObject();
//		}
//		return J_chart.toString();
//	}
	//未审核订单
	public String nufinishorder(String user) throws JSONException{
		String sql1 = "select * from food_order where food_order.m_username  = '"+user+"' and food_order.state = 'submitted';";
		String sql2 = "select * from entertainment_order where entertainment_order.m_username  = '"+user+"' and entertainment_order.state = 'submitted';";
		String sql3 = "select * from stay_order where stay_order.m_username  = '"+user+"' and stay_order.state = 'submitted';";
		JSONStringer nufinish = new JSONStringer(); 
		JSONObject js1 = new JSONObject();
		JSONObject js11 = new JSONObject();
		JSONObject js2 = new JSONObject();
		JSONObject js21 = new JSONObject();
		JSONObject js3 = new JSONObject();
		JSONObject js31 = new JSONObject();
		try {
			stmt = getConnection().prepareStatement(sql1);
			rs = stmt.executeQuery();
			int i = 1;
			List<String> goods = new ArrayList(); 
			while(rs.next()){
				String num = "num" + Integer.toString(i);
				js1.put(num, rs.getString("Order_num"));
				goods.add(rs.getString("Order_num"));
				String useru = "user" + Integer.toString(i);
				js1.put(useru, rs.getString("U_user"));
				String phone = "phone" + Integer.toString(i);
				js1.put(phone, rs.getString("U_phone"));
				String address = "phone" + Integer.toString(i);
				js1.put(address, rs.getString("U_address"));
				String total = "total" + Integer.toString(i);
				js1.put(total, rs.getString("total"));
				String payment = "payment" + Integer.toString(i);
				js1.put(payment, rs.getString("payment"));
				String times = "times" + Integer.toString(i);
				js1.put(times, rs.getString("Order_time"));
			}
			rs.close();
			stmt.close();
			for(int j = 0; j < goods.size(); j++){
				String sql11 = "select id,num,price from order_foods where order_num = '"+goods.get(j)+"';";
				System.out.println(sql11);
				stmt = getConnection().prepareStatement(sql1);
				rs = stmt.executeQuery();
				while(rs.next()){
					String id = "id"+Integer.toString(j);
					js11.put(id, rs.getString(1));
					String num = "num"+Integer.toBinaryString(j);
					js11.put(num, rs.getString(2));
					String price = "price"+Integer.toBinaryString(j);
					js11.put(price, rs.getString(3));
				}
			}
			js1.put("goods",js11);
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt = getConnection().prepareStatement(sql2);
			rs = stmt.executeQuery();
			int i = 1;
			List<String> goods = new ArrayList(); 
			while(rs.next()){
				String num = "num" + Integer.toString(i);
				js2.put(num, rs.getString("En_num"));
				goods.add(rs.getString("En_num"));
				String useru = "user" + Integer.toString(i);
				js2.put(useru, rs.getString("U_user"));
				String total = "total" + Integer.toString(i);
				js2.put(total, rs.getString("total"));
				String contacts_name = "ontacts_name" + Integer.toString(i);
				js2.put(contacts_name, rs.getString("Contacts_name"));
				String contacts_phone = "Contacts_phone" + Integer.toString(i);
				js2.put(contacts_phone, rs.getString("Contacts_phone"));
				String state = "state"+Integer.toString(i);
				js2.put(state, rs.getString("state"));
				String payment = "payment"+Integer.toString(i);
				js2.put(payment, rs.getString("U_payment"));
				String times = "times" + Integer.toString(i);
				js2.put(times, rs.getString("Order_time"));
			}
			rs.close();
			stmt.close();
			for(int j = 0; j < goods.size(); j++){
				String sql21 = "select id,num,price from order_foods where order_num = '"+goods.get(j)+"';";
				stmt = getConnection().prepareStatement(sql1);
				rs = stmt.executeQuery();
				while(rs.next()){
					String id = "id"+Integer.toString(j);
					js21.put(id, rs.getString("id"));
					String num = "num"+Integer.toBinaryString(j);
					js21.put(num, rs.getString("num"));
					String price = "price"+Integer.toBinaryString(j);
					js21.put(price, rs.getString("price"));
				}
			}
			js2.put("goods",js21);
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt = getConnection().prepareStatement(sql3);
			rs = stmt.executeQuery();
			int i = 1;
			List<String> goods = new ArrayList(); 
			while(rs.next()){
				String num = "num" + Integer.toString(i);
				js3.put(num, rs.getString("Stay_num"));
				goods.add(rs.getString("En_num"));
				String useru = "user" + Integer.toString(i);
				js3.put(useru, rs.getString("U_user"));
				String total = "total" + Integer.toString(i);
				js3.put(total, rs.getString("total"));
				String contacts_name = "ontacts_name" + Integer.toString(i);
				js3.put(contacts_name, rs.getString("Contacts_name"));
				String contacts_phone = "Contacts_phone" + Integer.toString(i);
				js3.put(contacts_phone, rs.getString("Contacts_phone"));
				String state = "state"+Integer.toString(i);
				js3.put(state, rs.getString("state"));
				String payment = "payment"+Integer.toString(i);
				js3.put(payment, rs.getString("payment"));
				String times = "times" + Integer.toString(i);
				js3.put(times, rs.getString("Order_time"));
			}
			rs.close();
			stmt.close();
			for(int j = 0; j < goods.size(); j++){
				String sql31 = "select id,num,price from order_foods where order_num = '"+goods.get(j)+"';";
				stmt = getConnection().prepareStatement(sql1);
				rs = stmt.executeQuery();
				while(rs.next()){
					String id = "id"+Integer.toString(j);
					js31.put(id, rs.getString("id"));
					String num = "num"+Integer.toBinaryString(j);
					js31.put(num, rs.getString("num"));
					String price = "price"+Integer.toBinaryString(j);
					js31.put(price, rs.getString("price"));
				}
			}
			js3.put("goods",js31);
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nufinish.object().key("f_order").value(js1).key("e_order").value(js2).key("s_order").value(js3).endObject();
		return nufinish.toString();
	}
	//添加新商品
	public void insertfood(String username,String userid,String name,int status,double price,String remarkt){
		String f = "select count(*) from food where M_username='"+username+"';";
		String e = "select count(*) from entertainment  where M_username='"+username+"';";
		String s = "select count(*) from stay where M_username='"+username+"';";
		int fnum = 0,ennum = 0,snum = 0,sum = 0;
		try {
			stmt = getConnection().prepareStatement(f);
			rs = stmt.executeQuery();
			while(rs.next()){
				fnum = rs.getInt(1);
			}
			stmt = getConnection().prepareStatement(e);
			rs = stmt.executeQuery();
			while(rs.next()){
				ennum = rs.getInt(1);
			}
			stmt = getConnection().prepareStatement(s);
			rs = stmt.executeQuery();
			while(rs.next()){
				snum = rs.getInt(1);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sum = fnum + ennum + snum + 1;
		String i = String.format("%05d",sum);
		String id = userid+i;
		String sql = "insert into food values('"+username+"','"+id+"','"+name+"',"+status+","+price+",'"+remarkt+"',0,0,0,now(),now());";
		System.out.println(sql);
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	//添加商品照片
	public void goodsphoto(){
		
	}
	//删除原有商家图片
	public void changephoto(String name){
		File f = new File("E:\\"+name); 
		System.out.println("要删除文件的绝对路径是："+f.getAbsolutePath()); 
		if (f.exists()) 
			f.delete(); 
		else 
			System.out.println("file is not exist!");
	}
	//商家修改商家资料
	public void updatemerchant(int id, String photo, String name, String phone, String email){
		if(photo != ""){
			//删除原有图片
			String idname = id + ".jpg";
			changephoto(idname);
			//修改数据库存储的图片路经
			String sql1 = "update merchant set M_head='"+photo+"' where id="+id+";";
			try {
				stmt = getConnection().prepareStatement(sql1);
				stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sql2 = "update merchant set Name='"+name+"',Phone='"+phone+"',Email='"+email+"' where id="+id+";";
			try {
				stmt = getConnection().prepareStatement(sql2);
				stmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//
	
}