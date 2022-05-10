package TurroApp;

import java.util.Scanner;

public class date_Time {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome dear customer.");
        System.out.println("In what period you want to pick up the vehicle," + " Please enter: Weekday / Saturday / Sunday ?");
        String day = sc.nextLine();

        String week1 = "Weekday", sat = "Saturday", sun = "Sunday";

        if(day.equals(week1)){
            System.out.println("You can pick up the vehicle within 24hr.");
        }else if(day.equals(sat)){
            System.out.println("You can pick up the vehicle from 6am to 4pm.");
        }else{
            System.out.println("The office is closed");
        }




    }
    }

