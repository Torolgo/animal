public class Cow extends Animal {
    public Cow(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void makeSound() {
        System.out.println("Meuh");
    }
}
