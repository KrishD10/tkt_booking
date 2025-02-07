package ticket_Booking;

public class Movie {
    private String movieUrl;
    private String movieName;
    private String movieRating;

    public Movie( String movieUrl, String movieName, String movieRating) {
        this.movieUrl=movieUrl;
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }
}
