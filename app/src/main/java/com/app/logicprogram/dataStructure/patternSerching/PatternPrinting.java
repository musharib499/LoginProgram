package com.app.logicprogram.dataStructure.patternSerching;

import java.util.ArrayList;

/**
 * Created by Musharib Ali on 23/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
class PatternPrinting {
    public static void main(String[] args) {
        PatternPrinting p = new PatternPrinting();
        System.out.println(p.searchingPattern("THIS  TEST IS A TEST TEXT TEST", "TEST"));

        int[] my = new int[]{135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};


        System.out.println(subarraySum(my, my.length, 468));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int i = 0;
        ArrayList<Integer> my = new ArrayList<Integer>();
        while (i < n) {
            int p = getPosition(arr, n, s, i);
            if (p > -1) {
                my.add(i + 1);
                my.add(p);
                return my;
            }

            i++;
        }
        if (my.size() == 0) my.add(-1);
        return my;

    }

    static int getPosition(int[] arr, int n, int s, int i) {


        if (s == 0) return i;
        if (s < 0 || i > n) return -1;

        return getPosition(arr, n, s -= arr[i], i += 1);

    }

    private String searchingPattern(String first, String second) {

        int n = first.length();
        int i = 0;
        String result = "";
        while (i <= n - second.length()) {
            if (i == getPosition(first, second, i, second.length() - 1)) result += i + " ";
            i++;
        }
        return result;
    }

    private int getPosition(String first, String second, int i, int k) {
        if (k == 0) return i;

        if (first.charAt(i + k) != second.charAt(k)) return -1;

        return getPosition(first, second, i, k - 1);

    }
}