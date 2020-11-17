package ru.kusiapkulov.bkockSix.album;

public class Main {

    public static void main(String[] args) {

        AlbumLinks album1 = new  AlbumLinks("Кукловод", "Металлов");
        AlbumLinks album2 = new  AlbumLinks("Шоссе к ООП", "Асид");
        TrackLinks trek1 = new TrackLinks("Состояние объектов", "Янг");
        TrackLinks trek2 = new TrackLinks("Шоссе к ООП", null);
        TrackLinks trek3 = new TrackLinks("Одноразовый программист", "Бертон");
//        trek1.setAlbum(album2);
//        trek2.setAlbum(album2);
//        trek3.setAlbum(album1);
//        System.out.println(trek1);
//        System.out.println(trek2);
//        System.out.println(trek3);
        album2.addTrack(trek1);
        album2.addTrack(trek2);
        album1.addTrack(trek3);
        System.out.println(trek1);
        System.out.println(trek3);
    }
}
