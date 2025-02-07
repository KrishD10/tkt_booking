<%@ page import="java.util.ArrayList" %>
<%@ page import="ticket_Booking.Movie" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>Homepage</title>
    <link rel="stylesheet" href="styles/dashboard.css">  
</head>

<body>
    <header id="main-header">
        <img src="" alt="Logo">
        
      <div class="search-box">
        <input type="text" placeholder="Search movies">
        <input type="text" placeholder="Search theatres">
      </div>
        
        <button>Profile</button>
    </header>
    <main id="main-body">
        <section id="main-container">
            <h1>Movies</h1>
            
            <div class="card-container">
            <%
            ArrayList<Movie>movieList=(ArrayList<Movie>) request.getAttribute("movielist");
            if(movieList!=null){
            	for(Movie movie:movieList){
        %>
               <div class="box">
                    <img src="<%=movie.getMovieUrl() %>">
                    <h4><%= movie.getMovieName() %></h4>
                    <h4> rating:<%=movie.getMovieRating() %></h4>
                </div>
                 <% 
            	}
            }
                %>
            </div>
        </section>
    </main>
</body>

</html>