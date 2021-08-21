
public class User {
	
	public boolean checkFirstName(String s) {
		return s.matches("[A-Z][a-z]{2,}");
	}

	public boolean checkLastName(String s) {
		return s.matches("[A-Z][a-z]{2,}");
	}
	
	public boolean checkEmail(String s) {
		return s.matches("[A-Za-z][A-Za-z0-9.-_]*[@][a-z]+[.][a-z]{2,3}.[a-z]{2,3}");
	}
}
