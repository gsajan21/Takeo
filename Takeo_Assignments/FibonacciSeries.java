
public class FibonacciSeries {
	public static void main(String []args) {
		
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		
		while(count < 20) {
			
			System.out.print(num1 +" ");
			
			//swap 
			int num3 = num2 +num1;
			num1 = num2;
			num2 = num3;
			count ++;
		}
	}

}
