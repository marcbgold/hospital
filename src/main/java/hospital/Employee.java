package hospital;

public abstract class Employee {

	protected String name;
	protected String idNumber;

	protected Employee(String name, String idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public String getIDNumber() {
		return idNumber;
	}

	public abstract int calculatePay();
}
