package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr1 = new int[15];
        Scanner sc = new Scanner(System.in);
        int chet = 0;
        int nechet = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            if ((i % 2) == 0 || i == 0)
                chet = chet + arr1[i];
            else
            nechet = nechet + arr1[i];
        }
        if (chet > nechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
