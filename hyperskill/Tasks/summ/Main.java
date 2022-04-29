package hyperskill.Tasks.summ;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int summ = 0;
        for (int i = a; i <= b; i++) {
            summ += i;
        }
        System.out.print(summ);  // b * (b + 1) / 2 - a * (a - 1) / 2
    }
}
