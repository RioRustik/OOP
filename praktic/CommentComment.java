package ru.kusiapkulov.praktic;

public class CommentComment
{

    private CommentComment comment;
    private int rating;
    private String res = "";

    public CommentComment(CommentComment comment, int rating, String res) {
        this.comment = comment;
        this.rating = rating;
        this.res = res;
    }

    public CommentComment(int rating, String res) {
        this.rating = rating;
        this.res = res;
    }

    private String commentEntry()
    {
        String format = "";
        if(comment != null)
        {
           format = comment+"\n ";
           for(int i = 0; i< depth(); i++)
           {
               format += "--";
           }
        }
        return format+rating+" "+res;
    }

    private int depth()
    {
        if(comment == null)
            return 0;
        return comment.depth() + 1;
    }

    @Override
    public String toString()
    {
        return commentEntry();
    }
}
