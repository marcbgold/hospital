package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {

	private static final String NAME = "name";
	private static final String ID_NUM = "12345";
	private static final int SALARY = 40000;

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Janitor(NAME, ID_NUM, SALARY);

		int salary = underTest.calculatePay();

		assertThat(salary, is(SALARY));
	}

}
