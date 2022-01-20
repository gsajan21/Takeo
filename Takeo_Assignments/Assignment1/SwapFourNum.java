
public class SwapFourNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Swapping numbers using temp variable.");
		swapFourNumWithTemp(22, 33, 51, 60);
		
		System.out.println("\n===================");
		
		System.out.println("\nSwapping numbers without using temp variable.");
		swapFourNumWithoutTemp(12, 43, 11, 34);
	}
	// method to swap four number using temp variable
	public static void swapFourNumWithTemp(int numOne, int numTwo, int numThree, int numFour) {
 
		
		System.out.println("Before Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree+"\nNumFour is \t"+numFour);
		
		int temp = 0;
		
		temp = numOne;
		numOne = numTwo;
		numTwo = numThree;
		numThree = numFour;
		numFour = temp;
		
		System.out.println("\nAfter Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree+"\nNumFour is \t"+numFour);
		
	}
	
	//method to swap four number without using temp variable
	public static void swapFourNumWithoutTemp(int numOne, int numTwo, int numThree, int numFour) {
		
		System.out.println("\nBefore Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree+"\nNumFour is \t"+numFour);
		
		//swapping logic
		numOne = numOne + numTwo + numThree + numFour;
		numTwo = numOne - (numTwo + numThree + numFour);
		numThree = numOne - (numTwo + numThree + numFour);
		numFour = numOne - (numTwo + numThree + numFour);
		numOne = numOne - (numTwo + numThree + numFour);
		
		System.out.println("\nAfter Swapping");
		System.out.println("NumOne is \t"+numOne+"\nNumTwo is \t"+numTwo+"\nNumThree is \t"+numThree+"\nNumFour is \t"+numFour);
		
	}

}
