public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {}

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin [habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + "]";
    }
}
