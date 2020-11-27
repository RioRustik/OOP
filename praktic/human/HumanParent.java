package ru.kusiapkulov.praktic.human;

public class HumanParent {
    Name name;
    HumanParent dad;;

    public HumanParent(Name name, HumanParent dad)
    {
        this.name = name;
        this.dad =  dad;
    }

    public boolean hasDad()
    {
        return dad != null;
    }

    private void chekDad()
    {
        if (!hasDad()) return;
        if(this.name.isEmptySurname())
            this.name.setSurname(dad.name.getSurname());
        if(this.name.isEmptyPatronymic())
            this.name.setPatronymic(dad.name.getName() + "Ович");

    }

    @Override
    public String toString()
    {
        chekDad();
        return name+" ";
    }
}
