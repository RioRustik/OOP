package ru.kusiapkulov.geometry.blockTen.points;

public class Time
{
    int time;

    public Time(int second) {
        this.time = second;
    }

    public Time(int hour, int minuts, int second) {
        this.time = hour * 3600 + minuts * 60 + second;
    }

    private String convert(){
       return (this.time / 3600) % 24
                + ":"
                + this.time / 60 % 60
                + ":"
                + this.time % 60 % 60;
    }

    @Override
    public String toString() {
        return convert();
    }
}



















//    int time;
//
//    Time(int time) {
//        this.time = time;
//    }
//    Time(int hour, int min, int sec){
//        this.time = hour * 3600 + min * 60 + sec;
//    }
//    public String toString() {
//        return (this.time / 3600) % 24
//                + ":"
//                + this.time / 60 % 60
//                + ":"
//                + this.time % 60 % 60;
//    }
//}
