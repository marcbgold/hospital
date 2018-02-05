package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

	private static final String NAME = "name";
	private static final String ID_NUM = "12345";
	private static final int SALARY = 45000;

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Receptionist(NAME, ID_NUM, SALARY);

		int salary = underTest.calculatePay();

		assertThat(salary, is(SALARY));
	}

}
