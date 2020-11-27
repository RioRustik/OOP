package ru.kusiapkulov.studentAndRecordBook.blockThree.recordBook;

import java.util.Arrays;

public class StudentBook
{
    String name;
    long numberBook;
    RecordBook[] book;

    public StudentBook(String name, long numberBook, RecordBook...book) {
        this.name = name;
        this.numberBook = numberBook;
        this.book = book;
    }

    @Override
    public String toString() {
        return name +", "+ numberBook + "\n"+
               Arrays.toString(book);
    }
}
