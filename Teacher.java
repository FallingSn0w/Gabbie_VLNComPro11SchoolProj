//import necessary classes.
import java.util.Scanner;

/**
 * Teacher object class.
 */
public class Teacher {
    private String teacherFName;
    private String teacherLName;
    private String teacherSubject;

    /**
     * The Teacher class object constructor method holds three parameters, teacherFName, teacherLName, and teacherSubject. All of which are String values.
     * The constructor method uses each variable's respective "assign" method to assign a value to each parameter.
     * @param teacherFName
     * @param teacherLName
     * @param teacherSubject
     */
    Teacher(String teacherFName, String teacherLName, String teacherSubject){
        this.teacherFName = assignTeacherFName();
        this.teacherLName = assignTeacherLName();
        this.teacherSubject = assignTeacherSubject();
    }
    /**
     * The "assignteacherFName" method is used to assign a new "Teacher" object's "teacherFName" String value.
     * it does this by using a scanner and returning the String value input.
     * @return
     */
    public String assignTeacherFName(){
        System.out.println("Please enter Teacher first name:");
        Scanner scan = new Scanner(System.in);
        teacherFName = scan.nextLine();
        return teacherFName;
    }
    /**
     * the "getTeacherFName" simply retrieves the assigned teacherFName value from a "Teacher" object.
     * (Getter method)
     * @return
     */
    public String getTeacherFName() {
        return teacherFName;
    }

    public void setTeacherFName(String teacherFName) {
        this.teacherFName = teacherFName;
    }

    public String assignTeacherLName(){
        System.out.println("Please enter Teacher last name:");
        Scanner scan = new Scanner(System.in);
        teacherLName = scan.nextLine();
        return teacherLName;
    }
    /**
     * the "getTeacherLName" retrieves the assigned teacherLName value from a "Teacher" object.
     * @return
     */
    public String getTeacherLName() {
        return teacherLName;
    }

    public void setTeacherLName(String teacherLName) {
        this.teacherLName = teacherLName;
    }
    public String assignTeacherSubject(){
        System.out.println("Please enter Teacher subject:");
        Scanner scan = new Scanner(System.in);
        teacherSubject = scan.nextLine();
        return teacherSubject;
    }
    /**
     * the "getTeacherSubject" retrieves the assigned teacherSubject value from a "Teacher" object.
     * @return
     */
    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }
}