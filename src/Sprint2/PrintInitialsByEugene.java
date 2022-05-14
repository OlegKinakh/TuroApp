package Sprint2;

import java.util.Scanner;

public class PrintInitialsByEugene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first = sc.next();

        first = first.toUpperCase();

        System.out.print("Enter your last name: ");
        String last = sc.next();

        last = last.toUpperCase().substring(0, 1);
        System.out.println("Your initials are " + first.charAt(0) + last);
    }
}