package demo.classes;

import java.util.Scanner; 

public class DemoUsefulClasses {

	public static void main(String[] args) {
		demoScanner();
		demoString();
		demoMath();
	}
	
	
	public static void demoScanner() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nEnter a String: ");
		String s = scanner.next();

		System.out.print("Enter an int: ");
		int i = scanner.nextInt();

		System.out.print("Enter a double: ");
		double d = scanner.nextDouble();

		System.out.println("Your string was " + s);
		System.out.println("Your integer was " + i);
		System.out.println("Your double was " + d);
	}

	
	public static void demoString() {

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("\nFirst name? ");
		String firstName = scanner.next();

		System.out.print("Last name? ");
		String lastName = scanner.next();

		String fullName = firstName + " " + lastName;
		String fullNameLC = fullName.toLowerCase();

		System.out.println(fullNameLC);
	}

	
	public static void demoMath() {
		
		double angle = Math.PI / 4;
		System.out.println("Sin: " + Math.sin(angle));
		System.out.println("Cos: " + Math.cos(angle));
		System.out.println("Tan: " + Math.tan(angle));
		System.out.println("In degrees: " + Math.toDegrees(angle));
	
		double radius = 10.0;
		System.out.println("Circle area: " + Math.PI * radius * radius);
		
		double num = -10.5;
		System.out.println("Absolute value: " + Math.abs(num));
		System.out.println("Max of num,20:  " + Math.max(num, 20));
		System.out.println("Min of num,20:  " + Math.min(num, 20));
		System.out.println("Ceiling value:  " + Math.ceil(num));
		System.out.println("Floor value:    " + Math.floor(num));
		System.out.println("Rounded value:  " + Math.round(num));
	
		System.out.println("Random number: " + Math.random());
	}
}
