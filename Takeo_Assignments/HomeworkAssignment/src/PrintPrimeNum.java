
// w.a.p print prime numbers from 1 to 100
public class PrintPrimeNum {

	// this method check if the given number is prime or not.
	void isPrimeNum(int number) {
		int num = number;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++; // for prime count will be incremented twice
			} // end of for
			if (count == 2)
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " isn't a prime number");
		} // end if
		else
			System.out.println(num + "is not a prime number");
	} // end isPrmeNum

	void listPrimeNum() {
		int num = 100;
		int count = 0;

		for (int i = 2; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				if (i % j == 0)
					count++;
			} // end nested for
			if (count == 2) 
				System.out.print(i + " ");	
			count = 0;

		} // end for
	}

	public static void main(String[] args) {

		PrintPrimeNum prime = new PrintPrimeNum();
		prime.isPrimeNum(17);

		new PrintPrimeNum().listPrimeNum();

		// listing prime number for 1 to 100.
//		int n = 100;
//		
//		for (int i = 2; i <= n; i++) {
//			
//			boolean isPrime = true;
////			System.out.print(i+ " ");
//			for(int j = 2; j < i; j++) {
//				if ( i %j == 0) {
//					isPrime = false;
//					break;
//				}
//			} // end of nested for
//			
//			if(isPrime) {
//				System.out.print(i + " ");
//			} // end if
//				
//		}// end for

	}

}
