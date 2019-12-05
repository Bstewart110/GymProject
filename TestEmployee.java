package GroupProject;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by pg19brc on 05/12/2019
 * Program to test the Employee class
 */
public class TestEmployee {
    public static void main(String [] args) throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        String type, name, dob, address, email, fullOrPart, password;

        //creating new employee memberships

        EmployeeMembership employee1 = new EmployeeMembership("Employee", "Chelsea Braga", "13/07/1995", "8 Ardara Mews", "cb@ulster.ac.uk", "Full Time", "Password");

        EmployeeMembership employee2 = new EmployeeMembership ("Employee", "Harry Jones", "25/06/1986", "17 Pipers Field", "hj@ulster.ac.uk", "Part Time", "Password");

        //creating employee
        System.out.println("Membership type: ");
        type = keyboard.nextLine();
        System.out.println("Name: ");
        name = keyboard.nextLine();
        System.out.println("Date of Birth: ");
        dob = keyboard.nextLine();
        System.out.println("Address: ");
        address = keyboard.nextLine();
        System.out.println("Email: ");
        email = keyboard.nextLine();
        System.out.println("Employee Type: ");
        fullOrPart = keyboard.nextLine();
        System.out.println("Password: ");
        password = keyboard.nextLine();
        EmployeeMembership employee3 = new EmployeeMembership(type, name, dob, address, email, fullOrPart, password);

        //printing out employee memberships
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        //testing getID and getStatus
        System.out.println("The status of member " + employee1.getID() + " is " + employee1.getStatus());

        }//main

    }//class

