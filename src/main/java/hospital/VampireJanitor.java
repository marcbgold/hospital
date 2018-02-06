package hospital;

public class VampireJanitor extends Janitor implements BloodDrawer {

	protected boolean isBiting;

	public VampireJanitor(String name, String idNumber, int salary) {
		super(name, idNumber, salary);
	}

	public boolean getIsBiting() {
		return isBiting;
	}

	@Override
	public String toString() {
		return super.toString() + "\t Is Currently Biting: " + this.getIsBiting();
	}

}
