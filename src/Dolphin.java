public final class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eats fish!");
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
