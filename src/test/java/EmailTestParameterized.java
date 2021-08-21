import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailTestParameterized {
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"ujjwal.aakash@gao.co.in",true},{"@co.in",false},{".asd@in",false},{"ujjwal.co.in",false},{"Ujjwal,@gaim.com",false}
		});
	}
	
	String input;
	boolean output;
	User u = new User();
	
	public EmailTestParameterized(String input, Boolean output) {
		this.input = input;
		this.output = output;
	}
	
	@Test
	public void multipleEmailTest() {
		assertEquals(output, u.checkEmail(input));
		
	}
}
