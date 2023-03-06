//import necessary classes.
import java.util.Scanner;

public class Main {
    //public string that can be used as a graphic organizer throughout the class.
    public static String line = "=====";
    //Main method is called upon running the program.
    public static void main(String[] args) {
        //Creates a new School object called "newSchool" with default parameters.
        School newSchool = new School(null,null,0);
        //Print out the new School objects assigned values.
        System.out.println("\n--=="+newSchool.getSchoolType()+" school "+newSchool.getSchoolName()+" ranked "+newSchool.getSchoolRank()+".==--");
        //Call the recursive method "menu()" to begin managing students and teachers within the school.
        menu();
    }

    /**
     * The "menu()" method acts as a main menu that helps identify what actions are possible withing the program.
     * It prints out the available actions and has a Scanner to receive user input.
     * Depending on the input, it calls a method from the School class. Upon completion of said method, it will recursively call itself again.
     */
    public static void menu(){
        String input = "";
        System.out.println(line.repeat(10));
        System.out.println("To add Students type \"AS\"");
        System.out.println("To add Teachers type \"AT\"");
        System.out.println("To Remove Students type \"RS\"");
        System.out.println("To remove Students type \"RT\"");
        System.out.println("To print course list type \"CL\"");
        System.out.println("To print Teacher List type \"TL\"");
        System.out.println("To print Student List type \"SL\"");
        System.out.println(line.repeat(10));
        System.out.println("Action: ");
        //Scanner to receive user input
        Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            //switch statement to determine what action will be executed based on the user input.
            switch (input) {
                case "AS":
                    School.addStudents();
                    break;
                case "AT":
                    School.addTeachers();
                    break;
                case "RS":
                    School.removeStudents();
                    break;
                case "RT":
                    School.removeTeachers();
                    break;
                case "SL":
                    School.printStudentList();
                    break;
                case "TL":
                    School.printTeacherList();
                    break;
                case "CL":
                    School.printCourseList();
                    break;
                default:
                    //if the input does not match any recognized command, recursively call the "menu" method.
                    System.out.println("Unrecognized input, please try again.");
                    menu();

            }
            //After having run through the switch statement and completed the assigned action, call the "menu" method to bring up the menu again.
        menu();
    }
}