package GroupProject;
//class created by William to build an array list of gym classes
import java.util.ArrayList;

public class ClassList {

    //creating each class object
    public static Class gym = new Class("Gym",
            "Arnold Swartz", 10);
    public static Class swim = new Class("Swimming",
            "David Hasslehoff", 10);
    public static Class wallclimb = new Class("Wall-Climbing",
            "Peter Parker",10);
    public static Class spin = new Class("Spin",
            "Lance Armstrong", 10);
    public static Class yoga = new Class("Yoga",
            "Mrs Incredible", 10);

    //declaring static array list
    static ArrayList<Class> allCLasses = new ArrayList<>();

    //adding class objects to the array list
    public static void classList(){
        allCLasses.add(gym);
        allCLasses.add(swim);
        allCLasses.add(wallclimb);
        allCLasses.add(spin);
        allCLasses.add(yoga);
    }//classList

    //method to see the classes
    public static void seeClasses(){
        int count = 1;
        for(Class classes: allCLasses){
            System.out.println(count + ". " + classes.getClassType());
            count++;
        }//for
    }//seeClasses
}//class
