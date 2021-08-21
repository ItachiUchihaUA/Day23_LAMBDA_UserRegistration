
public class User {
	
	public boolean checkFirstName(String s) {
		return s.matches("[A-Z][a-z]{2,}");
	}

	public boolean checkLastName(String s) {
		return s.matches("[A-Z][a-z]{2,}");
	}
}
