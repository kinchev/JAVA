package Loops;

import java.util.ArrayList;

public class Coffee {
   public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        for (int i = 0; i < lunchBox.size(); i++) {
            if(lunchBox.get(i).equals("ant")){
                lunchBox.remove(lunchBox.get(i));
            }

        }
return lunchBox;

    }
    public static void main(String[] args) {
        int cupsOfCoffee = 1;
        while (cupsOfCoffee <= 100) {
            System.out.printf("Fry drinks cup of coffee %s", cupsOfCoffee);
            cupsOfCoffee++;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
            cupsOfCoffee++;
        }
        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        for (int i = 0; i < expenses.size(); i++) {
            total += expenses.get(i);
        }


        System.out.println(total);

        for (int i = 0; i < 100; i++) {
            if(i%5!=0){
                continue;
            }
            System.out.println(i);
        }

        ArrayList<Double> expenses_ = new ArrayList<Double>();
        expenses_.add(74.46);
        expenses_.add(63.99);
        expenses_.add(10.57);
        expenses_.add(81.37);

        double mostExpensive = 0;

        // Iterate over expenses
        for (Double aDouble : expenses_) {
            
        }

        System.out.println(mostExpensive);



        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);
    }

}
