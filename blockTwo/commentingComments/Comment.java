package ru.kusiapkulov.blockTwo.commentingComments;

public class Comment
{
    String str;
    int rating;
    Comment comment;

    public Comment(int rating, String str)
    {
        this.str = str;
        this.rating = rating;
    }

    public void setAnswerComment(Comment comment){
        this.comment = comment;
    }

    private String addComment()
    {
        Comment tmpComment = this;
        String resStr = tmpComment.str+ " (" + tmpComment.rating+ ") " +"\n";
        int count = 0;
        while (tmpComment.comment != null){
            count++;
            tmpComment = tmpComment.comment;
            for (int i = 0; i < count; i++)
            {
                resStr += "---";
            }
            resStr += tmpComment.str + " (" + tmpComment.rating+ ") " + "\n";
        }
        return resStr;
    }

    @Override
    public String toString() {
        return addComment();
    }
}
