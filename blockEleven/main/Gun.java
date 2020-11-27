package ru.kusiapkulov.blockEleven.main;

public class Gun extends Weapon{
    private final int maxPatrons;

    public Gun(int maxPatrons, int patrons) {
        super(patrons);
        if(maxPatrons <= 0) throw new IllegalArgumentException(maxPatrons+" is not a legal floor");
        this.maxPatrons = maxPatrons;
    }

    public void setPatrons(int patrons){
        if(patrons > maxPatrons)throw new IllegalArgumentException("больше " + maxPatrons+ " нельзя");
        load(patrons);
    }

    public int getmaxPatrons(){
        return this.maxPatrons;
    }

    public void shoot(){
        int ammoPatrons = ammo();
        if (ammo() > 0) {
            System.out.println("Бах!");
            ammoPatrons--;
            load(ammoPatrons);
        }
        else System.out.println("Клац!");
    }

    public void recharge(int patrons){
        if(patrons <= 0) throw new IllegalArgumentException(patrons+" is not a legal floor");
        int cageAmmo = this.maxPatrons - ammo();
        if(patrons > cageAmmo) {
            int excessAmmo = patrons - cageAmmo;//лишние патроны
            System.out.println("Лишние патроны "+excessAmmo);
            load(ammo()+cageAmmo);
        }else
            load(ammo() + patrons);
        System.out.println("Пистолет перезаряжен число патронов " + ammo());

    }

    public void discharge()
    {
        System.out.println("Писталет разряжен вынуто паронов "+ammo());
        load(0);
    }

    public int getPatron()
    {
        return super.ammo();
    }

    public void state(){
        if(ammo()== 0)  System.out.println("Писталет разряжен");
        if(ammo()!= 0)  System.out.println("Писталет заряжен");
    }

}
