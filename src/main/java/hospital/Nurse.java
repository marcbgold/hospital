package hospital;

public class Nurse extends MedicalStaff {

	protected int numOfPatients;

	public Nurse(String name, String idNumber, int salary, int numOfPatients) {
		super(name, idNumber, salary);
		this.numOfPatients = numOfPatients;
	}

	public int getNumOfPatients() {
		return numOfPatients;
	}

}
