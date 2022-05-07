import java.util.Locale;
import java.util.Scanner;

public class CarModel {
//    User Should enter  car year, car brand(Toyota, Mercedes), car color
//
//    If the car is available to print it, “the car is available and the vehicle specifications,”
//
//    If the year is before 2010 the car is unavailable
//
//    If the car is A Porche or a Lamborghini, the car is unavailable.
//
//    Make sure to print all details about the car in every message.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInv = {"2022 Honda Civic Blue", "2020 Toyota Camry Silver", "2021 Audi Q7 Black", "2018 BMW X5 Red", "2019 Mercedes S550 Pearl", "2016 Cadillac Escalade White", "2017 GMC Denali Black"};
        int year = 0;
        String make = "", model = "", color = "";
        boolean haveInv = false;
        System.out.println("Please enter in a year");
        year = scanner.nextInt();
        System.out.println("Please enter in a Make");
        make = scanner.next();
        System.out.println("Please enter in a Model");
        model = scanner.next();
        System.out.println("Please enter in a color");
        color = scanner.next();
        String userSelection = "" + year + " " + make + " " + model + " " + color;


        if (year < 2010) {
            System.out.println("Sorry year is too old");
        } else {
            if (make.toLowerCase(Locale.ROOT).equals("Porche".toLowerCase(Locale.ROOT)) || make.toLowerCase(Locale.ROOT).equals("Lamborghini".toLowerCase(Locale.ROOT))) {
                System.out.println("the car is unavailable, Please select another vehicle!");
            } else {
                for (int i = 0; i < carInv.length; i++) {
                    if (carInv[i].toLowerCase(Locale.ROOT).equals(userSelection.toLowerCase(Locale.ROOT))) {
                        haveInv = true;
                    }
                }
                if (haveInv) {
                    System.out.println("This vehicle is available, You have selected " + userSelection);
                } else {
                    System.out.println("The car is unavailable");
                }

            }


        }
    }
}