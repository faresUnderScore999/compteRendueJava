public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {}

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin [habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + "]";
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
