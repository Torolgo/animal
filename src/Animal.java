public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Sounds");
    }

    public static boolean isCow(Animal animal){
        return animal instanceof Cow;
    }

    public void eat(){
        System.out.println("J'ai bien mangé.");
    }
}
