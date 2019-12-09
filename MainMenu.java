package GroupProject;

import java.text.ParseException;
import java.util.Scanner;

public class MainMenu {
    static Scanner keyboard = new Scanner(System.in);

    private static int userOption;



    public static void startUpMenu() throws ParseException {

        do{

            System.out.println("Welcome to Ulster Gym");
            System.out.println("What would you like to do today");
            System.out.println("1. Book a class or gym session");
            System.out.println("2. Passes printed today");
            System.out.println("3. Log out");
            System.out.println("Please enter your choice: ");
            userOption = keyboard.nextInt();

            switch(userOption){
                case 1:
                    GymMenu.showGymMenu();
                    break;
                case 2:
                    System.out.println("Today's Passes");
                    MemberDetails.viewStudents();
                    MemberDetails.viewAdults();
                    break;
            }

        } while (userOption != 3);

    }


}
