package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	Patient underTest;
	static final int AMOUNT = 10;

	@Before
	public void setup() {
		underTest = new Patient();
	}

	@Test
	public void shouldLowerBloodLevel() {
		int oldBloodLevel = underTest.getBloodLevel();
		underTest.removeBlood(AMOUNT);
		int newBloodLevel = underTest.getBloodLevel();

		assertThat(newBloodLevel, is(oldBloodLevel - AMOUNT));
	}

}
