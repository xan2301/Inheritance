package org.example.Inheritance.dev;

import org.example.Inheritance.Worker;

public class Developer extends Worker {
    public Developer(String name, int salary) {
        super(name, salary);
    }


    @Override
    public void work() {
        System.out.println(name + ": I'm a developer " + salary);
    }

    @Override
    protected String getThougts() {
        return "I want new laptop";
    }
}
