package ru.kusiapkulov.blockEleven.all;

public class MachineGun extends Gun
{
    private final int rate;
    private int second = 1;

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 5) throw new IllegalArgumentException(second+" is not a legal floor");
        this.second = second;
    }

    public MachineGun() {
        super(30, 30);
        this.rate = 30;
    }

    public MachineGun(int maxPatrons)
    {
        super(maxPatrons, maxPatrons);
        this.rate = maxPatrons/2;
    }

    public MachineGun(int maxPatrons, int rate, int ammo) {
        super(maxPatrons, ammo);
        if(rate < 0) throw new IllegalArgumentException(rate+" is not a legal floor");
        this.rate = rate;
    }

    public void shoot(){
//        for (int i = 0; i < rate*second; i++){
//            super.shot();
//        }

        int ammo = getPatron();
        for (int i = 0; i < rate*second; i++)
        {
            if (getPatron() > 0)
            {
                System.out.print("Бах!");
                ammo--;
                setPatrons(ammo);
            }
            else
            {
                System.out.print("Клац!");
                System.out.println();
                return;
            }

        }
        System.out.println();


    }

}
