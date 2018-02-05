package hospital;

public abstract class Employee {

	protected String name;
	protected String idNumber;
	protected int salary;

	protected Employee(String name, String idNumber, int salary) {
		this.name = name;
		this.idNumber = idNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getIDNumber() {
		return idNumber;
	}

	public int calculatePay() {
		return salary;
	}
}
