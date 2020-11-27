package ru.kusiapkulov.peopleAndNames.blockOne;

public class Name {
    private  String name;
    private  String surname;
    private  String patronymic;

    public Name(String name) {
        this.name = name;
    }

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Name(String name, String patronymic, String surname) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    private String outPutName(){
        if(patronymic == null && surname == null)return name;
        else if(patronymic == null)return name+" "+surname;
        else return name+" "+patronymic +" "+ surname;
    }

    @Override
    public String toString() {
        return outPutName();
    }
}
