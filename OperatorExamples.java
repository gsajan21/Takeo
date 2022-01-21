
public class OperatorExamples {
	public static void main(String []args) {
		
//		unaryOperators();
//		logicalOperators();
//		ternaryOperators();
//		shiftOperators();
	}
	
	public static void unaryOperators() {
//		int x = 10;
//		
//		System.out.println(x++);
//		System.out.println(++x);
//		System.out.println(x--);
//		System.out.println(--x);
		
//		int a =10;
//		int b = 10;
//		 
//		System.out.println(a++ + ++a); //22 (10 + 12)
//		System.out.println(b++ + b++); //21 (10 + 11)
		
		// x = true
		// x ++
		// except boolean, we can perform unary operation on others data types.
		// variables can be incremented/decremented, but not actual numbers
//		
//		int a = 10;
//		char ch = 'A';
//		System.out.println(++ch);
		
		// we can't perform nesting on unary operation
		// int y = ++(++y);
		
	}
	
	public static void arthmeticOperators() {
		
//		int a = 10;
//		int b = 20;
//		
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
	
		// asignment operator
		
//		int x = 10;
//		x += 20; // x = x+20;
		
	}
	public static void logicalOperators() {
		
		/*
		 * we use logical operators to check the conditions
		 */
		
		int a = 10, b = 30, c = 30;
		
		System.out.println(a > b && a > c);
		System.out.println(a < b || ++a < c); // once the condition is true it doesn't check second condition
		System.out.println(a); // 10
	}
	public static void bitWiseOperators() {
		// &, |
		
		int a = 10, b = 30, c = 30;
		
		System.out.println(a > b && a > c);
		System.out.println(a < b || ++a < c); 
		// once the condition is true it checks second condition even though the condition is true.
		System.out.println(a); // 11
	}
	
	public static void ternaryOperators() {
		// (condition) ? cond1: cond2;
		
		//w.a.p to find even or odd
		
		String result = (100%2 == 0)?"even":"odd";
		System.out.println(result);
		
		int a = 5, b = 20;
		
		int min = (a<b)?a:b;
		System.out.println(min);
	}
	public static void shiftOperators() {
		
		// left shift operator
		System.out.println(10 << 2); // 10*2^2 = 10 * 4 = 40
		System.out.println(10 << 3); // 10*2^3 = 10 * 8 = 80
		
		// right shift operator
		System.out.println(10 >> 2); // 10/2^2 = 10 / 4 = 2
		System.out.println(10 >> 3); // 10/2^3 = 10 / 8 = 1
		
	}

}
