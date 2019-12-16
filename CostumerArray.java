package Project;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Created by yasser on 12/14/2019
 * Comments about program here
 */
public class CostumerArray {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      // Declare an array capable of holding 6 costumers objects
      int count;
      final int SIZE = 3;
      String name;
      int firstIllness, secondIllness, thirdIllness;
      String costumer ;
      Costumer[] mycostumer = new Costumer[SIZE];
      // Create 3 new costumers objects
      for (int count1= 0; count1 < SIZE; count1++) {
         // Prompt for and read in the costumer name
         System.out.print("Enter costumer name: ");
         name = keyboard.nextLine();
         // Create a new instance of a costumer object
         mycostumer[count1] = new Costumer(name);
      }
      System.out.println("__________________");
         for (int count1 = 0; count1 < SIZE; count1++) {

            System.out.println("Enter first illness for " + mycostumer[count1].getName() + ": ");
            firstIllness = keyboard.nextInt();
            System.out.println("Enter second illness for " + mycostumer[count1].getName() + ":");
            secondIllness = keyboard.nextInt();
            System.out.println("Enter third illness for " + mycostumer[count1].getName() + ": ");
            thirdIllness = keyboard.nextInt();
            // Assign marks to costumer
            mycostumer[count1].setIllness(firstIllness,secondIllness,thirdIllness);
         }
         // Output details of all costumers
          for (int count1 = 0; count1 < SIZE; count1++) {
         mycostumer[count1].printAllDetails();
         System.out.println("----------------");
      }//for

   }//main
}//class
