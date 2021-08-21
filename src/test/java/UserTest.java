import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest{
	User u = new User();
		@Test
		public void firstNameIsValid() {
			assertTrue(u.checkFirstName("Ujjwal"));
		}
		@Test
		public void firstNameIsInvalidByLength() {
			assertFalse(u.checkFirstName("Uj"));
		}
		@Test
		public void firstNameIsInvalidWithNumber() {
			assertFalse(u.checkFirstName("Ujjwal23"));
		}
		@Test
		public void firstNameIsInvalidWithNoCaptialFirstLetter() {
			assertFalse(u.checkFirstName("ujjwal"));
		}
		@Test
		public void lastNameIsValid() {
			assertTrue(u.checkLastName("Ujjwal"));
		}
		@Test
		public void lastNameIsInvalidByLength() {
			assertFalse(u.checkLastName("Uj"));
		}
		@Test
		public void lastNameIsInvalidWithNumber() {
			assertFalse(u.checkLastName("Ujjwal23"));
		}
		@Test
		public void lastNameIsInvalidWithNoCaptialLastLetter() {
			assertFalse(u.checkLastName("ujjwal"));
		}
		
		@Test
		public void phoneNumberIsValid() {
			assertTrue(u.checkPhone("91 9562095622"));
		}
		@Test
		public void phoneNumberIsInvalidWithNoSpace() {
			assertFalse(u.checkPhone("919562095622"));
		}
		@Test
		public void phoneNumberIsInvalidWithNoCode() {
			assertFalse(u.checkPhone("9562095622"));
		}
		@Test
		public void phoneNumberIsInvalidWithMoreDigit() {
			assertFalse(u.checkPhone("95 63452093453455"));
		}
		@Test
		public void passwordIsValid() {
			assertTrue(u.checkPassword("NoOneCares@123"));
		}
		@Test
		public void passwordIsInvalidWithNoNumber() {
			assertFalse(u.checkPassword("NoOneCares@"));
		}
		@Test
		public void passwordIsInvalidWithNoUpperCase() {
			assertFalse(u.checkPassword("noonecares@123"));
		}
		@Test
		public void passwordIsInvalidWithNoLowerCase() {
			assertFalse(u.checkPassword("NOONE@123"));
		}
		@Test
		public void passwordIsInvalidWithSpecialChar() {
			assertFalse(u.checkPassword("NoOneCaresBro123"));
		}
		
}
