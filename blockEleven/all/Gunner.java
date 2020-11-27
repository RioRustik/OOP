package ru.kusiapkulov.blockEleven.all;

public class Gunner {

    private String name;
    private Weapon weapon;

    public Gunner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void shoot()
    {
        if(weapon != null) {
            weapon.shoot();
        } else
            System.out.println("не могу участвовать в перестрелке");
    }

}
