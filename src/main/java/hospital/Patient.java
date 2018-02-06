package hospital;

public class Patient implements Bleedable, Treatable {

	private static final int DEFAULT_HEALTH_LEVEL = 10;
	private static final int DEFAULT_BLOOD_LEVEL = 50;
	private int healthLevel;
	private int bloodLevel;

	public Patient() {
		healthLevel = DEFAULT_HEALTH_LEVEL;
		bloodLevel = DEFAULT_BLOOD_LEVEL;
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
