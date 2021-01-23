package com.innobles.logicalprogram.oops;

/**
 * Created by Musharib Ali on 20/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
class MultipleClassOOps {
    public static void main(String[] args) {
        B b = new B();
        A1.sum1();
    }
}

class A1 {
    static {
        System.out.println("Static");
    }

    A1() {
        System.out.println("A1");
    }

    static void sum1() {
        System.out.println("Static");
    }
}

class A extends A1 {
    A() {
        System.out.println("A");
    }

    A(String name) {
        System.out.println(name);
    }

    static void text() {

    }

    void sum() {
        System.out.println("sum");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}
