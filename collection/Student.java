package list;

public class Student implements Comparable<Student>{
	int Id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		if(o.age>this.age)
		{ return 7;}
		else if(o.age<this.age)
		{return -7;}
		else{
		return 0;
	}}
	
	

}
