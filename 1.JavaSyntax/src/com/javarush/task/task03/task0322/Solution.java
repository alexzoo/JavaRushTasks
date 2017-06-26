package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите имя1: ");
        String name1 = reader.readLine();
        //System.out.println("Введите имя2: ");
        String name2 = reader.readLine();
        //System.out.println("Введите имя3: ");
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

    }
}