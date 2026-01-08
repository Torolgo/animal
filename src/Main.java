public class Main {
    public static void main(String[] args){
        Cow cow = new Cow("Michelle", 12);
        System.out.println(cow.name + " " + cow.age);

        cow.makeSound();
        System.out.println(Animal.isCow(cow));
    }
}