package ru.kusiapkulov.human;

public class HumanName {
   Name name;
    int height;

    public HumanName(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    private String heightHuman(){
        if(height < 160) return "Маденький человек";
        else if  (height > 185) return "Высокий человек";
        else return "Cредний человек";
    }

    @Override
    public String toString() {
        return name+", рост "+ height +" " + heightHuman() ;
    }

}
