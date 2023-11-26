package day3;

public class OfflineTraining extends Training {
	private String venueDetails;

	public OfflineTraining() {
	}

	public OfflineTraining(String moduleName, int duration, String venueDetails) {
		super(moduleName, duration);
		this.venueDetails = venueDetails;
	}



	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}

	@Override
	public void conductTraining() {
		// TODO Auto-generated method stub
		System.out.println("Conduction Training at: "+venueDetails);
	}
	
	@Override
	public String getDetails() {
		String trainingDetails = super.getDetails();//Invoking 'getDetails()' from super class: Training
		String allTrainingDetails = trainingDetails + ", " + venueDetails;
		return allTrainingDetails;
	}


}
