package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human human1 = new Human("Vasya", true, 12);
        Human human2 = new Human("Prtya", true, 22);
        Human human3 = new Human("Misha", true, 32);
        Human human4 = new Human("Anya", false, 22);

        Human human5 = new Human("Agnessa", false, 52, human4, human1);
        Human human6 = new Human("Trololo", true, 62, human1, human2);
        Human human7 = new Human("Trololo2", true, 52, human3, human4);
        Human human8 = new Human("Trololo3", true, 52, human4, human2);
        Human human9 = new Human("Trololo4", true, 72, human4, human2);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















