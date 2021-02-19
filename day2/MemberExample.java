package day2;


class Member{
	static String name;
	int age;
	int phoneNumber;
	String address;
	double salary;
	
	public void printSalary() {
		System.out.println("Salary for: "+name+" is: "+salary);
	}
}

class Employee extends Member{
	String specialization;
}

class Manager extends Member{
	String department;
}

public class MemberExample {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name="Annie";
		e1.age=23;
		e1.phoneNumber=114;
		e1.address="NYC";
		e1.salary=4000;
		
		e1.printSalary();
		
		
		Manager m1=new Manager();
		m1.name="Susan";
		m1.age=27;
		m1.phoneNumber=112;
		m1.address="NJ";
		m1.salary=5000;
		
		m1.printSalary();

	}

}
