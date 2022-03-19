package calculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String cleanAllUnnecessaryFromInput(String input) {

        Pattern extraSpace = Pattern.compile("\\s+");
        Matcher matchSpace = extraSpace.matcher(input);
        input = matchSpace.replaceAll(" ");


        Pattern patternPlus = Pattern.compile("\\+{2,}");
        Matcher matcherPlus = patternPlus.matcher(input);
        input = matcherPlus.replaceAll("+");

        Pattern patternTripleMinus = Pattern.compile("-{3}");
        Matcher matcherTripleMinus = patternTripleMinus.matcher(input);
        input = matcherTripleMinus.replaceAll("-");

        Pattern patternDoubleMinus = Pattern.compile("-{2}");
        Matcher matcherDoubleMinus = patternDoubleMinus.matcher(input);
        input = matcherDoubleMinus.replaceAll("+");

        Pattern patternStartByMINUS = Pattern.compile("\\b-.*?");
        Matcher matcherStartByMINUS = patternStartByMINUS.matcher(input);
        //Will replace - by 0 -.
        input = matcherStartByMINUS.replaceFirst("0 - ");

        Pattern finalCheck = Pattern.compile("(-\\+|\\+-)");
        Matcher finalMatch = finalCheck.matcher(input);
        //Will replace -+ by -.
        input = finalMatch.replaceAll("-");
        return input;


    }

    public static void checkInput(String input) {
        try{

        }catch(Exception e){
            System.out.println("Unknown command");
        }

        if (input.startsWith("/") && !input.equals("/exit") && !input.equals("/help")) {
            System.out.println("Unknown command");

        } else {


            Pattern pattern=Pattern.compile("^[0-9]");
            Matcher matcher=pattern.matcher(input);
            for (int i = 0; i <input.length(); i++) {
                if (!matcher.matches()) {
                    System.out.println("Invalid expression");
                    break;
                }
            }
        }
    }

    public static void calculator(String input) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("/exit")) {
            checkInput(input);
            if (input.equals("/help")) {
                System.out.println("The program support the:" +
                        "\nAddition + and Subtraction - operators:" +
                        "\nConsider that the even number of minuses gives a plus," +
                        "\nand the odd number of minuses gives a minus! Look at it this way:" +
                        "\n2 -- 2 equals 2 - (-2) equals 2 + 2.");

            } else if (input.equals("")) {


            } else {

                String[] arr = cleanAllUnnecessaryFromInput(input).split(" ");
                checkInput(arr[0]);
                sum = Integer.parseInt(arr[0]);

                for (int i = 1; i < arr.length; i += 2) {
                    if (arr[i].equals("-")) {
                        sum -= Integer.parseInt(arr[i + 1]);

                    } else {
                        sum += Integer.parseInt(arr[i + 1]);

                    }
                }
                System.out.println(sum);


            }
            input = scanner.nextLine();
        }
        System.out.println("Bye!");

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        calculator(input);

    }


}
