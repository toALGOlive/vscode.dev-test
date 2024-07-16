class A {
int age = 20;
void print() {
    System.out.println("A"+ age);
 }
}

class B extends A {
 int age = 20;
 void print() {
    System.out.println("B"+ age);
 }
}

public class test1{
    public static void main(String[]s) {

        A a = new B();
        a.age =22;
        a.print();
        B b = new B();
        b.age = 22;
        b.print();

    }
}