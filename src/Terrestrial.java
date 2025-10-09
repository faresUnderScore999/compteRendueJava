public non-sealed class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eat() {
        System.out.println("This terrestrial animal eats plants or meat.");
    }

    @Override
    public String toString() {
        return "Terrestrial [nbrLegs=" + nbrLegs + "]";
    }
}
