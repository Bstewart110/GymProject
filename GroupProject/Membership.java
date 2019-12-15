package GroupProject;

//Class created by William which is the abstract super class from which
// membership objects are created.
import java.text.DecimalFormat;

abstract public class Membership {

    //setting deciaml format for cost output in string
    DecimalFormat df = new DecimalFormat("00.00");


    //class variable
    private static int nextMemberID = 101;

    //instance variables
    protected String type;  //student or adult membership
    protected String name;
    private String DOB;
    private String address;
    private String email;
    protected int memberID;
    double cost = 30.00;
    String classChosen = "";

    //constructors
    public Membership() {
        memberID = nextMemberID++;
    }//default constructor

    public Membership(String mType, String mName, String mDOB, String mAddress,
                      String mEmail, String mClassChosen) {
        type = mType;
        name = mName;
        DOB = mDOB;
        address = mAddress;
        email = mEmail;
        classChosen = mClassChosen;
        memberID = nextMemberID++;

    }//alternate constructor


    //set and Get methods

    protected int getID() {
        return memberID;
    }//getID


    protected void setType(String mType) {
        type = mType;
    }//setType

    protected String getType() {
        return type;
    }//getType

    protected void setName(String mName) {
        name = mName;
    }//setName

    protected String getName() {
        return name;
    }//getName

    protected void setDOB(String mDOB) {
        DOB = mDOB;
    }//setDOB

    protected String getDOB() {
        return DOB;
    }//getDOB

    protected void setAddress(String mAddress) {
        address = mAddress;
    }//setAddress

    protected String getAddress() {
        return address;
    }//getAddress

    protected void setEmail(String mEmail) {
        email = mEmail;
    }//setEmail

    protected String getEmail() {
        return email;
    }//getEmail


    //Abstract method to be defined in Subclasses
    abstract protected String getStatus();

    abstract public String toString();
    //abstract toString

}//class

//This was our first attempt of selecting class stored in an array however we
// later changed it.
//    protected void chooseGymClasses() {
//
//        String [] gymClasses = {"Spin", "Circuits", "Yoga", "Zumba"};
//
//        String chosenClass = "";
//        int choice;
//        do {
//            System.out.println("\n1. " + gymClasses[0]);
//            System.out.println("2. " + gymClasses[1]);
//            System.out.println("3. " + gymClasses[2]);
//            System.out.println("4. " + gymClasses[3]);
//            System.out.println("5.  Exit");
//            System.out.print("\nPlease enter your choice: ");
//            choice = keyboard.nextInt();
//            switch (choice) {
//                case 1:
//                    chosenClass = gymClasses[0];
//                    System.out.println("You have choosen to attend a " +
//                    chosenClass + " class\nChoose another class or press 5
//                    to logout");
//                    break;
//                case 2:
//                    chosenClass = gymClasses[1];
//                    System.out.println("You have choosen to attend a " +
//                    chosenClass + " class\nChoose another class or press 5
//                    to logout");
//                    break;
//                case 3:
//                    chosenClass = gymClasses[2];
//                    System.out.println("You have choosen to attend a " +
//                    chosenClass + " class\nChoose another class or press 5
//                    to logout");
//                    break;
//                case 4:
//                    chosenClass = gymClasses[3];
//                    System.out.println("You have choosen to attend a " +
//                    chosenClass + " class\nChoose another class or press 5
//                    to logout");
//                    break;
//                case 5:
//                    System.out.println("You have logged out");
//                    break;
//                default:
//                    System.out.println("invalid Choice");
//
//            }//switch
//
//        } while