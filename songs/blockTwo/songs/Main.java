package ru.kusiapkulov.songs.blockTwo.songs;

public class Main {

    public static void main(String[] args) {

        Album album1 = new Album("Кукловод", "Металлов");
        Album album2 = new Album("Шоссе к ООП", "Асид");
        Track trek1 = new Track("Состояние объектов", "Янг");
        Track trek2 = new Track("Шоссе к ООП", null);
        Track trek3 = new Track("Одноразовый программист", "Бертон");
        trek1.setAlbum(album2);
        trek2.setAlbum(album2);
        trek3.setAlbum(album1);
        System.out.println(trek1);
        System.out.println(trek2);
        System.out.println(trek3);

    }
}
