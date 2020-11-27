package ru.kusiapkulov.geometry.blockTen.points;

public class ExsDot extends Dot
{
    private Time time;

    public ExsDot(int x, Time time) {
        super(x);
        this.time = time;
    }

    public ExsDot(int x, int y, Time time) {
        super(x, y);
        this.time = time;
    }

    public ExsDot(int x, int y, int z, Time time) {
        super(x, y, z);
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+" "+time;
    }
}
