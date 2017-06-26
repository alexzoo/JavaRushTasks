package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int number = sc.nextInt();
            list.add(number);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list1.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 & list.get(i) % 2 != 0) {
                list3.add(list.get(i));
            }
        }
        printList(list1);
        printList(list2);
        printList(list3);


    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int x : list)
            System.out.println(x);
    }
}
