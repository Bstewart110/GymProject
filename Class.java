package GroupProject;

public class Class {

    private String classType, classInstructor;
    private int classSize;

    public Class(){
        classType = "ULSTER GYM";
        classInstructor = "DAVID HASSLEHOFF";
    }

    public Class(String gymType, String instructor, int size){
        classType = gymType;
        classInstructor = instructor;
        classSize = size;
    }

    public void setClassType(String gymType){
        this.classType = gymType;
    }

    public String getClassType(){
        return classType;
    }

    public void setClassInstructor(String instructor){
        this.classInstructor = instructor;
    }

    public String getClassInstructor(){
        return classInstructor;
    }


    public String toString(){
        return classType + " " + classInstructor;
    }

    public void setClassSize(int size){
        classSize = size;
    }

    public int getClassSize(){
        return classSize;
    }


}
