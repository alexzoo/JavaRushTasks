package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr1 = new int[20];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < (arr1.length/2); i++) {
            arr2[i] = arr1[i];
        }
        for (int i = (arr1.length/2); i < arr1.length; i++) {
            arr3[i-10] = arr1[i];
        }

        for (int x : arr3)
            System.out.println(x);
    }
}
