package org.example;

public class ReferenceValue {

    public static void main(String[] args) {
        A a = new A();

        a.metod1(23); //значение переменной n останется = 10;

        a.metod2(a); //значение переменной n станет = 12;

        a.l = 3;
        A b = new A();
        b.l = 6;
        a.metod4(a, b); //значение a.l останется = 3, b.l останется = 6;
        System.out.println(a.l);
        System.out.println(b.l);
    }


}
