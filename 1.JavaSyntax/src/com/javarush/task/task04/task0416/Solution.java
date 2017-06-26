package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if (x % 3 == 0) {
            System.out.println("желтый");
        } else if (x % 4 == 0) {
            System.out.println("красный");
        } else {
            System.out.println("зелёный");
        }
    }
}