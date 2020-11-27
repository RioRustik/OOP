package ru.kusiapkulov.depAndEmploye.blockTwo.employeesanddepartments;

public class Dep
{
    String title;
    Staff staff;

    public void setStaff(Staff staff)
    {
        this.staff = staff;
    }

    public Dep(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return title + staff;
    }
}
