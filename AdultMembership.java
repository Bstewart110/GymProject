package GymProject;

/**
 * Created by mcale_000 on 28/11/2019
 * class to define adult membership
 */
public class AdultMembership extends Membership {

   //class variable
   private static int nextAdultID = 1;
   private static int numberOfAdults = 0;

   //instance variables
   private int adultID;
   private String occupation;

   public AdultMembership() {
      super();
      adultID = nextAdultID;
      nextAdultID = nextAdultID++;
      numberOfAdults++;
   }//default Constructor

   public AdultMembership(String adultType, String adultName, String adultDOB, String adultAddress, String adultEmail, double adultCost, int pAdultID, String pOccupation) {
      super(adultType, adultName, adultDOB, adultAddress, adultEmail, adultCost);
      adultID = pAdultID;
      occupation = pOccupation;
      adultID = nextAdultID;
      nextAdultID = nextAdultID++;
      numberOfAdults++;
   }//alternate Constructor

   //get and set methods
   protected int getID() {
      return adultID;
   }//getID

   protected void setOccupation(String pOccupation) {
      occupation = pOccupation;
   }//setOccupation

   protected String getOccupation() {
      return occupation;
   }//getOccupation

   protected String getStatus() {
      return "adult member";
   }//getStatus

}//class
