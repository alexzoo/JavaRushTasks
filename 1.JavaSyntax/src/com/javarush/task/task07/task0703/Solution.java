package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arr1 = new String[10];
        int[] arr2 = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextLine();
            arr2[i] = arr1[i].length();
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
