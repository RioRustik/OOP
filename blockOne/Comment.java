package ru.kusiapkulov.blockOne;

public class Comment {
    String str;
    int rating;

    public Comment(int rating, String str) {
        this.str = str;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  "("+rating+")" + " " + str;
    }
}
