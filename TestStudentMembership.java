package GroupProject;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class TestStudentMembership {
    public static void main(String [] args) throws ParseException {
        Scanner keyboard = new Scanner(System.in);

        //creating simple date format object


        String type, name, email, dob, address, university, password;
        String gradDate;
        SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");


        //creating new student memberships
        StudentMembership student1 = new StudentMembership("Student", "Billy Stewart", "15/4/94", "3 Drumcliff", "Bs@ulster.ac.uk", "Ulster", sdfo.parse("21-06-2020"));

        StudentMembership student2 = new StudentMembership("Student", "Matthew McCafferty", "21/02/1993", "15 Square Street", "Matt@ulster.ac.uk", "Ulster", sdfo.parse("21-06-2018"));




        //creating student 4
        System.out.println("Please enter the new members details");
        System.out.println("Membership type: ");
        type = keyboard.nextLine();
        System.out.println("Name: ");
        name = keyboard.nextLine();
        System.out.println("Email: ");
        email = keyboard.nextLine();
        System.out.println("Date of Birth: ");
        dob = keyboard.nextLine();
        System.out.println("Address: ");
        address = keyboard.nextLine();
        System.out.println("University: ");
        university = keyboard.nextLine();
        System.out.println("Graduation Date: ");
        gradDate = keyboard.nextLine();
        StudentMembership student4 = new StudentMembership(type, name, dob, address, email, university, sdfo.parse(gradDate));



        //printing out student memberships
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student4);

        //testing getID and getStatus
        System.out.println("The status of member " + student1.getID() + " is " + student1.getStatus());





    }//main
}//class
