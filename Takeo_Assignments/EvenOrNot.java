import java.util.Scanner;

//w.a.p given number is even or not?
public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		if(num%2 == 0)
			System.out.println(num +" is a even number.");
		else
			System.out.println(num +" is a odd number.");
		
		input.close();
	}

}
