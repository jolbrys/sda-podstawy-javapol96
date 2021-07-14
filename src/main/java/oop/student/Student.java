package oop.student;

public class Student {
    //konstruktory - instrukcje które wykonają się w chwili utworzenia obiektu.
    // nie mają nazwy, a są identyfikowane po ilości argumentów jakie przyjmują.
    //jeśli tworząc obiekt podamy imie i wiek zostanie wykorzystany pierwszy konstruktor
    //jesli podamy samo imie, to ten drugi
    public Student(String name, int age){
        //w tym konstruktorze, do pól obiektu (do których odnosimy sie przez słowo kluczowe this) name i age przypisujemy wartości odpowiednio name i age wzięte z argumentu
        this.name = name;
        this.age = age;
    }


    public Student(String name){
    //w tym konstruktorze, przypisujemy do pola name pobrany z argumentu name, a do pola age wartość 7
        this.name = name;
        this.age = 7;
    }

    private String name;
    private int age;
    public static final int ageLimit = 18;


    //metoda, którą będziemy mogli wołać z konkretnych obiektów.
    public void sayHello(){
        //pod pola z this. zostaną podstawione wartości które ustawiliśmy w studencie z którego będziemy wołać metodę
        System.out.println("czesc, jestem " + this.name + " i mam " + this.age + " lat");

//korzystamy z pola statycznego ageLimit, nie uzywamy przy nim this, bo jest on atrybutem klasy. tak wiec odwoływanie się do obiektu nie miałoby sensu
        if(this.age > ageLimit){
            System.out.println("Jestem dosc stary, jak na ucznia.");
        }else{
            System.out.println("Jestem dzieckiem.");
        }
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
