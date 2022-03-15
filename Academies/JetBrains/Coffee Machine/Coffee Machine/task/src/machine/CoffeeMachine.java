package machine;

import java.util.Scanner;

public class CoffeeMachine {


    public static void action(String input) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int totalMoney = 550;

        while (!input.equals("exit")) {

            switch (input) {
                case "take":
                    System.out.printf("I gave you $%d", totalMoney);
                    totalMoney -= totalMoney;

                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");

                    water += Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffeeBeans += Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cups += Integer.parseInt(scanner.nextLine());

                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water\n", water);
                    System.out.printf("%d ml of milk\n", milk);
                    System.out.printf("%d g of coffee beans\n", coffeeBeans);
                    System.out.printf("%d disposable cups\n", cups);
                    System.out.printf("$%d of money", totalMoney);
                    break;


                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String command = scanner.nextLine();
                    switch (command) {
                        case "3":
                            if (water - 200 >= 0 && milk - 100 >= 0 && coffeeBeans - 12 >= 0 && cups - 1 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                cups -= 1;
                                totalMoney += 6;

                                break;
                            } else {
                                if (water - 200 < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk - 100 < 0) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (coffeeBeans - 12 < 0) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                            }
                            break;
                        case "2":
                            if (water - 350 >= 0 && milk - 75 >= 0 && coffeeBeans - 20 >= 0 && cups - 1 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                cups -= 1;
                                totalMoney += 7;


                                break;
                            } else {
                                if (water - 350 < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk - 75 < 0) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (coffeeBeans - 20 < 0) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                            }
                            break;
                        case "1":
                            if (water - 250 >= 0 && coffeeBeans - 16 >= 0 && cups - 1 >= 0) {

                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                coffeeBeans -= 16;
                                cups -= 1;
                                totalMoney += 4;
//                                System.out.println("The coffee machine has:");
//                                System.out.printf("%d ml of water\n", water -= 250);
//                                System.out.printf("%d ml of milk\n", milk);
//                                System.out.printf("%d g of coffee beans\n", coffeeBeans -= 16);
//                                System.out.printf("%d disposable cups\n", cups -= 1);
//                                System.out.printf("%d$ of money\n", totalMoney += 4);
                                break;

                            } else {
                                if (water - 250 < 0) {
                                    System.out.println("Sorry, not enough water!");

                                } else if (coffeeBeans - 16 < 0) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                break;
                            }


                    }
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            input = scanner.nextLine();
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = scanner.nextLine();
        action(input);

    }
}
