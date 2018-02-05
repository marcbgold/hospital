package hospital;

public class EmergencyDispatcher extends MedicalStaff {

	protected boolean isOnPhone;

	protected EmergencyDispatcher(String name, String idNumber, int salary) {
		super(name, idNumber, salary);
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

}
