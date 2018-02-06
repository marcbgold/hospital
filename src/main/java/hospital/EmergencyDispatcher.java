package hospital;

public class EmergencyDispatcher extends MedicalStaff {

	protected int salary;
	protected boolean isOnPhone;
	protected static final int DISPATCHER_HEAL_AMOUNT = 5;

	protected EmergencyDispatcher(String name, String idNumber, int salary) {
		super(name, idNumber);
		this.salary = salary;
	}

	public int calculatePay() {
		return salary;
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

	@Override
	public void careForPatient(Treatable patient) {
		patient.raiseHealthLevel(DISPATCHER_HEAL_AMOUNT);
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\t ID: " + this.getIDNumber() + "\t Is Currently On Phone: " + this.getIsOnPhone();
	}
}
