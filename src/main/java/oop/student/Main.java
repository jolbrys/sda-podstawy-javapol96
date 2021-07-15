package oop.student;

public class Main {
    public static void main(String[] args) {

        //tworzymy 2 obiekty klasy student i wywolujemy z każdego nich metode sayHello()
        Student student1 = new Student("Jakub", 27);
        student1.sayHello();

        Student student2 = new Student("Andrzej");
        student2.sayHello();

        //uzycie settera
        student1.setName("Michał");
        student1.setAge(34);
        student1.sayHello();

        //przyklad zastosowania getterów
        if (student1.getAge() > student2.getAge()) {
            System.out.println(student1.getName() + " jest starszy");
        } else {
            System.out.println(student2.getName() + " jest starszy");
        }
    }
}
