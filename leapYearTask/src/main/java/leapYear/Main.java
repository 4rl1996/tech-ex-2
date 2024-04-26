package leapYear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LeapYearProcessor leapYearProcessor = new LeapYearProcessor();
        while (true) {
            System.out.println("Введите год, начиная с 1 года Н.Э.");
            final int year = scanner.nextInt();
            if (year < 1) {
                System.out.println("Введена дата до 1 года Н.Э.");
                return;
            }
            System.out.println("Год является високосным: " + leapYearProcessor.isLeapYear(year));
        }
    }
}
