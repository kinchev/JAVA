package Loops;

import java.util.ArrayList;
import java.util.List;

class PrimeDirective {

    // Add your methods here:
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number == 2) {
                return true;
            } else if (number==1 || number==0) {
                return false;
            } else if (number % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }

        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(isPrime(7));
        System.out.println(isPrime(28));
        System.out.println(isPrime(2));
        System.out.println(isPrime(0));
        System.out.println(onlyPrimes(numbers));
    }

}