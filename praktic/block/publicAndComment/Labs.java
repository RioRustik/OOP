package ru.kusiapkulov.praktic.block.publicAndComment;

public class Labs {
    public static void main(String[] args) {
        Publication publication = new Publication(
                "История транзистора",
                "Дорога к твердотельным переключателям была долгой. "+ "Она началась с открытия того, что определенные материалы странно "
                + "ведут себя в присутствии электричества. "+ "В 1874 году Фердинанд Браун опубликовал статью"+ " “О прохождении электрических токов через "
                    + "сульфиды металлов”. "+ "И все завертелось…",
                "История, IT, электроника",
                10);

        Comment c1 = new Comment("HELLO", 1);
        Comment c2 = new Comment("HI!", 23);
        Comment c3 = new Comment("YES", 2);
        Comment c4 = new Comment("Ya 4", 0);
        Comment c5 = new Comment("NullPointerExciption", 0);

        c1.setAnswerComment(c2);
        c1.setAnswerComment(c3);
        c2.setAnswerComment(c4);
        c2.setAnswerComment(c5);

        publication.setComment(c1);
        System.out.println(publication);
        c1.reduceRating();
        Comment c6 = new Comment("KKKKKK",1);
        c5.setAnswerComment(c6);
        c6.addRating();
        System.out.println(publication);
    }
}
