package ReferenceType;

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        price = price + priceToAdd;
    }
    public double getPriceWithTax(){
        return price+price*0.08;
    }

    @Override
    public String toString() {
        return "This store sells "+ productType +" at a price of "+price+".";
    }
}