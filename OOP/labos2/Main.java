package labos2;

public class Main {
	public static void main(String[] args) {
		HealthVaccinationCenter hvc = new HealthVaccinationCenter("Dom zdravlja Grizanska", "Grizanska 15", 6000);

		hvc.vaccinate(100);
		hvc.getVaccinatedPatients(); // vraca 100
		hvc.getNotVaccinatedPatients(); // vraca 5900

		for (int i = 0; i < 10; i++) {
			hvc.vaccinate(100);
		}

		hvc.getVaccinatedPatients(); // vraca 1100
		hvc.getNotVaccinatedPatients(); // vraca 4900

		System.out.println(hvc);

	}
}
