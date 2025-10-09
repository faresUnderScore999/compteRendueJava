public final class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void eat() {
        System.out.println("Penguin eats fish!");
    }
}
