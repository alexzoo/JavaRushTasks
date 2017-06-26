package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 9; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }
        for (int x: arr)
            System.out.println(x);
    }
}

