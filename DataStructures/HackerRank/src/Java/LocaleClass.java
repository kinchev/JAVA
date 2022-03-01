package Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LocaleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat lp;  //Local Payment

        lp = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(new Locale("en", ""));
        System.out.println("India: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + lp.format(payment));
    }
    }

