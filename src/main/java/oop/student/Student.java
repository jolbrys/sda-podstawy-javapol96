package oop.student;

public class Student {
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name){
        this.name = name;
        this.age = 18;
    }

    private String name;
    private int age;

    public void sayHello(){
        System.out.println("czesc, jestem " + this.name + " i mam " + this.age + " lat");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


}
