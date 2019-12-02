package GroupProject;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentMembership extends Membership {
    private SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");
    Scanner keyboard = new Scanner(System.in);

    //class variable
    private static int nextStudentID = 101;
    private static int numberOfStudents = 0;

    //instance variables
    private String iDString = "STU";
    private String studentID;
    private String university;
    private Date graduationDate;



    public StudentMembership() {
        super();
        studentID = iDString + nextStudentID;
        nextStudentID = nextStudentID + 1;
        numberOfStudents++;
    }//default Constructor

    public StudentMembership(String stuType, String stuName, String stuDOB, String stuAddress, String stuEmail, String stuUniversity, Date stuGraduationDate) {
        super(stuType, stuName, stuDOB, stuAddress, stuEmail);
        university = stuUniversity;
        graduationDate = stuGraduationDate;
        studentID = iDString + nextStudentID;
        nextStudentID = nextStudentID  + 1;
        numberOfStudents++;
    }//alternate Constructor



    //get and set methods
    protected String getID(){
        return studentID;
    }//getID

    protected void setUniversity(String uni){
        university = uni;
    }//setUniversity

    protected String getUniversity(){
        return university;
    }//getUniversity

    protected String getStatus() {
        return type;
    }//getStatus

    @Override
    public String toString() {
        String message;

        Date expiry = graduationDate;
        Date today =  new Date();

        double studentCost;
        if (expiry.before(today)){
            studentCost = COST;
        }//if
        else {
            studentCost = COST - (COST * 0.10);
        }//else

        message = studentID + "'s Membership Details\n" +
                "===============================\n" +
                "Name:\t\t\t\t" + name + "\n" +
                "MembershipID:\t\t" + studentID + "\n" +
                "Type of membership:\t" + type + "\n" +
                "Cost:\t\t\t\t" + df.format(studentCost) + "\n";
        if(expiry.before(today)) {
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









}//class
