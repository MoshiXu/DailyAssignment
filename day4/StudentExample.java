package day4;


class Student{
	String name;
	int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("A",13);
		Student s2=new Student("A",13);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Student s3=s2;
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		//content comparison==>value
		String name1=new String("Moshi");
		String name2=new String("Moshi");
		System.out.println(name1==name2);//reference comparison
		System.out.println(name1.equals(name2));//content comparison
	}

}


