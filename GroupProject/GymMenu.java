package GroupProject;
//Class created by William to run through the gym menu
import java.text.ParseException;
import java.util.Scanner;

public class GymMenu {
    static Scanner keyboard = new Scanner(System.in);


    //declaring variables
    public static int gymChoice;
    public static String gymChoose = "";


    //showGymMenu method to display the menu to select a class to attend
    protected static void showGymMenu() throws ParseException {
        System.out.println("What class would you like to book?");

        do {
            ClassList.seeClasses();
            System.out.println("Please enter the number of which class you " +
                    "would like to do: ");
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
                    showGymMenu();
                    break;
            }//switch
        }//do
        while ((gymChoice < 1) || (gymChoice > 6));

        //starts memberDetailsMenu to store new member details
        MemberDetails.memberDetailsMenu();



        System.out.println("Thank you enjoy your session!\n\n");

    }//showGymMenu()
}//class
