package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;
    public void initialize (int top)
    {this.top=top; this.left=left; this.width=width; this.height=height;}
    public void initialize (int top, int left)
    {this.top=top; this.left=left; this.width=0; this.height=0;}
    public void initialize (int top, int left, int width)
    {this.top=top; this.left=left; this.width=width; this.height=width;}
    public void initialize (int top, int left, int width, int height)
    {top=top; left=left; width=width; height=height;}

    public static void main(String[] args) {

    }
}
