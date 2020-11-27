package ru.kusiapkulov.time.blockFive.time;

public class Time {
    private int second;
    private int hour;
    private int minuts;

    public Time(int second) {
        this.second = second;
    }

    public int Hour(int second){
        hour = second / 3600;
        return hour;
    }
    public int Minuts(int second){
        minuts = second / 60;
        minuts = minuts%60;
        return minuts;
    }
    public int Second(int second){
        this.second = second%60 ;
        return this.second;
    }

    private String convert(){
        int minuts = second / 60;
        minuts = minuts%60;
        int hour = second / 3600;
        hour = hour%24;
        int sec = second%60;
        return String.format("%02d:%02d:%02d", hour, minuts,sec);
    }

    @Override
    public String toString() {
        return convert();
    }
}
