public class Cat extends Animal implements Pet, Wild {
    public Cat(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void play() {
        System.out.println("Le chat joue avec son maître.");
    }

    @Override
    public void hunt() {
        System.out.println("Le chat mange la souris.");
    }
}
