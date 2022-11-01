package labos2;

class HealthVaccinationCenter extends HealthCenter implements VaccinationCenter {
	private int vaccinatedPatients = 0;

	public HealthVaccinationCenter(String name, String address, int registeredPatients) {
		super(name, address, registeredPatients);
	}

	@Override
	public void vaccinate(int numberOfPatients) {
		vaccinatedPatients += numberOfPatients;		
	}

	@Override
	public int getVaccinatedPatients() {
		return vaccinatedPatients;
	}

	@Override
	public int getNotVaccinatedPatients() {
		return (getRegisteredPatients() - vaccinatedPatients);
	}
	
	@Override
	public String toString() {
		return String.format("HealthVaccinationCenter [name=%s, address=%s, registered patients=%d, vaccinated patients=%d]", getName(), getAddress(), getRegisteredPatients(), vaccinatedPatients);
	}
	
}
