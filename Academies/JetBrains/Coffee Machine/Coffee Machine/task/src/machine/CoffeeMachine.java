package machine;

import java.util.Scanner;

public class CoffeeMachine {
       public  static void coffeeRecipe(int cupsOfCoffee){
           System.out.printf("For %s cups of coffee you will need:\n",cupsOfCoffee);
           int waterNeeded=200*cupsOfCoffee;
           int milkNeeded=50*cupsOfCoffee;
           int coffeeBeans=15*cupsOfCoffee;
           System.out.printf("%d ml of water\n%d ml of milk\n%d g of coffee beans",waterNeeded,milkNeeded,coffeeBeans);


       }
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cupOfCoffee = scanner.nextInt();
        System.out.println();
        coffeeRecipe(cupOfCoffee);


    }
}
