package GroupProject;

//Class created by William to test student membership objects

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestStudentMembership {
    public static void main(String[] args) throws ParseException {
        Scanner keyboard = new Scanner(System.in);


        //creating simple date format object


        String type, name, email, dob, address, university, password;
        String gradDate;
        SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");


        //creating new student memberships
//        StudentMembership student1 = new StudentMembership("Student",
//        "Billy Stewart", "15/4/94", "3 Drumcliff", "Bs@ulster.ac.uk",
//        "Ulster", sdfo.parse("21-06-2020"));
//
//        StudentMembership student2 = new StudentMembership("Student",
//        "Matthew McCafferty", "21/02/1993", "15 Square Street",
//        "Matt@ulster.ac.uk", "Ulster", sdfo.parse("21-06-2018"));
//
//
//        //creating student 3
//        System.out.println("Please enter the new members details");
//        System.out.println("Membership type: ");
//        type = keyboard.nextLine();
//        System.out.println("Name: ");
//        name = keyboard.nextLine();
//        System.out.println("Email: ");
//        email = keyboard.nextLine();
//        System.out.println("Date of Birth: ");
//        dob = keyboard.nextLine();
//        System.out.println("Address: ");
//        address = keyboard.nextLine();
//        System.out.println("University: ");
//        university = keyboard.nextLine();
//        System.out.println("Graduation Date: ");
//        gradDate = keyboard.nextLine();
//        System.out.println("Password: ");
//        password = keyboard.nextLine();
//        StudentMembership student3 = new StudentMembership(type, name, dob,
//        address, email, university, sdfo.parse(gradDate));
//
//        //array list to store student objects
//        ArrayList<StudentMembership> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//
//
//        Iterator itr = studentList.iterator();
//        while (itr.hasNext()) {
//            StudentMembership studentMembership = (StudentMembership)
//            itr.next();
//            System.out.println("Name: " + studentMembership.name +
//            "\tMemberID: " + studentMembership.memberID);
//        }
//
//        //printing out student memberships
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//
//        //testing getID and getStatus
//        System.out.println("The status of member " + student1.getID() +
//        " is " + student1.getStatus());
//
//        //student3.logIn();
//
//        student3.chooseGymClasses();

//        //public static void logIn() {
//
//            int num = 0;
////        String sMemberID = Integer.toString(memberID);
//            System.out.println("Enter login username: ");
//            String usernameAttempt = keyboard.nextLine();
//
//            System.out.println("Enter password: ");
//            String passwordAttempt = keyboard.nextLine();
//            do {
//
//                for(int index = 0; index < studentList.size(); index++)
//
//                    if (usernameAttempt.equals(studentList.get(index).getID())
//                    && (passwordAttempt.equals(studentList.get(index)
//                    .getPassword()))) {
//                        System.out.println("Log in successful");
//                        num = index;
//                    }//if
//                    else {
//                            System.out.println("Incorrect Username or
//                            Password!");
//                            System.out.println("Try again");
//                        System.out.println("Enter login username: ");
//                        usernameAttempt = keyboard.nextLine();
//
//                        System.out.println("Enter password: ");
//                        passwordAttempt = keyboard.nextLine();
//                        System.out.println("Log in successful");
//                        num = index;
//                    }//else
//
//            } while (((!usernameAttempt.equals(studentList.get(num).getID())
//            || (!passwordAttempt.equals(studentList.get(num).getPassword
//            ())))));
//        }//login

    }//main
}



