package ru.kusiapkulov.bkockSix.name;

public class Name {

    private String name;
    private String surname;
    private String patronymic;

    public Name(String name) {
        setName(name);
        this.name = name;
    }

    public Name(String name, String surname) {
        setName(name);
        this.name = name;
        setSurname(surname);
        this.surname = surname;
    }

    public Name(String name, String patronymic, String surname) {
        setName(name);
        this.name = name;
        setSurname(surname);
        this.surname = surname;
        setPatronymic(patronymic);
        this.patronymic = patronymic;
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
        if(name.equals("") || name == null) throw new IllegalArgumentException();
        this.name = name;
    }

    public void setSurname(String surname) {
        if(surname.equals("") || surname == null) throw new IllegalArgumentException();
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        if(patronymic.equals("") || patronymic == null) throw new IllegalArgumentException();
        this.patronymic = patronymic;
    }

    public String toString() {
        String res=null;
        if (this.name != null) {
            res = this.name;
        }
        if (this.patronymic != null) {
           res = res + this.patronymic;
        }
        if (this.surname != null) {
            res = res+ this.surname;
        }
        return res;
    }
}
