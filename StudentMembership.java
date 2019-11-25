package GroupProject;

public class StudentMembership extends Membership {

    //class variable
    private static int nextStudentID = 1;
    private static int numberOfStudents = 0;

    //instance variables
    private int studentID;
    private String university;

    public StudentMembership() {
        super();
        studentID = nextStudentID;
        nextStudentID = nextStudentID++;
        numberOfStudents++;
    }//default Constructor

    public StudentMembership(String stuType, String stuName, String stuDOB, String stuAddress, String stuEmail, double stuCost, int stuID, String stuUniversity) {
        super(stuType, stuName, stuDOB, stuAddress, stuEmail, stuCost);
        studentID = stuID;
        university = stuUniversity;
        studentID = nextStudentID;
        nextStudentID = nextStudentID++;
        numberOfStudents++;
    }//alternate Constructor

    //get and set methods
    protected int getID(){
        return studentID;
    }//getID

    protected void setUniversity(String uni){
        university = uni;
    }//setUniversity

    protected String getUniversity(){
        return university;
    }//getUniversity

    protected String getStatus() {
        return "student member";
    }//getStatus


}
