public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial [nbrLegs=" + nbrLegs + "]";
    }
}
