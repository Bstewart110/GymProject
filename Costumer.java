package Project;
import  java.util.Scanner;
import java. text.DecimalFormat;

/**
 * Created by yasser on 12/14/2019
 * Comments about program here
 */
public class Costumer {
   Scanner keyboard = new Scanner(System.in);

   //Define class variables
   private static int nextUniqueID = 1;
   DecimalFormat df = new DecimalFormat("");
   //Define instance variables
   private int costumerID;
   private String name;
   private int illness1, illness2, illness3;
   public Costumer() {
      costumerID = nextUniqueID;
      nextUniqueID = nextUniqueID + 1;
   }//Default Constructor
   public Costumer(String CostumerName) {
      costumerID = nextUniqueID;
      name = CostumerName;
      int count = 0;
      illness1 = 0;
      illness2 = 0;
      illness3 = 0;
      nextUniqueID = nextUniqueID + 1;
   }//Alternative Constructor
   public Costumer(String costumerName, int firstIllness, int secondIllness, int thirdIllness) {
      costumerID = nextUniqueID;
      name = costumerName;
      illness1 = firstIllness;
      illness2 = secondIllness;
      illness3 = thirdIllness;
      nextUniqueID = nextUniqueID + 1;
   }//Alternative Constructor

   public void setName(String costumerName) {
      name = costumerName;
   }//setName
   public void setIllness1(int firstIllness) {
      illness1 = firstIllness;
   }//setIllness
   public void setIllness2(int secondIllness) {
      illness2 = secondIllness;
   }//setIllness
   public void setIllness3(int thirdIllness) {
      illness3 = thirdIllness;
   }//setIllness

   public String getName() {
      return name;
   }//getName
   public int getIllness1() {
      return illness1;
   }//get illness1

   public int getIllness2() {
      return illness2;
   }//getIllness2

   public int getIllness3() {
      return illness3;
   }//getIllness3

   public void setIllness( int firstIllness, int secondIllness, int thirdIllness) {

      illness1 = firstIllness;
      illness2 = secondIllness;
      illness3 = thirdIllness;
   }//setIllness

   public static void printNextUniqueID() {
      System.out.println("The next available unique ID is " +
            nextUniqueID + "\n");
   }//printNextUniqueID

   public void printAllDetails() {
      double result;
      System.out.println("\nThe costumer ID is " + costumerID);
      System.out.println("The name of the costumer is " + name);
      System.out.println("The costumer's three marks are:");
      System.out.println("\t\t" + illness1);
      System.out.println("\t\t" + illness2);
      System.out.println("\t\t" + illness3);

      int count=illness1+illness2+illness3;
      if (count >20) {
         System.out.println("the costumer has heart disease ,use the machine no 1");
      }//  if
      else {
         if(20<=count && count<40) {
            System.out.println("the costumer has brain disease ,use the machine  no 2 ");
         }//if
         else {
            if (40 <= count && count < 60) {
               System.out.println("the costumer has bones disease ,use the machine no 3");
            }//if

            else {
               System.out.println("the costumer is healthy and he can use all machines");
            }//else
         }//else
      }//else
   }//printAllDetails

   public void main (String[]args){
   }


}//class