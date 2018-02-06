package hospital;

public class Nurse extends MedicalStaff {

	protected int salary;
	protected int numOfPatients;
	protected static final int NURSE_HEAL_AMOUNT = 5;

	public Nurse(String name, String idNumber, int salary, int numOfPatients) {
		super(name, idNumber);
		this.salary = salary;
		this.numOfPatients = numOfPatients;
	}

	public int calculatePay() {
		return salary;
	}

	public int getNumOfPatients() {
		return numOfPatients;
	}

	@Override
	public void careForPatient(Treatable patient) {
		patient.raiseHealthLevel(NURSE_HEAL_AMOUNT);
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\t ID: " + this.getIDNumber() + "\t # of Patients: " + this.getNumOfPatients();
	}
}
