public abstract sealed class Animal permits Aquatic, Terrestrial {
    protected String name; // Optional common attribute

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(); // Force subclasses to implement

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }
}
