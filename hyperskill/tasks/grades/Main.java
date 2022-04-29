package hyperskill.tasks.grades;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int gradeD = 0;
        int gradeC = 0;
        int gradeB = 0;
        int gradeA = 0;
        for (int i = 0; i < count ; i++) {
            String grade = scanner.next();
            switch (grade) {
                case "A" -> gradeA++;
                case "B" -> gradeB++;
                case "C" -> gradeC++;
                case "D" -> gradeD++;
                default -> throw new IllegalStateException("Unexpected value: " + grade);
            }
        }
        System.out.printf("%d %d %d %d", gradeD, gradeC, gradeB, gradeA);
    }
}
