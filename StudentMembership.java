package GroupProject;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentMembership extends Membership {
    private SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");
    Scanner keyboard = new Scanner(System.in);

    //class variable

    private static int numberOfStudents = 0;

    //instance variables
    private String university;
    private Date graduationDate;


    public StudentMembership() {
        super();
        numberOfStudents++;
    }//default Constructor

    public StudentMembership( String stuType, String stuName, String stuDOB, String stuAddress, String stuEmail, String stuUniversity, Date stuGraduationDate, String stuChosenClass) {
        super(stuType, stuName, stuDOB, stuAddress, stuEmail, stuChosenClass);
        university = stuUniversity;
        graduationDate = stuGraduationDate;
        numberOfStudents++;
    }//alternate Constructor


    //get and set methods


    protected void setUniversity(String uni) {
        university = uni;
    }//setUniversity

    protected String getUniversity() {
        return university;
    }//getUniversity

    protected String getStatus() {
        return type;
    }//getStatus


    @Override
    public String toString() {
        String message;

        Date expiry = graduationDate;
        Date today = new Date();

        double studentCost;
        if (expiry.before(today)) {
            studentCost = cost;
        }//if
        else {
            studentCost = cost - (cost * 0.10);
        }//else

        message = name + "'s pass Details\n" +
                "===============================\n" +
                "Name:\t\t\t\t" + name + "\n" +
                "MembershipID:\t\t" + memberID + "\n" +
                "Type of membership:\t" + type + "\n" +
                "Cost:\t\t\t\t" + df.format(studentCost) + "\n" +
                "You have chosen to attend a " + classChosen + " class today with " + "\n";
        if (expiry.before(today)) {
            message = message + "This student discount has expired\n";
        } else {
            message = message + "Student membership expires on: " + sdfo.format(graduationDate) + "\n";
        }
        message = message + "=============================================\n";
        return message;

    }//toString

    protected static int numberOfStudents() {
        return numberOfStudents;
    }//numberOfStudents



}