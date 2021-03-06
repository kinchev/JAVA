/*The printer queue is a simple way to control the order of files sent to a printer device.
 We know that a single printer can be shared between multiple devices.
 So to preserve the order of the files sent, we can use queue.
 Write down a program which takes filenames until "print" command is received.
 Then as output print the filenames in the order of printing.
 Some of the tasks may be canceled if you receive "cancel" you have to remove the first file to be printed.
 If there is no current file to be printed print "Printer is on standby
 */


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> print = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (print.size() < 1) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled" + " " + print.pollFirst());
                }

            } else {
                print.offer(input);
            }


            input = scanner.nextLine();
        }
        print.forEach(System.out::println);
        }
    }

