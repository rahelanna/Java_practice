
public class Main {

	public static void main(String[] args) {
		
		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
		
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Pufi";
		int myInt = 50;
		double myDouble = 1000;
		
		/*
		// [conversion-character]
		System.out.printf("%b", myBoolean);
		System.out.printf("\n%c", myChar);
		System.out.printf("\n%s", myString);
		System.out.printf("\n%d", myInt);
		System.out.printf("\n%f", myDouble);
		*/
		
		// [width] - minimum number of characters to be written as output
		// System.out.printf("Hello %10s", myString);
		
		// [precision] - sets number of digits of precision when outputting froating-point values
		// System.out.printf("You have this much money %.2f", myDouble);
		
		// [flags] 
		// adds an effect to output based on the flag added to format specifier
		System.out.printf("You have this much money %+f", myDouble);
		
	}	
	
}

