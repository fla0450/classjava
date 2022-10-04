package ch07.ch4;

public class ThisMethod_2 {
    public static void main(String[] args) {
        A3 a1 =new A3();
        A3 a2 =new A3(10);
        A3 a3 =new A3(10,20);
        a1.print();
        a2.print();
        a3.print();
        B1 b1 =new B1();
        B1 b2 =new B1(10);
        B1 b3 =new B1(10,20);
        b1.print();
        b2.print();
        b3.print();
    }
}
class A3{
    int m1,m2,m3,m4;
    A3(){
        m1=1;
        m2=2;
        m3=3;
        m4=4;
    }
    A3(int a){
        m1=a;
        m2=2;
        m3=3;
        m4=4;
    }
    A3(int a,int b){
        m1=a;
        m2=b;
        m3=3;
        m4=4;
    }
    void print(){
        System.out.println(m1+"");
        System.out.println(m2+"");
        System.out.println(m3+"");
        System.out.println(m4+"");
    }
}
class B1 {
    int m1, m2, m3, m4;

    B1() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    B1(int a) {
        this();
        m1 = a;
    }

    B1(int a, int b) {
        this(a);
        m2 = b;
    }
    void print(){
        System.out.println(m1+"");
        System.out.println(m2+"");
        System.out.println(m3+"");
        System.out.println(m4+"");
    }
}