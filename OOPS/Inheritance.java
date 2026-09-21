package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Peacock p = new Peacock();
        p.eat();
        Shark s = new Shark();
        s.swim();
        Dog d = new Dog();
        d.bark();
    }
}  

class Animal {
    String color ;

    void eat () {
        System.out.println("Animal eats");
    }
}

class Fish extends Animal {
    void swim () {
        System.out.println("Fish swim");
    }
}

class Shark extends Fish {
    void bigFish () {
        System.out.println("Shark is BigFish");
    }
}

class Bird extends Animal {
    void fly () {
        System.out.println("Bird fly");
    }
}

class Peacock extends Bird {
    void sing() {
        System.out.println("Peacock sing");
    }
}

class Mammal extends Animal {
    void walk () {
        System.out.println("Mammal walk");
    }
}

class Dog extends Mammal {
    void bark () {
        System.out.println("Dog bark");
    }
}


