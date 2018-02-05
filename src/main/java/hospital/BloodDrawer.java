package hospital;

public interface BloodDrawer {

	default void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}
}