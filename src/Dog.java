public class Dog extends Animal {
    public Dog(String name, int age, String owner) {
        super(name, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("J'ai mangé un OS.");
    }
}
