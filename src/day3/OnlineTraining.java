package day3;

public class OnlineTraining extends Training {
	private String meetingLink;

	public OnlineTraining() {
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}



	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}

	@Override
	public void conductTraining() {
		// TODO Auto-generated method stub
		System.out.println("Meeting Link at: "+meetingLink);
	}

}
