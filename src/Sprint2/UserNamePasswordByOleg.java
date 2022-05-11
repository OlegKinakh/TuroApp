package Sprint2;

import java.util.Scanner;

public class UserNamePasswordByOleg {
    public static void main(String[] args) {
        //Initializing and declaring correct username and password;
        // final String means the value won't be able to be modified

        final String correctUsername = "UserName";
        final String correctPassword = "PassWord";

        //Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        //Asking for username
        System.out.print("Enter Username: ");
        //Storing users username
        String username = sc.next();

        //Asking for password
        System.out.print("Enter Password ");
        //Storing users password
        String password = sc.next();

        //Condition to check if username and password is correct

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Login Successful");
        }else if(username.equals(correctUsername)){
            System.out.println("Invalid password");
        }else if(password.equals(correctPassword)){
            System.out.println("Invalid username");
        }else{
            System.out.println("Login unsuccessful");
        }




    }
}
