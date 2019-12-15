package GroupProject;

//class to read in and store membership details, by creating objects and
// store them in array list

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDetails {

    static Scanner keyboard = new Scanner(System.in);

    static String type, name, email, dob, address, university, gradDate
    , occupation, attendingClass;
    static SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");



    static ArrayList<StudentMembership> studentList = new ArrayList<>();
    static ArrayList<AdultMembership> adultList = new ArrayList<>();

    protected static void memberDetailsMenu() throws ParseException {

        String input;
        char letter;
        System.out.println("Are you a Student?: (Y/N) ");
        input = keyboard.next();
        letter = input.charAt(0);
        keyboard.nextLine();

        if((letter==('Y')) || (letter == ('y'))) {

            System.out.println("Please enter the new student members details");
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
            System.out.println("Graduation Date: ");
            gradDate = keyboard.nextLine();
            attendingClass = GymMenu.gymChoose;
            StudentMembership student = new StudentMembership(type, name, dob,
                    address, email, university, sdfo.parse(gradDate),
                    attendingClass);
            studentList.add(student);
            System.out.println(student);
        }//if
        else {
            if ((letter==('N')) || (letter == ('n'))) {
                System.out.println("Please enter the new members details");
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
                System.out.println("Occupation: ");
                occupation = keyboard.nextLine();
                attendingClass = GymMenu.gymChoose;
                AdultMembership adult = new AdultMembership(type, name, dob,
                        address, email, occupation, attendingClass);
                adultList.add(adult);
                System.out.println(adult);
            }//if
            else {
                System.out.println("Invalid Response please enter Y/N.");
                memberDetailsMenu();
            }//else
        }//else
    }//memberDetailsMenu

    //Method to return lost pass from student array
    protected static void viewStudents() {
        System.out.println("Please enter the lost pass MembershipID: ");
        int search = keyboard.nextInt();
        boolean found = false;
        int position = 0;

            while ((!found) && (position < studentList.size())) {
                if (search == studentList.get(position).getID()) {
                    found = true;
                }//if
                else {
                    position++;
                }//else
            }//while

        if(found){
            System.out.println(studentList.get(position));
        }//if
         else {
            System.out.println("That membershipID does not exist");
            System.out.println("================================");
        }//if
    }//view students

    //Method to return lost pass from adult array
    protected static void viewAdults() {
        System.out.println("Please enter the lost pass MembershipID: ");
        int search = keyboard.nextInt();
        boolean found = false;
        int position = 0;

        while ((!found) && (position < adultList.size())) {
            if (search == adultList.get(position).getID()) {
                found = true;
            }//if
            else {
                position++;
            }//else
        }//while

        if(found){
            System.out.println(adultList.get(position));
        }//if
        else {
            System.out.println("That membershipID does not exist");
            System.out.println("================================");
        }//if
    }//viewAdults
}//class
