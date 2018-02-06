package hospital;

public class Doctor extends MedicalStaff {

	protected int salary;
	protected String specialty;
	protected static final int DOCTOR_HEAL_AMOUNT = 10;

	public Doctor(String name, String idNumber, int salary, String specialty) {
		super(name, idNumber);
		this.salary = salary;
		this.specialty = specialty;
	}

	public int calculatePay() {
		return salary;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public void careForPatient(Treatable patient) {
		patient.raiseHealthLevel(DOCTOR_HEAL_AMOUNT);
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\t ID: " + this.getIDNumber() + "\t Specialty: " + this.getSpecialty();
	}
}
