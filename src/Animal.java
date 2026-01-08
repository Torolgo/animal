abstract public class Animal {
    private String name;
    protected int age;
    public String owner;

    public Animal(String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void eat(Animal animal){
        System.out.println("J'ai mangé" + " " + animal.name);
    }

    protected boolean haveOwner() {
        return owner != null;
    }

    private boolean isNameValid(String potentialName) {
        return potentialName != null;
    }
}
