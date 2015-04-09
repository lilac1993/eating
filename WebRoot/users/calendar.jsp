<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'calendar.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
	      GregorianCalendar d = new GregorianCalendar();
			int today = d.get(Calendar.DAY_OF_MONTH);
			int month = d.get(Calendar.MONTH);
			
			d.set(Calendar.DAY_OF_MONTH,1);
			
			int weekday = d.get(Calendar.DAY_OF_WEEK);
			int firstdayofweek = d.getFirstDayOfWeek();
			
			int indent = 0;
			while(weekday !=firstdayofweek)
			{
			
				
				indent++;
				d.add(Calendar.DAY_OF_MONTH, -1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
				
			}
			
			String[] weekdayNames = {"日","一","二","三","四","五","六"};
			%>
			<%=weekdayNames[0] %>&nbsp;&nbsp;<%=weekdayNames[1] %>&nbsp;&nbsp;&nbsp;<%=weekdayNames[2] %>&nbsp;&nbsp;&nbsp;<%=weekdayNames[3] %>&nbsp;&nbsp;&nbsp;<%=weekdayNames[4] %>&nbsp;&nbsp;&nbsp;<%=weekdayNames[5] %>&nbsp;&nbsp;&nbsp;<%=weekdayNames[6] %>
			<%
			
			do{
			
				
				d.add(Calendar.DAY_OF_MONTH,1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
			}
			while(weekday != firstdayofweek);
			%>
			<br>
			<%
			for(int i = 1; i<= indent; i++)
			%>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<%
			
			d.set(Calendar.DAY_OF_MONTH, 1);
			do{
				int day = d.get(Calendar.DAY_OF_MONTH);
			%>
			<%=day %>
			<%
				
				
				if(day ==today)
				{	
			
					String aa="*";
			%>
			<%=aa %>&nbsp;&nbsp;
			<%
				}
				else {
			%>
				&nbsp;
			<%
				}
				
				d.add(Calendar.DAY_OF_MONTH,1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
				
				if(weekday == firstdayofweek){
			%>
				<br/>
			<%
					}
			}
			while(d.get(Calendar.MONTH) == month);
			
			if(weekday !=firstdayofweek){
			%>
				<br>
			<%
				}
	      	%>
  </body>
</html>
