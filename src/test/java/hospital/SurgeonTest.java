package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	private static final String NAME = "name";
	private static final String ID_NUM = "12345";
	private static final int SALARY = 120000;
	private static final String SPECIALTY = "heart";

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shouldDrawBloodFromDouble() {
		BloodDrawer underTest = new Surgeon(NAME, ID_NUM, SALARY, SPECIALTY);
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		assertThat(wasBled, is(true));
	}

	boolean wasCaredFor = false;

	public class TreatableDouble implements Treatable {
		@Override
		public void raiseHealthLevel(int amount) {
			wasCaredFor = true;
		}
	}

	@Test
	public void shouldCareForDouble() {
		MedicalDuties underTest = new Surgeon(NAME, ID_NUM, SALARY, SPECIALTY);
		Treatable patient = new TreatableDouble();

		underTest.careForPatient(patient);

		assertThat(wasCaredFor, is(true));
	}

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Surgeon(NAME, ID_NUM, SALARY, SPECIALTY);

		int salary = underTest.calculatePay();

		assertThat(salary, is(SALARY));
	}

}
