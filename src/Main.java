import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Part 1
        Cow cow = new Cow("Michelle", 12, "Nathan");
        System.out.println(cow.getName() + " " + cow.age);

        // Part 2
        cow.makeSound();
        System.out.println(Animal.isCow(cow));

        // Part 3
        Dog dog = new Dog("Milou", 8, "Loic");
        cow.eat();
        dog.eat();

        // Part 4
        dog.eat();
        cow.eat(dog);

        // Part 5
        // L'attribut est "private" je n'ai pas accès à name de cette manière
        System.out.println(dog.name);
        // On utilise donc le getter pour pouvoir l'obtenir
        System.out.println(dog.getName());
        // L'attribut est "protocted" j'y ai donc accès car mon main est dans le même package que la class
        System.out.println(dog.age);
        // L'attribut est accessible de n'importe où
        System.out.println(dog.owner);

        // La méthode est public on y a donc accès de n'importe où
        cow.eat(dog);
        // La méthode est protected elle est donc acessible car nous sommes dans le même src
        System.out.println(cow.haveOwner());
        // La méthode est private (nous avons une erreur), nous n'y avons pas accès
        System.out.println(cow.isNameValid());

        // Part 6
        dog.play();

        // Part 7
        Pet pet1 = new Cow("vache", 23, "Romain");
        pet1.play();
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(dog);
        pets.add(cow);
        for(Pet pet : pets){
            pet.play();
        }

        // Part 8
        Cat cat = new Cat("Azrael", 14, "Nathan");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cow);
        animals.add(dog);
        animals.add(cat);
        Owner owner = new Owner("Gauthier", animals);
        System.out.println(owner.getAnimals());
        // La class est abstraite ne peut pas être instancier, nous avons donc une erreur
        Animal animal = new Animal("Noah", 19, "Léna");
        cat.hunt();
        cat.play();
    }
}