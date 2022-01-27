
// program to find the given number is Armstrong or not
// list of Armstrong number from 0 to 1000

public class ArmstrongNumber {
	public static void main(String []args) {
		
		int remainder, result = 0;
		int armStrNum = 123;
		int num = armStrNum;
		
		while (num != 0) {
			remainder = num % 10;
			result += Math.pow(remainder, 3);
			num /= 10;
		}
		
		if (result == armStrNum)
			System.out.println(armStrNum+ " is a Armstrong number.");
		else
			System.out.println(armStrNum+ " is not a Armstrong number.");
		
	}
}
