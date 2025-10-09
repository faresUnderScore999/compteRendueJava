public non-sealed class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void eat() {
        System.out.println("This aquatic animal eats food.");
    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habitat + ", name=" + name + "]";
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
