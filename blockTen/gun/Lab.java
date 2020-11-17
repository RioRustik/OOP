package ru.kusiapkulov.blockTen.gun;

public class Lab {
    public static void main(String[] args) {
        GunChild g1 = new GunChild();

        g1.shot();


        GunChild g2 = new GunChild(30);
        g2.setPatrons(10);
        g2.getAmmo();
        g2.shot();
        GunChild g3 = new GunChild(30,5,30);
        g3.shot();
        g3.shot();
    }
}
