package GymProject;
import java.util.Scanner;

/**
 * Created by kmca on 30/11/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestMembership {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      LogIn.logIn();

      int menuInput;
      do {
         System.out.println("\n==============================================\n\t\t\tYOU ARE NOW USING\n\t\t\t-==EXAMPLE GYM==-\t");
         System.out.println("==============================================");
         System.out.println("\n1:");
         System.out.println("2:");
         System.out.println("3:");
         System.out.println("4:");
         System.out.println("5 ");
         System.out.println("6:");
         System.out.println("7: Exit the program");
         System.out.println("8:");
         System.out.println("9:");
         System.out.print("\nPlease enter a number from the menu: ");
         menuInput = keyboard.nextInt();

         switch (menuInput) {
            case 1:

               break;//case 1

            case 2:

               break; //case 2

            case 3:

               break; //case 3

            case 4:

               break;//case 4

            case 5:

               break; // case 5

            case 6:


               break;//case 6

            case 7:
               System.out.println("Leaving main menu - thank you for using  -==EXAMPLE GYM ==-");
               break;

            default:
               System.out.println("Number not valid, try entering a number from the menu");
               break;
         }//switch
      } while (menuInput != 7);


   }//main
}//class
