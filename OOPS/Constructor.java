package OOPS;

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Ritesh");
        System.out.println(s1.name);

        Student s2 = new Student();

       
    }
}

class Student {
    String name;

    //parameterised constructor
    Student (String name) {
        this.name = name;
    }

    //non-parameterised constructor
    Student () {
        System.out.println("constructor is called...");
    }
}
