public class ZooTest {
    public static void main(String[] args) {

        // Using parametrized constructors
        Aquatic a = new Aquatic("Ocean");
        Terrestrial t = new Terrestrial(4);
        Dolphin d = new Dolphin("Sea", 25.5f);
        Penguin p = new Penguin("Antarctica", 50.0f);

        // Display Objects
        System.out.println(a);
        System.out.println(t);
        System.out.println(d);
        System.out.println(p);

        // Swim behavior
        a.swim();
        d.swim();
        p.swim();
    }
}
