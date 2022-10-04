package ch08;


public class packageImport_1 {
    public static void main(String[] args) {
        ch08.Doit1.A a =new ch08.Doit1.A();
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
