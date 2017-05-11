import java.util.ArrayList;

public class Account 
{
	private String userID;
	private String email;
	private String password;
	ArrayList<Object> arrayAccounts = new ArrayList<Object>();
	
	public ArrayList<Object> getArrayAccounts()
	{
		return arrayAccounts;
	}
	public void addAccount(String User, String Email, String Password)
	{
		setUserID(User);
		setEmail(Email);
		setPassword(Password);
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
