package hospital;

public class Janitor extends Employee {

	protected int salary;
	protected boolean isSweeping;

	public Janitor(String name, String idNumber, int salary) {
		super(name, idNumber);
		this.salary = salary;
	}

	public int calculatePay() {
		return salary;
	}

	public boolean getIsSweeping() {
		return isSweeping;
	}

	@Override
	public String toString() {
		return super.toString() + "\t Is Currently Sweeping: " + this.getIsSweeping();
	}

}
