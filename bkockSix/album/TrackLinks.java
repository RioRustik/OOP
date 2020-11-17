package ru.kusiapkulov.bkockSix.album;

public class TrackLinks
{
    private  String name;
    private String autor;
    private AlbumLinks album;

    public TrackLinks(String name, String autor)
    {
        if(autor == "") throw new IllegalArgumentException();
        this.autor = autor;
        this.name = name;
    }

    public AlbumLinks getAlbum() {
        return album;
    }
    public boolean hasAlbum(){
        return album != null;
    }

    public void setAlbum(AlbumLinks album)
    {
        if(this.album == null)
            this.album = album;
    }

    private String outputTrack()
    {
        if(autor == null)
            return "Трек " + name +", автор " + album.autor;
        else
            return "Трек " + name + ", автор " + autor +", автор " + album.autor;

    }

    @Override
    public String toString()
    {
        return outputTrack();
    }
}