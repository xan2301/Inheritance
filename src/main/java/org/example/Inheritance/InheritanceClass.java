package org.example.Inheritance;

import org.example.Inheritance.dev.Developer;

public class InheritanceClass {

    public static void main(String[] args) {
        Worker worker = new Worker("Marek", 1500);
        worker.work();

        Manager manager = new Manager("Jacek", 5000);
        manager.work();

        Developer developer = new Developer("John", 10000);
        developer.work();
        developer.takeABreak();

        Worker manager2 = manager;
        Worker developer2 = developer;

        manager2.work();
        developer2.work();

        Worker newWorker = new Worker("Jacek", 1500);
        Worker newManager = new Manager("Ann", 10500);
        Worker newDeveloper = new Developer("Forest", 25000);



        System.out.println(newWorker.getBaseInfo());
        System.out.println(newManager.getBaseInfo());
        System.out.println(newDeveloper.getBaseInfo());
        System.out.println(newDeveloper.getNewOrder());




    }

}
