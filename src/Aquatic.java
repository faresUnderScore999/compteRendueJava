public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habitat + "]";
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
