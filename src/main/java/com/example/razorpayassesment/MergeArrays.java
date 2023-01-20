package com.example.razorpayassesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        char[] a1 = new char[] {'k','o','p','l','y','z','v'};
        char[] a2 = new char[] {'s','q','w','c','b','m'};
        char[] result = mergeArrays(a1, a2);
        List<Character> result2 = mergeArraysCollections(a1, a2);
        System.out.println(Arrays.toString(result));


        printFibonacci(100);
    }

    private static List<Character> mergeArraysCollections(char[] a1, char[] a2) {
        List<Character> result = new ArrayList<>();
        for(char ch : a1) {
            result.add(ch);
        }
        for(char ch : a2) {
            result.add(ch);
        }
        System.out.println("Before sorting: " + result);
        Collections.sort(result);
        System.out.println("After sorting: " + result);

        return result;
    }

    private static void printFibonacci(int target) {
        long num1 = 0;
        long num2 = 1;

        System.out.print(num1 + ", " + num2 + ", ");
        for(int i = 2; i<= target; i++) {
            long k = num1 + num2;
            System.out.print(k + ", ");
            num1 = num2;
            num2 = k;
        }
    }

    static char[] mergeArrays(char[] a1, char[] a2) {
        int[] map = new int[256];
        char[] result = new char[a1.length + a2.length];
        for(char ch: a1) {
            map[ch]++;
        }
        for(char ch: a2) {
            map[ch]++;
        }

        int index = 0;
        for(int i =0; i<map.length; i++) {
            if(map[i] > 0) {
                result[index++] = (char) i;
            }
        }

        return result;
    }
}
