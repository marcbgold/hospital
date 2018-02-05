package hospital;

public class Doctor extends MedicalStaff {

	protected String specialty;

	public Doctor(String name, String idNumber, int salary, String specialty) {
		super(name, idNumber, salary);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

}
