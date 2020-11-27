package ru.kusiapkulov.weapon.blockNine.gun;

public class Lab {
    public static void main(String[] args) {
        GunChild colt = new GunChild();
        colt.setPatrons(3);
        colt.shot();
        System.out.println("\n");
        GunChild colt1 = new GunChild(10);
        colt1.setPatrons(10);
        colt1.shot();
        System.out.println("\n");
        GunChild colt2 = new GunChild(10, 2);
        colt2.setPatrons(6);
        colt2.setSecond(3);
        colt2.shot();

    }
}
