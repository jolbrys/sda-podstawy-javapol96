package statiki.przyklady;

public class ChildWithAgeLimit {
    public ChildWithAgeLimit(String name, int age){
        this.name = name;
        this.age = age;
    }
    private static int MAX_AGE = 18;
    private String name;
    private int age;

    public void sayHello(){
        if(age <= MAX_AGE){
            System.out.println("My name is " + this.name + ", I am " + this.age + " years old.");
        } else{
            System.out.println("My name is " + this.name + ", I am not a child anymore.");
        }
    }

    public static void setMaxAge(int maxAge) {
        MAX_AGE = maxAge;
    }

}
