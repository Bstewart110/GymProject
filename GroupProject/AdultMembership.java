package GroupProject;

//Class created by Kevin to define adultMembership

public class AdultMembership extends Membership {

    //class variable
    private static int numberOfAdults = 0;

    //instance variables
    private String occupation;

    //constructors
    public AdultMembership() {
        super();
        numberOfAdults++;
    }//default Constructor

    public AdultMembership(String adultType, String adultName, String adultDOB,
                           String adultAddress, String adultEmail,
                           String pOccupation, String adultClassChosen) {
        super(adultType, adultName, adultDOB, adultAddress, adultEmail,
                adultClassChosen);
        occupation = pOccupation;
        numberOfAdults++;
    }//alternate Constructor

    //get and set methods
    protected void setOccupation(String pOccupation) {
        occupation = pOccupation;
    }//setOccupation

    protected String getOccupation() {
        return occupation;
    }//getOccupation

    protected String getStatus() {
        return type;
    }//getStatus

    protected static int getNumberOfAdults() {
        return numberOfAdults;
    }//getNumberOfAdults

    public String toString() {
        String message;
        message = name + "'s pass Details\n" +
                "==================================================\n" +
                "Name:\t\t\t\t" + name + "\n" +
                "MembershipID:\t\t" + memberID + "\n" +
                "Type of membership:\t" + type + "\n" +
                "Cost:\t\t\t\t" + df.format(cost) + "\n" +
                "You have chosen to attend a " + classChosen + " class today\n";

        message = message +
                "==================================================\n";
        return message;
    }//toString
}//class


