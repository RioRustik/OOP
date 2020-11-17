package ru.kusiapkulov.bkockThree.student;

import java.util.Arrays;

public class Student {

    String name;
    int [] mark;

    public int[] getMark() {
        return mark;
    }

    public Student(String name, int...mark) {
        this.name = name;
        this.mark = mark;
    }

    public void editMArk(int pos, int newMark){
        if(pos >= 0 && pos < mark.length)
            mark[pos] = newMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + Arrays.toString(mark) +
                '}';
    }
}
