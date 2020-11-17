package ru.kusiapkulov.blockTwo.employeesanddepartments;

public class Staff
{
    String name;
    Dep dep;

    public Staff(String name, Dep dep)
    {
        this.name = name;
        this.dep = dep;
    }

    private String name()
    {
        if(this.name == dep.staff.name)
            return name + " начальник отдела "+ dep.title;
        else return name + " работает в отделе "
                + dep.title + " начальник которого "
                + dep.staff.name;
    }

    @Override
    public String toString()
    {
        return name();
    }
}