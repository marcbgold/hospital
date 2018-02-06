package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VampireJanitorTest {

	private static final String NAME = "name";
	private static final String ID_NUM = "12345";
	private static final int SALARY = 40000;

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new VampireJanitor(NAME, ID_NUM, SALARY);

		int salary = underTest.calculatePay();

		assertThat(salary, is(SALARY));
	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shouldDrawBloodFromDouble() {
		BloodDrawer underTest = new VampireJanitor(NAME, ID_NUM, SALARY);
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		assertThat(wasBled, is(true));
	}

}
