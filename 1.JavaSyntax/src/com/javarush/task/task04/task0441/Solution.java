package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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

//        if ( (a == b) && (b == c) )
//            System.out.println(a);


        System.out.println(mid(a, b, c));
    }
    static int mid(int a,int b, int c){
        if((a>=b && a<=c) || (a<=b && a>=c))return a;
        else return(mid(b,c,a));
    }

}
