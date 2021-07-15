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

    //atrybuty obiektu ustawiamy jako prywatne - dobrą praktyką jest zapobiegać przesadnie swobodnemu modyfikowaniu ich z poziomu innych klas
    private String name;
    private int age;

    //poniższe pole jest atrybutem klasy - jest wspólne dla wszystkich obiektów, po zmodyfikowaniu go zmiana bedzie widoczna we wszystkich obiektach
    //oprócz tego użyliśmy słowa kluczowego final, dzięki czemu ze zmiennej zrobiliśmy de facto stałą. w tym konkretnym przypadku użyliśmy tego połączenia (jeszcze do tego public)
    //żeby mieć takie wspólne dla obiektów pole, którego przykład użycia znajdziecie poniżej
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


    //settery i gettery służą nam odpowiednio do modyfikowania i wyciągania wartości pól z obiektu.
    //zwróćcie uwage że są publiczne - dlatego możemy je wołać z innych klas
    //jednoczesnie nadal znajdują sie w klasie Student, więc mają dostęp do prywatnych pól tej klasy

    //settery są voidami i jako argument przyjmują wartość, którą podstawią w odpowiednie pole
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //gettery nie przyjmują argumentów, a ich zadaniem jest zwrócić wartość odpowiedniego pola. dlatego też muszą być tego samego typu, jak to pole.
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


}
