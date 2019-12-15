package GroupProject;

//class created by William to define the gym classes
public class Class {

    //declaring variables
    private String classType, classInstructor;
    private int classSize;

    //constructors
    public Class(){
        classType = "ULSTER GYM";
        classInstructor = "DAVID HASSLEHOFF";
    }//default constructor

    public Class(String gymType, String instructor, int size){
        classType = gymType;
        classInstructor = instructor;
        classSize = size;
    }//alternate constructor

    //get and set methods
    public void setClassType(String gymType){
        this.classType = gymType;
    }//setClassType

    public String getClassType(){
        return classType;
    }//getClassType

    public void setClassInstructor(String instructor){
        this.classInstructor = instructor;
    }//setClassInstructor

    public String getClassInstructor(){
        return classInstructor;
    }//getClassInstructor


    public void setClassSize(int size){
        classSize = size;
    }//setClassSize

    public int getClassSize(){
        return classSize;
    }//getClassSize

    public String toString(){
        return classType + " " + classInstructor;
    }//toString

}//class
