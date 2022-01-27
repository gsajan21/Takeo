import java.util.Scanner;

//w.a.p given number is odd number or not?
public class OddOrNot {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		if(num%2 != 0)
			System.out.println(num +" is a odd number.");
		else
			System.out.println(num +" is a even number.");
		
		input.close();
		
	}
}
