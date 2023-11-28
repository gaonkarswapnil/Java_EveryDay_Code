package day11;

import java.util.Arrays;
import java.util.List;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingProgram program1 = new TrainingProgram();
		TrainingProgram program2 = new TrainingProgram("Science", 2, TrainingMode.ONLINE);
		TrainingProgram program3 = new TrainingProgram("Communication Skills", 3, TrainingMode.HYBRID);
		TrainingProgram program4 = new TrainingProgram("Interview Skills", 4, TrainingMode.OFFLINE);
		TrainingProgram program5 = new TrainingProgram("Share Market", 5, TrainingMode.ONLINE);
	
		List<TrainingProgram> allTrainingProgram = Arrays.asList(program1, program2, program3, program4, program5);
		
		for(TrainingProgram trainingProgram: allTrainingProgram) {
			TrainingMode trainingMode = trainingProgram.getModeOfTraining();
			if(trainingMode.equals(TrainingMode.ONLINE)) {
				System.out.println(trainingProgram.getName());
			}
		}
	}

}
