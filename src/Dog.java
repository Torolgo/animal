public class Dog extends Animal implements Pet{
    public Dog(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("J'ai mangé un OS.");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " joue avec "  + this.owner);
    }
}
