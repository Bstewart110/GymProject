package GroupProject;

import java.util.ArrayList;

public class ClassList {

    public static Class gym = new Class("Gym", "Arnold Swartz", 10);
    public static Class swim = new Class("Swimming", "David Hasslehoff", 10);
    public static Class wallclimb = new Class("Wall-Climbing", "Peter Parker",10);
    public static Class spin = new Class("Spin", "Lance Armstrong", 10);
    public static Class yoga = new Class("Yoga", "Mrs Incredible", 10);

    static ArrayList<Class> allCLasses = new ArrayList<>();

    public static void classList(){
        allCLasses.add(gym);
        allCLasses.add(swim);
        allCLasses.add(wallclimb);
        allCLasses.add(spin);
        allCLasses.add(yoga);
    }

    public static void seeClasses(){
        int count = 1;
        for(Class classes: allCLasses){
            System.out.println(count + ". " + classes.getClassType());
            count++;
        }
    }


}
