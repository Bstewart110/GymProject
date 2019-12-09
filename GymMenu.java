package GroupProject;

import java.text.ParseException;
import java.util.Scanner;

public class GymMenu {
    static Scanner keyboard = new Scanner(System.in);


    public static int gymChoice;
    private static int noOfPlaces;
    public static String gymChoose = "";


    protected static void showGymMenu() throws ParseException {
        System.out.println("What class would you like to book?");

        do {
            ClassList.seeClasses();
            System.out.println("Please enter the number of which class you would like to do: ");
            gymChoice = keyboard.nextInt();

            switch (gymChoice) {
                case 1:
                    gymChoose = ClassList.gym.getClassType();
                    break;
                case 2:
                    gymChoose = ClassList.swim.getClassType();
                    break;
                case 3:
                    gymChoose = ClassList.wallclimb.getClassType();
                    break;
                case 4:
                    gymChoose = ClassList.spin.getClassType();
                    break;
                case 5:
                    gymChoose = ClassList.yoga.getClassType();
                    break;
                default:
                    System.out.println("You have no entered a valid choice");
            }//switch
        }//do
        while ((gymChoice < 1) || (gymChoice > 6));

        MemberDetails.memberDetailsMenu();





        System.out.println("Thank you enjoy your session!\n\n");

    }//showGymMenu()
}//class
