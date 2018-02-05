package hospital;

public abstract class MedicalStaff extends Employee implements PatientTreater {

	protected MedicalStaff(String name, String idNumber, int salary) {
		super(name, idNumber, salary);
	}

}
