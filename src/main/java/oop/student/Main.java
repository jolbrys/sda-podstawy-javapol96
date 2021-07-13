package oop.student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jakub", 27);
        student1.sayHello();

        Student student2 = new Student("Andrzej");
        student2.sayHello();

       //student1.setName("Michał");
       //student1.setAge(34);
       //student1.sayHello();

        if(student1.getAge() > student2.getAge()){
            System.out.println(student1.getName() + " jest starszy");
        }else{
            System.out.println(student2.getName() + " jest starszy");
        }



    }
}
