package ch6;
import ch01.*;
class A{
    int m =3;
    void print(){
        System.out.println("객체 생성및 활용");
    }
}
public class createObjectAndUsage {
    public static void main(String[] args) {

        //클래스로 객체(붕어빵) 생성
        A a =new A();
        //클래스 메서드 활용
        a.print();
        //클래스 필드 활용(붕어빵 맛있게 먹기)
        a.m=5;
        System.out.println(a.m);
        ValueAssignment.print();
        }
}
