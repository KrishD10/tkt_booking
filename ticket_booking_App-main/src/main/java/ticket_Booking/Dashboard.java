package ticket_Booking;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ArrayList<Movie> movieList=new ArrayList<>();
    @Override
public void init() throws ServletException {
	Movie m=new Movie("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ_gA25hvAzvrTHQaotqRuOVJqQbWScm5Ig5dF4ctHmnF5bUjPpUFqKTHZRqrm8CwG-98ILbA","RRR","4.5");
	Movie m1=new Movie("https://upload.wikimedia.org/wikipedia/en/1/17/Sarkaru_Vaari_Paata.jpg","sarkararuvari Paata","4.3");
	Movie m2=new Movie("https://assets-in.bmscdn.com/iedb/movies/images/mobile/thumbnail/xlarge/orange-telugu-et00005527-1679575263.jpg","Orange","4.3");
	Movie m3=new Movie("https://upload.wikimedia.org/wikipedia/en/5/56/Jalsa_poster.jpg","Jalsa","4.3");
	Movie m4=new Movie("https://upload.wikimedia.org/wikipedia/en/6/6c/Lucky_Baskhar_film_poster.jpg","Lucky Baskhar","4.3");
	Movie m5=new Movie("https://upload.wikimedia.org/wikipedia/en/d/d6/Sarrainodu_poster.jpg","Sarrainodu","4.3");
	Movie m6=new Movie("https://assets-in.bmscdn.com/iedb/movies/images/mobile/thumbnail/xlarge/gabbar-singh-telugu-et00007159-1665126274.jpg","gabbar singh","4.3");
	Movie m7=new Movie("https://i.pinimg.com/736x/80/3f/cd/803fcd5a217628ddc58845b6bec3732f.jpg","pushpa2","4.5");
	Movie m8=new Movie("https://i.pinimg.com/736x/54/7c/4b/547c4b72edfc36d1d82a31d2365f3c30.jpg","Godavari","4.5");
	Movie m9=new Movie("https://i.pinimg.com/736x/0a/8b/84/0a8b845a6cb428239d764bb248e1b489.jpg","pushpa","4.5");
	Movie m10=new Movie("https://i.pinimg.com/736x/07/77/01/0777016e325b7b183af923a6de3c8ceb.jpg","Game changer","4.5");
	Movie m11=new Movie("https://i.pinimg.com/736x/02/f4/73/02f47390c39da4f2a806ba88bdb4178a.jpg","sankranthi ki vasthunam","4.5");
	movieList.add(m);
	movieList.add(m1);
	movieList.add(m2);
	movieList.add(m3);
	movieList.add(m4);
	movieList.add(m5);
	movieList.add(m6);
	movieList.add(m7);
	movieList.add(m8);
	movieList.add(m9);
	movieList.add(m10);
	movieList.add(m11);
}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isAuthenticated = false;
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("user".equals(cookie.getName())) {
					isAuthenticated = true;
					break;
				}
			}
		}

		if (!isAuthenticated) {
			response.getWriter().println("Not authenticated. Redirecting to login...");
			response.sendRedirect("index.jsp");
			return;
		}
		
		request.setAttribute("movielist", movieList);
		RequestDispatcher rd= request.getRequestDispatcher("/dashboard.jsp");
		rd.forward(request, response);
		
	}

	
	

}
