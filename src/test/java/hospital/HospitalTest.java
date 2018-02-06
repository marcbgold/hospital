package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	private static final String NAME = "name";
	private static final String ID_NUM = "12345";
	private static final int SALARY = 40000;
	Hospital underTest = new Hospital();
	Employee employee;

	@Before
	public void setup() {
		employee = new Janitor(NAME, ID_NUM, SALARY);
		underTest.addEmployee(employee);
	}

	@Test
	public void shouldAddTwoEmployees() {
		employee = new Doctor(NAME, "11111", SALARY, "heart");
		underTest.addEmployee(employee);
		assertThat(underTest.getRosterSize(), is(2));
	}

	@Test
	public void shouldRemoveEmployee() {
		underTest.removeEmployee(ID_NUM);

		assertThat(underTest.getRosterSize(), is(0));
	}

	@Test
	public void shouldCheckForEmployeeByName() {
		boolean check = underTest.checkForEmployeeByName(NAME);

		assertThat(check, is(true));
	}

	@Test
	public void shouldFindEmployeeByName() {
		Employee check = underTest.findEmployeeByName(NAME);

		assertThat(check.getName(), is(NAME));
	}

}
