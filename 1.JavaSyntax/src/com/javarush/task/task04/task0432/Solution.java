package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        while ( n > 0 )
        {
            System.out.println(s);
            n--;
        }

    }
}
