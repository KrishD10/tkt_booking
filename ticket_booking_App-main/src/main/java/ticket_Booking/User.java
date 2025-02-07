package ticket_Booking;

public class User {
    String phonenumber;
    String password;
	public User(String phonenumber, String password) {
		super();
		this.phonenumber = phonenumber;
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
