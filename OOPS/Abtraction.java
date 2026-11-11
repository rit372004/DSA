package OOPS;

public class Abtraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();

        // Animal a = new Animal();  --> cannot create object of abstarct class

        Mustang m = new Mustang();

    }
}

abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called...");
    }

    //Non-abstract mehod
    void eat () {
        System.out.println("Animal eats");
    }

    //abstract mehod
    abstract void walk(); 
    //Walk does not have implementation it has only idea
    //implementation is told by child Class, walk() in Horse is depend on Horse class 
}

class Horse extends Animal {

    Horse () {
        System.out.println("Horse constructor called...");
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang () {
        System.out.println("Mustang constructor called...");
    }
}


