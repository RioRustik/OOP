package ru.kusiapkulov.songs.blockTwo.songs;

public class Track
{
    private  String name;
    private String autor;
    private Album album;

    public Track(String name, String autor)
    {
        if(autor == "") throw new IllegalArgumentException();
        this.autor = autor;
        this.name = name;
    }


    public void setAlbum(Album album)
    {
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