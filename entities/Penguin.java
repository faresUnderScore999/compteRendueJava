package entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    // Constructeur par défaut
    public Penguin() {
    }

    // Constructeur paramétré
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
     public void swim() {
        System.out.println("The penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }
}

