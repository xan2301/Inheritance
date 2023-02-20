package org.example.Inheritance;

public class Worker {

    protected final String name;
    protected final int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {

        System.out.println(name + ": I earn " + salary);
    }

    public final void takeABreak() {
        System.out.println(name + ": Time for a break ");

    }

    public final String getBaseInfo() {
        return name + ": salary: " + salary + " (" + (getThougts() + ")");
    }

    protected String getThougts() {
        return "I want new Car";
    }

    protected String getNewOrder(){
        return "New order";
    }
}
