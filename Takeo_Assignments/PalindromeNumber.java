
public class PalindromeNumber {
	public static void main(String[]args) {
		
		int num = 12321;
		
		int x = num  ;
		int revNum = 0;
		
		while (x > 0) {
			int lastDigit = x%10;
			revNum = revNum*10 + lastDigit;
			
			x = x/10;
		}
		
		if (num == revNum)
			System.out.println(num +" is Palindrome Number");
		else
			System.out.println(num +" isn't Palindrome Number");
		
	}
}
