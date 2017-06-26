package com.javarush.task.task05.task0520;

public class Rectangle {
    int left;
    int top;
    int width;
    int height;
    public Rectangle(int left,int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left){
        this.left = left;
        this.top = top;
    }
    public Rectangle(int left,int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public Rectangle(){
        this(0, 6, 6, 9); //у меня этот вариант прошол. просто указал параметры
    }
    public static void main(String[] args) {

    }
}