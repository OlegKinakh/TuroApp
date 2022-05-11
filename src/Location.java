import java.util.Scanner;
//    User Should enter  either of 3 cities, Chicago Los Angeles, New York
//
//    If location is available it should print out the following options:
//    Chicago     we expect to see output as (O’Hare Airport || Midway-AirPort)
//    Los Angeles     we expect to see output as (LAX || Santa Ana)
//    New York       we expect to see output as (JFK || La Guardia)
//    For everything else show unavailable

public class Location{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a city of pick up");
        String location = input.nextLine();
        if (location.equals("Chicago")) {
            System.out.println("Location available - O’Hare Airport || Midway-AirPort");
        } else if (location.equals("Los Angeles")) {
            System.out.println("Location available - LAX || Santa Ana");
        } else if(location.equals("New York")){
            System.out.println("Location available - JFK || La Guardia");
        } else{
            System.out.println("Location unavailable");
        }
    }
}

