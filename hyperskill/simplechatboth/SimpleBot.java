package hyperskill.simplechatboth;

import java.util.Scanner;

import static java.lang.System.out;

public class SimpleBot {
    static final Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        out.println("Hello! My name is " + assistantName + ".");
        out.println("I was created in " + birthYear + ".");
        out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        out.println("Let me guess your age.");
        out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            out.printf("%d!\n", i);
        }
    }

    static void test() {
        out.println("Let's test your programming knowledge.");
        out.println("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                break;
            } else {
                out.println("Please, try again.");
            }
        }
    }

    static void end() {
        out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}

