package ObjectAsAParameter;

public class Bakery {
    Cupcake bakeryCupcake;
    double price;
    String giveTotal;

    public Bakery(Cupcake cupcakeType, double priceOf) {
        Cupcake copy=new Cupcake(cupcakeType);
        bakeryCupcake = copy;
        price = priceOf;
        bakeryCupcake.flavor="vanilla";
        giveTotal = "The " + bakeryCupcake.flavor + " cupcake is $" + price;
    }
}
