package ru.kusiapkulov.blockTwo.employeesanddepartments;

public class Lab {
    public static void main(String[] args) {

        Dep it= new Dep("IT");
        Staff Petrov = new Staff("Петров", it);
        Staff Kozlov = new Staff("Козлов", it);
        Staff Sidorov = new Staff("Сидоров", it);
        it.setStaff(Sidorov);
        System.out.println(Petrov);
        System.out.println(Kozlov);
        System.out.println(Sidorov);
    }
}
