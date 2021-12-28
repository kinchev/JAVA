package ObjectAsAParameter;

public class Main {
    public static void main(String[] args) {
        Cupcake chocolateSprinkle = new Cupcake("chocolate", true);
        Bakery myBakery = new Bakery(chocolateSprinkle, 3.25);
        System.out.println(myBakery.giveTotal);
        System.out.println(myBakery.bakeryCupcake.flavor);
        System.out.println(myBakery.price);
        System.out.println(chocolateSprinkle.flavor);
    }
}
