package ru.kusiapkulov.bkockFive.time;

public class Main {

    public static void main(String[] args) {
//
//        Comment comment = new Comment(169, "Отличные задачи");
//        System.out.println(comment);
//
//
//        CommentComment c1 = new CommentComment(new CommentComment(new CommentComment(1, "лалала"), 0, "какая то фигня"),5, "Совершенно согласен!");
//        System.out.println(c1);
//        CommentComment c2 = new CommentComment(new CommentComment(0, "что-то я ничего не понял"), 31, "не фигня");
//        System.out.println(c2);
//


        Time t1 = new Time(10000);
        System.out.println(t1);
        System.out.println(t1.Hour(34056));
        System.out.println(t1.Minuts(34056));
        System.out.println(t1.Second(34056));


    }
}
