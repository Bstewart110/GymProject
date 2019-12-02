package GroupProject;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

abstract public class Membership {

    DecimalFormat df = new DecimalFormat("00.00");
    Scanner keyboard = new Scanner(System.in);

    //instance variables
    String type;  //student or adult membership
    String name;
    private String DOB;
    private String address;
    private String email;

    final double COST = 30.00;

    public Membership () {
    }//default constructor

    public Membership(String mType, String mName, String mDOB, String mAddress, String mEmail){
        type = mType;
        name = mName;
        DOB = mDOB;
        address = mAddress;
        email = mEmail;
    }//alternate constructor



    //set and Get methods
    protected void setType(String mType){
        type = mType;
    }//setType

    protected String getType(){
        return type;
    }//getType

    protected void setName(String mName) {
        name = mName;
    }//setName

    protected String getName(){
        return name;
    }//getName

    protected void setDOB(String mDOB) {
        DOB = mDOB;
    }//setDOB

    protected String getDOB () {
        return DOB;
    }//getDOB

    protected void setAddress(String mAddress){
        address = mAddress;
    }//setAddress

    protected String getAddress(){
        return address;
    }//getAddress

    protected void setEmail(String mEmail){
        email = mEmail;
    }//setEmail

    protected String getEmail(){
        return email;
    }//getEmail




    //Abstract method to be defined in Subclasses
    abstract protected String getStatus();

    abstract public String toString();
    //abstract toString

    abstract protected void logIn();
    //abstract login method



    protected void chooseGymClasses() {

        String [] gymClasses = {"Spin class", "Circuits", "Yoga", "Zumba"};

        String chosenClass = "";
        int choice;
        do {
            System.out.println("\n1.  Spin");
            System.out.println("2.  Circuits");
            System.out.println("3.  Yoga");
            System.out.println("4.  Zumba");
            System.out.println("5.  Exit");
            System.out.print("\nPlease enter your choice: ");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    chosenClass = gymClasses[0];
                    System.out.println("You have choosen to attend a " + chosenClass + " class\nChoose another class or press 5 to logout");
                    break;
                case 2:
                    chosenClass = gymClasses[1];
                    System.out.println("You have choosen to attend a " + chosenClass + " class\nChoose another class or press 5 to logout");
                    break;
                case 3:
                    chosenClass = gymClasses[2];
                    System.out.println("You have choosen to attend a " + chosenClass + " class\nChoose another class or press 5 to logout");
                    break;
                case 4:
                    chosenClass = gymClasses[3];
                    System.out.println("You have choosen to attend a " + chosenClass + " class\nChoose another class or press 5 to logout");
                    break;
                case 5:
                    System.out.println("You have logged out");
                    break;
                default:
                    System.out.println("invalid Choice");

            }//switch

        } while (choice != 5);

    }//chooseGymClass







}//class
