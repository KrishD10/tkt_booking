package ticket_Booking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ArrayList<User> userList = new ArrayList<>();
    User u=new User("1234554","243543");
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		User u1 = new User("1234", "1234");
		User u2 = new User("9849120719", "1234");
		userList.add(u1);
		userList.add(u2);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String phonenumber = request.getParameter("username");
		String password = request.getParameter("password");
		for (User user : userList) {
			if (user.getPhonenumber().equals(phonenumber)) {
				if (user.getPassword().equals(password)) {
					Cookie c = new Cookie("user", phonenumber);
					response.addCookie(c);
					response.sendRedirect("Dashboard");
				}

			}
			response.getWriter().println("Account Not Present");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
