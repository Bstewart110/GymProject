package GroupProject;
import java.util.Scanner;

/**
 * Created by pg19brc on 29/11/2019
 * Class to define Employee membership
 */
abstract class Employee extends Membership {
    Scanner keyboard = new Scanner(System.in);

    //class variable
    private static int nextEmployeeID = 101;
    private static int numberOfEmployees = 0;

    //instance variables
    private String iDString = "EMP";
    private String employeeID;
    private String fullOrPart;
    private String password;

    public Employee() {
        super();
        employeeID = iDString + nextEmployeeID;
        nextEmployeeID = nextEmployeeID + 1;
        numberOfEmployees++;
    }//default constructor

    public Employee(String empType, String empName, String empDOB, String empAddress, String empEmail, String empFullOrPart, String empPassword) {
        super(empType, empName, empDOB, empAddress, empEmail);
        fullOrPart = empFullOrPart;
        employeeID = iDString + nextEmployeeID;
        password = empPassword;
        nextEmployeeID = nextEmployeeID + 1;
        numberOfEmployees++;
    }//alternative constructor

    //get and set methods
    protected String getID() {
        return employeeID;
    }//getID

    protected String getStatus() {
        return type;
    }//getStatus

    protected void setFullOrPart(String pfullOrPart) {
        fullOrPart = pfullOrPart;
    }//set employee type, full time or part time

    @Override
    public String toString() {
        String message;

        double employeeCost;
        employeeCost = COST - (COST * 0.20);

        message = employeeID + "'s Membership Details\n" +
                "" +
                "===============================\n" +
                "Name:\t\t\t\t" + name + "\n" +
                "MembershipID:\t\t" + employeeID + "\n" +
                "Type of membership:\t" + type + "\n" +
                "Cost:\t\t\t\t" + df.format(employeeCost) + "\n";

        return message;
    }//toString

    protected static int numberOfEmployees() {
        return numberOfEmployees;
    }//numberOfEmployees

    protected void logIn() {

        System.out.println("Enter login username: ");
        String usernameAttempt = keyboard.nextLine();

        System.out.println("Enter password: ");
        String passwordAttempt = keyboard.nextLine();

        do {
            if ((usernameAttempt.equals(employeeID)) || (passwordAttempt.equals(password))) {
                System.out.println("Incorrect Username or Password!");
                System.out.println("Try again");
            }//if
            else {
                if ((usernameAttempt.equals(employeeID)) || (passwordAttempt.equals(password))) {
                    System.out.println("Incorrect Username or Password!");
                    System.out.println("Try again");
                }//if
                System.out.println("Enter login username: ");
                usernameAttempt = keyboard.nextLine();

                System.out.println("Enter password: ");
                passwordAttempt = keyboard.nextLine();
                System.out.println("Log in successful");
            }//else
        }
        while (((!usernameAttempt.equals(employeeID) || (!passwordAttempt.equals(password)))));
    }//logIn
}//class