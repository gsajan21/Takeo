
// find factorial of a given number in java


public class Factorial {
	public static void main(String[]args) {
		
		int fact = 5;
		int total = 1;
		
		for (int i = fact; i > 0; i--) {
			
			total *= i;
		}// end of for
		
		System.out.println("Factorial of "+ fact + " is "+ total);
		
		
	}
}
