package GymProject;

/**
 * Created by mcale_000 on 28/11/2019
 * class to define adult membership
 */
public class AdultMembership extends Membership {

   //class variable
   private static int nextAdultID = 101;
   private static int numberOfAdults = 0;

   //instance variables
   private String iDString = "AD";
   private String adultID;
   private String occupation;
   private String password;

   public AdultMembership() {
      super();
      adultID = iDString + nextAdultID;
      nextAdultID = nextAdultID + 1;
      numberOfAdults++;
   }//default Constructor

   public AdultMembership(String adultType, String adultName, String adultDOB, String adultAddress, String adultEmail, String pOccupation, String adultPassword) {
      super(adultType, adultName, adultDOB, adultAddress, adultEmail);
      occupation = pOccupation;
      adultID = iDString + nextAdultID;
      password = adultPassword;
      nextAdultID = nextAdultID + 1;
      numberOfAdults++;
   }//alternate Constructor

   //get and set methods
   protected String getID() {
      return adultID;
   }//getID

   protected void setOccupation(String pOccupation) {
      occupation = pOccupation;
   }//setOccupation

   protected String getOccupation() {
      return occupation;
   }//getOccupation

   protected String getStatus() {
      return type;
   }//getStatus

   public String toString() {
      String message;
      message = adultID + "'s Membership Details\n" +
            "===============================\n" +
            "Name:\t\t\t\t" + name + "\n" +
            "MembershipID:\t\t" + adultID + "\n" +
            "Type of membership:\t" + type + "\n" +
            "Cost:\t\t\t\t" + df.format(COST) + "\n";

      message = message + "=============================================\n";
      return message;
   }//toString

   protected static int numberOfAdults() {
      return numberOfAdults;
   }//numberOfAdults

   protected void logIn() {

      System.out.println("Enter login username: ");
      String usernameAttempt = keyboard.nextLine();

      System.out.println("Enter password: ");
      String passwordAttempt = keyboard.nextLine();


      do {
         if (usernameAttempt.equals(adultID) && (passwordAttempt.equals(password))) {
            System.out.println("Log in successful");
         }//if
         else {
            if ((usernameAttempt.equals(adultID)) || (passwordAttempt.equals(password))) {
               System.out.println("Incorrect Username or Password!");
               System.out.println("Try again");
            }//if
            System.out.println("Enter login username: ");
            usernameAttempt = keyboard.nextLine();

            System.out.println("Enter password: ");
            passwordAttempt = keyboard.nextLine();
            System.out.println("Log in successful");
         }//else

      }//do
      while (((!usernameAttempt.equals(adultID) || (!passwordAttempt.equals(password)))));


      }//logIn
   }//class
