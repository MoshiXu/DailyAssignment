package day5;

//package com.cg.eis.exception


class Employee{
	private String name;
	private double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class EmployeeExceptionExample {

	public static void main(String[] args) throws Exception {
		
		Employee e1=new Employee("Annie",2000);
		Employee e2=new Employee("Ben",9000);
		
		check(e2);
		//check(e1);
	}

	public static void check(Employee e) throws Exception {
		if(e.getSalary()<3000) {
			throw new Exception("Your salary is below $3000");
		}
	}
}
