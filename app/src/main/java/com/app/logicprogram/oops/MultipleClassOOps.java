package com.app.logicprogram.oops;

/**
 * Created by Musharib Ali on 20/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
class MultipleClassOOps {
    public static void main(String[] args) {
        B b = new B();
        A1.sum1();
        int[] aa = new int[]{1, 2, 3, 4, 5};
        System.out.println(getValue(aa, 8, 0));
        System.out.println(getCount("My Name Musharib", 1, 0, false));
        System.out.println(getString("MyNameMusharib", 0, ""));
        System.out.println(getStringMatch("abc", "bc", 1, 2));
    }


    public static boolean getValue(int[] arr, int number, int i) {
        if (i > (arr.length - 1)) return false;
        if (number < arr[i]) return true;
        return getValue(arr, number, i + 1);

    }

    static int getCount(String s, int w, int i, boolean space) {
        if (s.length() == 0) return 0;
        if (i >= s.length()) return w;

        if (s.charAt(i) != ' ') space = false;
        if (s.charAt(i) == ' ' && !space) {
            w += 1;
            space = true;
        }

        return getCount(s, w, i + 1, space);

    }

    static String getString(String s, int i, String k) {
        if (i > (s.length() - 1)) return k;
        if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') k += s.charAt(i);
        if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
            k += ' ';
            k += (char) (s.charAt(i) + 32);
        }


        return getString(s, i + 1, k);
    }

    static boolean getStringMatch(String str1, String str2, int k, int i) {
        if (i <= 0) return false;
        if (k <= 0) return true;
        if (str1.charAt(i) != str2.charAt(k)) return false;
        return getStringMatch(str1, str2, k - 1, i - 1);
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



