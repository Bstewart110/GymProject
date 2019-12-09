package GroupProject;

import Lab3.University.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDetails {

    static Scanner keyboard = new Scanner(System.in);

    private static String type, name, email, dob, address, university, gradDate, occupation, attendingClass;
    static SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");

    static int studentCounter = 0;


    static ArrayList<StudentMembership> studentList = new ArrayList<>();
    static ArrayList<AdultMembership> adultList = new ArrayList<>();

    public static void memberDetailsMenu() throws ParseException {

        String input;
        char letter;
        System.out.println("Are you a Student?: (Y/N) ");
        input = keyboard.nextLine();
        letter = input.charAt(0);



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
            StudentMembership student = new StudentMembership(type, name, dob, address, email, university, sdfo.parse(gradDate), attendingClass);
            studentList.add(studentCounter, student);
            System.out.println(student);
            studentCounter++;
        }//if
        else {
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
            AdultMembership adult = new AdultMembership(type, name, dob, address, email, occupation, attendingClass);
            adultList.add(adult);
            System.out.println(adult);
        }//else

    }//memberDetailsMenu

    public static void viewStudents() {

        System.out.println(studentList);


//        for(int i = 0; i < studentList.size(); i++) {
//            System.out.println(studentList.get(i).getID());
//        }

    }//view students

    public static void viewAdults() {

        System.out.println(adultList);

//        for(int index = 0; index < adultList.size(); index++);
//        {

        }




}//class
