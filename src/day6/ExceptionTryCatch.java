package day6;

public class ExceptionTryCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, result;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			result = x/y;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException er) {
			System.out.println("Enter atleast 2 number");
		}
		catch(ArithmeticException  ex) {
			System.out.println("cannot divide by zero");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
