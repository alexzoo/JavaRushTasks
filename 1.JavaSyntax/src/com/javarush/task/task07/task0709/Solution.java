package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int min = 100;

        for (int i = 0; i < 5; i++) {
            list.add(i, sc.nextLine());
            if (list.get(i).length() < min)
                min = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }

    }
}
