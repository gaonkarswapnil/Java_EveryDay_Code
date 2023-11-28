package day11;

import java.util.Objects;

public class TrainingProgram {
	private String name;
	private int duration;
	private TrainingMode modeOfTraining;
	
	public TrainingProgram() {
		name = "Art";
		duration = 3;
		modeOfTraining = TrainingMode.OFFLINE;
	}

	public TrainingProgram(String name, int duration, TrainingMode modeOfTraining) {
		this.name = name;
		this.duration = duration;
		this.modeOfTraining = modeOfTraining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public TrainingMode getModeOfTraining() {
		return modeOfTraining;
	}

	public void setModeOfTraining(TrainingMode modeOfTraining) {
		this.modeOfTraining = modeOfTraining;
	}

	@Override
	public String toString() {
		return "TrainingProgram [name=" + name + ", duration=" + duration + ", modeOfTraining=" + modeOfTraining + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duration, modeOfTraining, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainingProgram other = (TrainingProgram) obj;
		return duration == other.duration && modeOfTraining == other.modeOfTraining && Objects.equals(name, other.name);
	}
	
}
