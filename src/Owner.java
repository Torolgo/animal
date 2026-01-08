import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Animal> animals;

    public Owner(String name, ArrayList<Animal> animals){
        this.name = name;
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }
}
