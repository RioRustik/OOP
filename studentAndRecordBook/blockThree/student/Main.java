package ru.kusiapkulov.studentAndRecordBook.blockThree.student;

public class Main {

    public static void main(String[] args) {

        Student Vasia = new Student("Вася", 3,2,4,5);
        System.out.println(Vasia);
        Student Petia = new Student("Петя", Vasia.getMark());
        System.out.println(Petia);
        Student Andrei = new Student("Андрей", Vasia.getMark().clone());
        Vasia.editMArk(0, 5);
        System.out.println(Vasia);
        System.out.println(Petia);
        System.out.println(Andrei);

    }
}