package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        int d = sc.nextInt();

        int max1;
        int max2;

        if (a > b)
            max1 = a;
        else
            max1 = b;

        if (c > d)
            max2 = c;
        else
            max2 = d;

        if (max1 > max2)
            System.out.println(max1);
        else
            System.out.println(max2);
    }
}
