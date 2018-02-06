package hospital;

public interface MedicalDuties extends BloodDrawer {

	abstract void careForPatient(Treatable patient);
}