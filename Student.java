//Import necessary classes
import java.util.Scanner;

/**
 * Student class: Holds 5 fields: First name, Last name, Grade, ID, and ID number.
 */
public class Student {
    private String studentFName;
    private String studentLName;
    private int studentGrade;
    private int studentID;
    private static int studentIDNum;

    /**
     * Student class object constructor takes three parameters, studentFName, studentLName, and studentGrade.
     * Assigning values to each instance of the class object by calling their respective "assign" methods.
     * @param studentFName
     * @param studentLName
     * @param studentGrade
     */
    Student(String studentFName, String studentLName, int studentGrade) {
        this.studentFName = assignStudentFName();
        this.studentLName = assignStudentLName();
        this.studentGrade = assignStudentGrade();
        this.studentID = studentIDNum;
        //independently increase the studentIDNum value each time a new "Student" object is made to ensure each student has a unique ID number.
        studentIDNum++;
    }

    /**
     * The "assignStudentFName" method is used to assign a new "Student" object's "studentFName" String value.
     * it does this by using a scanner and returning the String value input.
     * @return
     */
    public String assignStudentFName(){
        System.out.println("Student First Name:" );
        Scanner scan = new Scanner(System.in);
        studentFName = scan.nextLine();
        return studentFName;
    }

    /**
     * the "getStudentFName" simply retrieves the assigned studentFName value from a "Student" object.
     * (Getter method)
     * @return
     */
    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    /**
     * Identical method to "assignStudentFName()" but for the student's assigned last name.
     * @return
     */
    public String assignStudentLName(){
        System.out.println("Student Last Name:");
        Scanner scan = new Scanner(System.in);
        studentLName = scan.nextLine();
        return studentLName;
    }

    /**
     * Identical getter method as "getStudentFName()"
     * @return
     */
    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    /**
     * The "assignStudentGrade" method collects and assigns and integer value to a new "Student" object
     * by using a scanner. The method then checks to ensure that it is an integer value. If it is, it assigns the value,
     * otherwise it recursively calls itself until an integer is provided.
     * @return
     */
    public int assignStudentGrade(){
        System.out.println("Student Grade:" );
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            studentGrade = scan.nextInt();
        }else{
            System.out.println("Please enter an integer value.");
            assignStudentGrade();
        }
        return studentGrade;
    }

    /**
     * the "getStudentGrade" retrieves the assigned studentGrade value from a "Student" object.
     * @return
     */
    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    /**
     * the "getStudentID" retrieves the assigned studentID value from a "Student" object.
     * @return
     */
    public int getStudentID() {
        return studentID;
    }
    public int getStudentIDNum(){
        return studentIDNum;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}