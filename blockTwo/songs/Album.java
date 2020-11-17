package ru.kusiapkulov.blockTwo.songs;

public class Album
{
    private String name;
    String autor;

    public Album(String name, String autor)
    {
        this.name = name;
        this.autor = autor;
    }

    @Override
    public String toString()
    {
        return "Альбом " + name + ", автор " + autor;
    }
}
