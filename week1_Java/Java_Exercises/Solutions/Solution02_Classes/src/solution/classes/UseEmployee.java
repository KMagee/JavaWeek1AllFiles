package solution.classes;

public class UseEmployee {

	public static void main(String[] args) {
		doTest1();
		doTest2();
	}

	
	private static void doTest1() {
	
		System.out.println("In doTest1()...");

		// Create employee with minimum salary.
		Employee emp1 = new Employee("Ruth Smith");
		emp1.payRaise(500);
		System.out.println("emp1 details: " + emp1);

		// Create employee with specific salary, and then change name and salary.
		Employee emp2 = new Employee("Claire Jones", 69000);
		emp2.setName("Claire Davies");
		System.out.println("emp2 details initially:  " + emp2);
		emp2.setSalary(71000);
		System.out.println("emp2 details afterwards: " + emp2);
	}


	private static void doTest2() {
		
		System.out.println("\nIn doTest2()...");

		// Create employee, and give a default bonus (1%).
		Employee emp1 = new Employee("Andy", 10000);
		emp1.payBonus();
		System.out.println("emp1 details after bonus: " + emp1);

		// Create employee, and give a 10% bonus.
		Employee emp2 = new Employee("Bert", 10000);		
		emp2.payBonus(10);
		System.out.println("emp2 details after bonus: " + emp2);

		// Create employee, and give a 10% bonus if salary between 8000 and 20000.
		Employee emp3 = new Employee("Carl", 10000);		
		emp3.payBonus(10, 8000, 20000);
		System.out.println("emp3 details after bonus: " + emp3);

		// Create employee, and give a 10% bonus if salary between 15000 and 20000.
		Employee emp4 = new Employee("Dave", 10000);		
		emp4.payBonus(10, 15000, 20000);
		System.out.println("emp4 details after bonus: " + emp4);
	}
}
