import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Year: ");
		int year = input.nextInt();
		
		if (year%4 == 0) {
			if(year%400 == 0)
				System.out.println(year +" is a leap year.");
			else
				System.out.println(year +" is a common year or not a leap year.");
		}
		else 
			System.out.println(year +" is a common year or not a leap year.");
		
		
		input.close();
	}

}
