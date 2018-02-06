package hospital;

public abstract class MedicalStaff extends Employee implements MedicalDuties {

	protected MedicalStaff(String name, String idNumber) {
		super(name, idNumber);
	}

}
