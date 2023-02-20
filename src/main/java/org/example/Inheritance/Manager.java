package org.example.Inheritance;

public class Manager extends Worker {

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {

        System.out.println(name + ": I'm a boss " + salary);
    }

    @Override
    protected String getThougts() {
        return " I want new house";
    }
}
