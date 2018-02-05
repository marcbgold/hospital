package hospital;

public class Patient implements Treatable, Bleedable {

	private int healthLevel;
	private int bloodLevel;

	public Patient() {
		healthLevel = 10;
		bloodLevel = 50;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	@Override
	public void raiseHealthLevel(int amount) {
		healthLevel += amount;
	}

	@Override
	public void removeBlood(int amount) {
		bloodLevel -= amount;
	}
}
