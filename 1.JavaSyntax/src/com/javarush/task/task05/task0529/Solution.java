package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner a = new Scanner(System.in);
        int c = 0;
        while (true) {
            String f = a.nextLine();
            if (f.equals("сумма")) {
                break;
            } else c += Integer.parseInt(f);
        }

        System.out.println(c);
    }
}
