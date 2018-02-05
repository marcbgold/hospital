package hospital;

public interface PatientTreater extends BloodDrawer {

	default void careForPatient(Treatable patient) {
		patient.raiseHealthLevel(1);
	}
}