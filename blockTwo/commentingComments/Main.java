package ru.kusiapkulov.blockTwo.commentingComments;

public class Main

{
    public static void main(String[] args)
    {
        Comment comment = new Comment(169, "Отличные задачи!");
        comment.setAnswerComment(new Comment(5, "так себе"));
        comment.comment.setAnswerComment(new Comment(111, "фуууу"));
        System.out.println(comment);
    }
}
