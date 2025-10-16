package prosit_1.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    
    public Zoo( String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getNbrCages() {
        return nbrCages;
    }
public boolean addAnimal(Animal a) {
    for(int i = 0; i < animals.length; i++) {
        if(animals[i] == null) {
            animals[i] = a;  // ✅ Actually adds the animal
            return true;
        }
    }
    return false;  // ✅ No space available
}
        // Méthode display
    public void displayZoo() {
        System.out.println("Zoo: " + name + ", City: " + city + ", Number of cages: " + nbrCages);
        System.out.println("Animals in the zoo:");
        for(Animal a : animals) {
            if(a != null) a.displayAnimalInfo();
        }
    }


@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Zoo [name=").append(name)
      .append(", city=").append(city)
      .append(", nbrCages=").append(nbrCages)
      .append(", animals=[");

    for (Animal a : animals) {
        if (a != null) {
            sb.append(a.toString()).append(", ");
        }
    }
    // Remove last comma and space if there is at least one animal
    if (sb.lastIndexOf(", ") > 0) {
        sb.delete(sb.lastIndexOf(", "), sb.length());
    }

    sb.append("]]");
    return sb.toString();
}

}
