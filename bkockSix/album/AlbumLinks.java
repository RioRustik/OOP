package ru.kusiapkulov.bkockSix.album;

import java.util.ArrayList;
import java.util.List;

public class AlbumLinks
{
    private String name;
    String autor;
    List<TrackLinks> trackLinks = new ArrayList<>();

    public AlbumLinks(String name, String autor)
    {
            this.name = name;
            this.autor = autor;
    }

    public void addTrack(TrackLinks track){
         if(!track.hasAlbum()){
             track.setAlbum(this);
             trackLinks.add(track);
         }
    }

    @Override
    public String toString()
    {
            return "Альбом " + name + ", автор " + autor + " " +trackLinks;
    }
}