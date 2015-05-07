package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainsql.merchantsql;

import sun.security.util.Password;
import org.json.*;

public class chowhoundservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public chowhoundservlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		String user = request.getParameter("name");
		System.out.println(user);
		String psd = request.getParameter("password");
		merchantsql mer = new merchantsql();
		if("login".equals(action)){
			try {
				String login = mer.login(user,psd);
				System.out.println(login);
				request.setAttribute("merchant", login);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			request.getRequestDispatcher("/jsp/loginl.html").forward(request,response);
		}
	}
	
	public void init() throws ServletException {
		// Put your code here
	}

}
