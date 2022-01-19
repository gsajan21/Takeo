public class SwapThreeNum {
	public static void main(String [] args) {
		
		swapThreeNumWithTemp(5, 10, 12);
		
		System.out.println("\n===================");
		
		swapThreeNumWithoutTemp(22, 55, 10);
	}
	
	//swapping using temp variable
	
	public static void swapThreeNumWithTemp(int a, int b, int c) {
		
		int numOne, numTwo, numThree;
		numOne = a;
		numTwo = b;
		numThree = c;
		int temp = 0;
		
		System.out.println("Before Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree);
		
		temp = numOne + numTwo + numThree;
		numOne = temp - (numOne + numTwo);
		numTwo = temp - (numTwo + numThree);
		numThree = temp - (numThree + numTwo);
		
		System.out.println("\nAfter Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree);
	}
	
	// swapping without using temp variable
	public static void swapThreeNumWithoutTemp(int a, int b, int c) {

		int numOne, numTwo, numThree;
		numOne = a;
		numTwo = b;
		numThree = c;
		
		System.out.println("\nBefore Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree);
		
		numOne = numOne + numTwo + numThree;
		numTwo = numOne - (numTwo + numThree);
		numThree = numOne - (numThree + numTwo);
		numOne = numOne - (numTwo + numThree);
		
		System.out.println("\nAfter Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree);
		
		
	}
}
