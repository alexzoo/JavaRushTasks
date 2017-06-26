package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s: result)
            System.out.println(s);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for(int i = 0; i < list.size(); i++){
            int len = list.get(i).length();
            String res = "";
            for(int m = 0; m < len; m++){
                res += list.get(i).charAt(m)+""+list.get(i).charAt(m);
            }
            list.set(i, res);
        }
        return list;
    }
}
