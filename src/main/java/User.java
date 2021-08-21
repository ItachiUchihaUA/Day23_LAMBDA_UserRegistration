import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		User u = new User();
		u.getFirstName();
		u.getLastName();
		u.getEmail();
		u.getPhoneNumber();
		u.getPassword();
	}

	public void getFirstName() {
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		Valid firstLam = (s) -> s.matches("[A-Z][a-z]{2,}");
		try {
			if (!firstLam.check(firstName)) {
				throw new InvalidInput();
			}
		} catch (InvalidInput e) {
			System.err.println(e.getMessage());
		}
	}
	

	public void getLastName() {
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		Valid lastLam = (s) -> s.matches("[A-Z][a-z]{2,}");
		try {
			if(!lastLam.check(lastName)) {
				throw new InvalidInput();
			}
		} catch (InvalidInput e) {
			System.err.println(e.getMessage());
		}
	}

	public void getEmail() {
		System.out.println("Enter Email: ");
		String email = sc.next();
		Valid emailLam = (s) -> s.matches("[A-Za-z][A-Za-z0-9.-_]*[@][a-z]+[.][a-z]{2,3}.[a-z]{2,3}");
		try {
			if (!emailLam.check(email)) {
				throw new InvalidInput();
			}
		} catch (InvalidInput e) {
			System.err.println(e.getMessage());
		}
	}

	public void getPhoneNumber() {
		System.out.println("Enter Phone Number: ");
		String phone = sc.next();
		Valid phoneLam = (s) -> s.matches("[0-9]{2,3}[ ][0-9]{10}");
		try {
			if (!phoneLam.check(phone)) {
				throw new InvalidInput();
			}
		} catch (InvalidInput e) {
			System.err.println(e.getMessage());
		}
	}

	public void getPassword() {
		System.out.println("Enter Password: ");
		String password = sc.next();
		Valid passwordLam = (s) -> s.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}");
		try {
			if (!passwordLam.check(password)) {
				throw new InvalidInput();
			}
		} catch (InvalidInput e) {
			System.err.println(e.getMessage());
		}
	}

	public boolean checkFirstName(String s) {
		return s.matches("[A-Z][a-z]{2,}");
	}
	

	public boolean checkLastName(String s) {
		return s.matches("[A-Z][a-z]{2,}");
	}

	public boolean checkEmail(String s) {
		return s.matches("[A-Za-z][A-Za-z0-9.-_]*[@][a-z]+[.][a-z]{2,3}.[a-z]{2,3}");
	}

	public boolean checkPhone(String s) {
		return s.matches("[0-9]{2,3}[ ][0-9]{10}");
	}

	public boolean checkPassword(String s) {
		return s.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}");
	}
}

class InvalidInput extends Exception {
	@Override
	public String getMessage() {
		return ("Invalid Input");
	}
}
