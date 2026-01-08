public class Cow extends Animal implements Pet {
    public Cow(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void makeSound() {
        System.out.println("Meuh");
    }

    @Override
    public void play() {
        System.out.println("La vache joue dans le pré.");
    }
}
