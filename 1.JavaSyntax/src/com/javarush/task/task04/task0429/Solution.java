package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int z = 0;
        int x = 0;

        if (a!=0) if (a>0) z++; else x++;
        if (b!=0) if (b>0) z++; else x++;
        if (c!=0) if (c>0) z++; else x++;

        System.out.println("количество положительных чисел: " + z);
        System.out.println("количество отрицательных чисел: " + x);
    }
}
