package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = 0, c = 0;
        while (true) {
            int i = sc.nextInt();
            if (i == -1) break;
            a += i;
            c ++;
        }
        System.out.println((double)a / c);
    }
}

