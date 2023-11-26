package day2;

public class ArrayWithParameterMain {
	private static float[] doSquareRoot(int[] numbers) {
		// TODO Auto-generated method stub
		int size = numbers.length;
		int index = 0;
		float[] squareRoots= new float[size];
		for(int num: numbers){
			float squareRoot = (float)Math.sqrt(num);
			squareRoots[index] = squareRoot;
			index++;
		}
		
		return squareRoots;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 4, 9, 16, 25};
		float getSquareRoot[] = doSquareRoot(numbers);
		for(float sqRoot: getSquareRoot) {
			System.out.print(sqRoot+"\t");
		}
	}

	

}
