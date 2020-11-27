package ru.kusiapkulov.praktic.human;

public class Name {
    private  String name;
    private  String surname;
    private  String patronymic;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public boolean isEmptyName()
    {
        return !(name != null && name != "");
    }
    public boolean isEmptySurname()
    {
        return !(surname != null && surname != "");
    }
    public boolean isEmptyPatronymic()
    {
        return !(patronymic != null && patronymic != "");
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

    //    private String outPutName(){
//        if(patronymic == null && surname != null)return name+" "+surname;
//        else if(surname == null && patronymic != null)return name +" "+patronymic;
//        else  if(patronymic == null && surname == null)return name;
//        else return name+" "+patronymic +" "+ surname;
//
//    }
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
