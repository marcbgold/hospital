package hospital;

public class Janitor extends Employee {

	protected boolean isSweeping;

	public Janitor(String name, String idNumber, int salary) {
		super(name, idNumber, salary);
	}

	public boolean getIsSweeping() {
		return isSweeping;
	}

}
