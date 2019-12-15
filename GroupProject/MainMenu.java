package GroupProject;

//Created by William Main menu class where user selecets whether to book a
// class, retrieve a lost pass or sign out.

import java.text.ParseException;
import java.util.Scanner;

public class MainMenu {
    static Scanner keyboard = new Scanner(System.in);

    //declaring variable
    private static int userOption;

    //method to start the menu
    public static void startUpMenu() throws ParseException {

        do{
            System.out.println("Welcome to Ulster Gym");
            System.out.println("What would you like to do today");
            System.out.println("1. Book a class or gym session");
            System.out.println("2. Retrieve a lost pass");
            System.out.println("3. Log out");
            System.out.println("Please enter your choice: ");
            userOption = keyboard.nextInt();

            switch(userOption){
                case 1:
                    GymMenu.showGymMenu();
                    break;
                case 2:
                    System.out.println("Lost pass");
                    String input;
                    char letter;
                    System.out.println("Are you a Student?: (Y/N) ");
                    input = keyboard.next();
                    letter = input.charAt(0);
                    if((letter == 'Y') || (letter == 'y')) {
                        MemberDetails.viewStudents();
                    }//if
                    else {
                        if((letter == 'N') || (letter == 'n')) {
                            MemberDetails.viewAdults();
                        }//if
                        else {
                            System.out.println("Invalid reply. " +
                                    "Please enter Y/N.");
                        }
                    }//else
                    break;
                case 3:
                    System.out.println("Thank you for using Ulster Gym!");
                    break;
                default:
                    System.out.println("Please Enter a Valid option");
                    System.out.println("===========================");
            }//switch

        } while (userOption != 3);

    }//StartUpMenu
}//class
