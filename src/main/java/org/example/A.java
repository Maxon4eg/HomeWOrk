package org.example;

public class A {
    private static int n = 10;
    public int l;

     void metod4(A _a, A _b) {
        A temp = _a;
        _a = _b; //значение _a.l теперь = 6;
        _b = temp; //значение _b.l теперь = 3;
        //по завершении метода переменные _a и _b уничтожаются;
    }

    public void metod1(int _n) {
        _n = _n * 3; //значение переменной _n станет = 30, но _n удалится после завершения работы метода;
    }

    public void metod2(A _a) {
        _a.metod3(2); //изменяет состояние объекта, на который ссылаются как переменая _a, так и переменная a;
    }

    public void metod3(int _p) {
        n = n + _p; //увеличивает значение переменной n на _p;
    }
}