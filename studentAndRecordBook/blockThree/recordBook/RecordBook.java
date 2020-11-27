package ru.kusiapkulov.studentAndRecordBook.blockThree.recordBook;

public class RecordBook
{
    String surname, subject;
    int grade;

    public RecordBook (String subject, String surname, int grade) {
        this.surname = surname;
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  subject+ " " + surname + " "+ grade;
    }
}
