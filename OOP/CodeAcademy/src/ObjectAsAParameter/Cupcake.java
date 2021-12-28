package ObjectAsAParameter;

public class Cupcake {
    String flavor;
    boolean sprinkles;

    public Cupcake(String type, boolean hasSprinkles) {
        this.flavor = type;
        this.sprinkles = hasSprinkles;
    }

    public Cupcake(Cupcake copy) {
        flavor = copy.flavor;
        sprinkles = copy.sprinkles;
    }
}
