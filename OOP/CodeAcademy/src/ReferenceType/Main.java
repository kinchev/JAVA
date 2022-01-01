package ReferenceType;

public class Main {
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        double lemonadePrice=lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }
    }

