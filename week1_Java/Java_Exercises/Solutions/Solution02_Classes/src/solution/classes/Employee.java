package solution.classes;

import java.util.Date;

public class Employee {

	// Instance data.
	private String name;
	private double salary;
	private Date joined = new Date();
	
	// Constructors. Note, no default constructor.
	public Employee(String name) {
		this(name, 7000);	// Use constructor chaining.
	}

	public Employee(String name, double salary) {
		this.name = name;
		if (salary < 7000) {
			this.salary = 7000;
		} else {
			this.salary = salary;
		}
	}

	// Getters and setters.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoined() {
		return joined;
	}
	public void setJoined(Date joined) {
		this.joined = joined;
	}

	// Business methods.
	public void payRaise(double amount) {
		salary += amount;
	}
	
	public void payBonus() {
		// Give employee a 1% bonus.
		salary *= 1.01;
	}
	
	public void payBonus(double percentBonus) {
		// Give employee a bonus as specified by parameter.
		salary *= 1 + percentBonus / 100;
	}
	
	public void payBonus(double percentBonus, double min, double max) {
		// Give employee a bonus as specified by percentBonus, if salary is in range.
		if (salary >= min && salary <= max) {
			salary *= 1 + percentBonus / 100;
		}
	}

	
	// toString() method.
	@Override
	public String toString() {
		String str = String.format("%s earns %.2f, joined %s", name, salary, joined);
		return str;
	}
}
