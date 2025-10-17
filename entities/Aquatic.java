package entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    // Constructeur par défaut
    public Aquatic() {
    }

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    abstract void swim() ;
    public static void addAquatic(Aquatic[] t,Aquatic a){
        for (int i = 0; i < t.length; i++) {
            if (t[i] == null) {
                t[i] = a;
                break;
            }
        }
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        if (o.getClass() == Aquatic.class ) {
            Aquatic other = (Aquatic) o;
            return this.getName().equals(other.getName()) && this.getFamily().equals(other.getFamily());

        }
        return false;
    }
}
