package GymProject;
import java.util.Scanner;

/**
 * Created by User on 30/11/2019
 * Simple log in method
 */
public class LogIn {

   static Scanner keyboard = new Scanner (System.in);

   protected static void logIn() {

      String passwordSet = "examplegym";
      String usernameSet = "examplegym";

      System.out.println("Enter login username : ");
      String usernameAttempt = keyboard.next();

      System.out.println("Enter Password : ");
      String password = keyboard.next();
      do {
         if
         (usernameAttempt.equals(usernameSet) && password.equals(passwordSet))
            System.out.println("Log in successful.\nWelcome!");

         if ((!usernameAttempt.equals(usernameSet) || (!password.equals(passwordSet)))) {
            System.out.println("Incorrect Username or Password!");

            System.out.println("Enter Username : ");
            usernameAttempt = keyboard.next();

            System.out.println("Enter Password : ");
            password = keyboard.next();
         }//if

      }//do
    while (((!usernameAttempt.equals(usernameSet) || (!password.equals(passwordSet)))));
   }//logIn
}//class



