package day7;


/*
 * 
 * Self Test
1. Given:
public class Question_3_1 {
interface ITest { // 1
void m();
}
public static void main(String args[]) {
ITest t = new ITest() { // 2
public void m() {
System.out.println("m()");
}
}
t.m();
}
}
What is the result?
A. m()
B. Compilation fails on the declaration marked as // 1
C. Compilation fails on the declaration marked as // 2
D. An exception occurs at runtime
2. Given:
public class Question_3_2 {
public static void main(String args[]) {
Question_3_2 q = new Question_3_2();
int i = 2;
q.method(i);
i = 4;
}
void method(int i) {
class A {
void helper() {
System.out.println(i);
}
}
new A().helper();
}
}
What is the result?
A. Compilation fails
B. 2
C. 4
D. An exception occurs at runtime
3. Given:
public class Question_3_3 {
public static void main(String[] args) {
Question_3_3 q = new Question_3_3() {
public int sum(int a, int b) { // 1
return a + b;
}
};
q.sum(2,6); // 2
}
}
What is the result?
A. Compilation fails on the declaration marked as // 1
B. Compilation fails on the line marked as // 2
C. 8
D. Nothing is printed
4. Given:
public class Question_3_4 {
public static class Inner {
private void doIt() {
System.out.println("doIt()");
}
}
public static void main(String[] args) {
Question_3_4.Inner i = new Inner();
i.doIt();
}
}
What is the result?
A. Compilation fails because an inner class cannot be static.
B. Compilation fails because the Inner class is instantiated incorrectly inside method main.
C. Compilation fails because the method doIt cannot be called in main because it is declared as private
D. The program prints doIt()
5. Given:
class A {
class B {
class C {
void go() {
System.out.println("go!");
}
}
}
}
public class Question_3_5 {
public static void main(String[] args) {
A a = new A();
A.B b = a.new A.B(); // 1
B.C c = b.new C(); // 2
c.go(); // 3
}
}
What is the result?
A. Compilation first fails on the line // 1
B. Compilation first fails on the line // 2
C. Compilation fails on the line // 3
D. go! is printed
6. Given:
public class Question_3_6 {
private class A { // 1
public int plusTwo(int n) {
return n + 2;
}
}
public static void main(String[] args) {
Question_3_6.A a = new A(); // 2
System.out.println(a.plusTwo(3));
}
}
What is the result?
A. Compilation fails on the line // 1
B. Compilation fails on the line // 2
C. 5
D. An exception occurs at runtime
7. Given:
public class Question_3_7 {
public static void main(String[] args) {
abstract class A { // 1
public void m() {
System.out.println("m()");
}
}
public class AA extends A { } // 2
}
}
What change would make this code compile?
A. Remove the abstract keyword on the line // 1
B. Add the public keyword on the line // 1
C. Remove the public keyword on the line // 2
D. None. This code compiles correctly
8. Given:
public class Question_3_8 {
int i = 2;
interface A {
int add();
}
public A create(int i) {
return new A() {
public int add() {
return i + 4;
}
};
}
public static void main(String[] args) {
A a = new Question_3_8().create(8);
System.out.println(a.add());
}
}
What is the result?
A. 6
B. 12
C. Compilation fails
D. An exception occurs at runtime
 */

public class SelfTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
