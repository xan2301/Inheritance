package org.example.Inheritance;

import org.example.Inheritance.dev.Developer;

public class Table {

    public static void main(String[] args) {
        Worker[] worker = new Worker[3];

        worker[0]= new Worker("Jacek" ,150000);
        worker[1]= new Manager("Ann" ,15000);
        worker[2]= new Developer("John" ,50000);

        for (int i = 0; i < worker.length; i++){
            worker[i].work();
        }

    }
}
