package ru.kusiapkulov.blockEleven.gun;

public class Lab {
    public static void main(String[] args) {
        Gunner gunner1 = new Gunner("Rustam");
        Gunner gunner2 = new Gunner("Ippolit");
        Gunner gunner3 = new Gunner("Dora");
        MachineGun g1 = new MachineGun();
        gunner2.setWeapon(new Gun(7,7));
        gunner3.setWeapon(g1);
        gunner1.shoot();
        gunner2.shoot();gunner2.shoot();gunner2.shoot();
        gunner3.shoot();

    }
}
