package hospital;

public class Receptionist extends Employee {

	protected boolean isOnPhone;

	public Receptionist(String name, String idNumber, int salary) {
		super(name, idNumber, salary);
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

}
