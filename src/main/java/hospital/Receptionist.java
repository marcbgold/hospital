package hospital;

public class Receptionist extends Employee {

	protected int salary;
	protected boolean isOnPhone;

	public Receptionist(String name, String idNumber, int salary) {
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
	public String toString() {
		return super.toString() + "\t Is Currently On Phone: " + this.getIsOnPhone();
	}

}
