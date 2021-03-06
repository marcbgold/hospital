package hospital;

public class Surgeon extends Doctor {

	protected boolean isOperating;

	public Surgeon(String name, String idNumber, int salary, String specialty) {
		super(name, idNumber, salary, specialty);
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	@Override
	public String toString() {
		return super.toString() + "\t Is Currently Operating: " + this.getIsOperating();
	}

}
