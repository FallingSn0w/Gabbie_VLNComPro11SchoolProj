//Import the necessary classes, including ArrayList to manage arrays of Teacher and Student class objects.
import java.util.ArrayList;
import java.util.Scanner;

/**
 * School object class. Each object holds a value for the schoolName, schoolType, schoolRank, and three ArrayLists. One for Students, Teachers, and the Course that the teachers teach.
 */
public class School {
    //"lineTwo" is used as a graphic organizer to space apart and distinguish different parts of the program.
    public static String lineTwo = "---";
    private static String schoolName;
    private static String schoolType;
    private static int schoolRank;

    //Each arrayList holds a different kind of value; studentList holding Student objects, teacherList holding Teacher objects, and courseList holding an array of Strings.
    //The studentList ArrayList holds an array of Student objects.
    private static ArrayList<Student> studentList = new ArrayList<>();
    //The teacherList ArrayList holds and array of Teacher objects.
    private static ArrayList<Teacher> teacherList = new ArrayList<>();
    //The courseList ArrayList holds and array of String values that reflect the courses taught by the existing teachers in the school.
    private static ArrayList<String> courseList = new ArrayList<>();

    /**
     * The School class object constructor has three parameters, it's name (String), type (String), and rank (int).
     * @param schoolName
     * @param schoolType
     * @param schoolRank
     */
    School(String schoolName, String schoolType, int schoolRank) {
        this.schoolName = assignSchoolName();
        this.schoolType = assignSchoolType();
        this.schoolRank = assignSchoolRank();
    }

    /**
     * the assignSchoolName method is the method used to receive and assign a String value to a new School object's schoolName variable.
     * It does this by prompting the user, and using a scanner, then returning the input value.
     * @return
     */
    public static String assignSchoolName() {
        System.out.println("Enter School Name:");
        Scanner scan = new Scanner(System.in);
        schoolName = scan.nextLine();
        return schoolName;
    }

    /**
     * the "getter" method for the "schoolName" variable of a School object.
     * @return
     */
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * the assignSchoolType method is the method used to receive and assign a String value to a new School objects schoolType variable.
     * It does this by prompting the user, and using a scanner, then returning the input value.
     * @return
     */
    public static String assignSchoolType() {
        System.out.println("Enter School Type:");
        Scanner scan = new Scanner(System.in);
        schoolType = scan.nextLine();
        return schoolType;
    }
    /**
     * the "getter" method for the "schoolType" variable of a School object.
     * @return
     */
    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    /**
     * The "assignSchoolRank" method is used to receive and assign an integer value to the "schoolRank" variable.
     * it does this by using a scanner to receive an input, and checking the input to see whether it is an integer value or not.
     * If the value given was an int, then it is assigned to be the schoolRank variable.
     * @return
     */
    public static int assignSchoolRank() {
        System.out.println("Enter School Rank:");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            schoolRank = scan.nextInt();
        } else {
            System.out.println("this is not an integer value");
            assignSchoolRank();
        }
        return schoolRank;
    }

    /**
     * the "getter" method for the "schoolRank" variable of a School object.
     * @return
     */
    public int getSchoolRank() {
        return schoolRank;
    }

    public void setSchoolRank(int schoolRank) {
        this.schoolRank = schoolRank;
    }

    /**
     *The printStudentList() method is used to print out the studentList ArrayList using a for loop.
     */
    public static void printStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("StudentID: " + studentList.get(i).getStudentID() + " - " + studentList.get(i).getStudentFName() + ", " + studentList.get(i).getStudentLName() + " - Gr" + studentList.get(i).getStudentGrade() + ".");
        }
    }

    /**
     * The addStudents method adds Student objects to the studentList ArrayList.
     * It does this by using a scanner to receive an integer input which determines how many student objects are created and added to the studentList ArrayList.
     */
    public static void addStudents() {
        //prompt user input.
        System.out.println("How many Students to add?");
        //Scanner to receiver user input.
        Scanner scan = new Scanner(System.in);
        //Check it the input is an integer value.
        if (scan.hasNextInt()) {
            //If the input was an integer value, set the for-loop to repeat "num" times
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                //Create a new Student object with blank parameters.
                Student newStudent = new Student("", "", 0);
                //Add the new Student object to the "studentList" ArrayList.
                studentList.add(newStudent);
                //Print out the values assigned to the new Student object using the Student class getter methods.
                System.out.println("ADDED: " + newStudent.getStudentID() + " - " + newStudent.getStudentFName() + " " + newStudent.getStudentLName() + " Grade: " + newStudent.getStudentGrade());
                System.out.println(lineTwo.repeat(10));
            }
            //If the input value was not an integer, print a message to indicate the error and call the "addStudents" method again.
        } else {
            System.out.println("Please enter an integer value.");
            System.out.println(lineTwo.repeat(10));
            addStudents();
        }
    }

    /**
     * The removeStudents method removes a Student object from the studentList ArrayList.
     * It does this by receiving a integer input and searching the existing studentList ArrayList for that ID number using a for-loop.
     */
    public static void removeStudents() {
        //Print out the current studentList.
        printStudentList();
        //Use a graphic organizer to separate from the rest of the UI.
        System.out.println(lineTwo.repeat(10));
        //Prompt user input.
        System.out.println("Enter Student ID number: ");
        //Scanner to receive user input.
        Scanner scan = new Scanner(System.in);
        //Check input to see if it is an integer or not.
        if (scan.hasNextInt()) {
            //If the input was an integer, set the variable "delID" to the value of the input.
            int delID = scan.nextInt();
            //Using a for loop, go through each item in the studentList ArrayList and check to see if "delID" is equal to the ID number of the Student object at the index.
            for (int y = 0; y < studentList.size(); y++) {
                //Check if the input value is equal to the Student object ID by using it to the value returned from the Student class method "getStudentID()".
                if ((studentList.get(y).getStudentID()) == delID) {
                    //if the above statement is true, print a message and remove the Student object at the current index.
                    System.out.println("Student " + studentList.get(y).getStudentID() + " removed");
                    System.out.println(lineTwo.repeat(10));
                    studentList.remove(y);
                    //Print out the new studentList ArrayList.
                    printStudentList();
                }
            }
            //If the input value did not match the studentID value of any object in the ArrayList searched, indicate that no such ID was found.
        } else {
            System.out.println("Student ID not found.");
        }
    }

    /**
     * The PrintTeacherList method is used to print out the first name, last name and subject variable values of each Teacher object in the teacherListArrayList.
     * This is done by using a for loop to go through each object in the teacherList ArrayList
     */
    public static void printTeacherList() {
        //For-loop to go through each object in the teacherList ArrayList and use the respective "get" methods to find and print the Teacher object's variable values.
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).getTeacherFName() + " " + teacherList.get(i).getTeacherLName() + " teaching - " + teacherList.get(i).getTeacherSubject());
        }
    }

    /**
     * The addTeachers method adds a variable amount of new Teacher class objects to the "teacherList" ArrayList by
     * using a for-loop and scanner to receive user input and assign values to them.
     */
    public static void addTeachers() {
        //prompt user input.
        System.out.println("How many Teachers to add?");
        //Scanner to receive user input.
        Scanner scan = new Scanner(System.in);
        //check is input value is an integer.
        if (scan.hasNextInt()) {
            //set for-loop to repeat as may times as set by input value.
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                //create new Teacher object.
                Teacher newTeacher = new Teacher("", "", "");
                //add new Teacher and Course to their respective ArrayLists.
                teacherList.add(newTeacher);
                courseList.add(newTeacher.getTeacherSubject());
                //print out the new Teacher object's variable values for first name, last name, and course.
                System.out.println("ADDED: " + newTeacher.getTeacherFName() + " " + newTeacher.getTeacherLName() + " - " + newTeacher.getTeacherSubject());
                System.out.println(lineTwo.repeat(10));
            }
        } else {
            //if the input value was not an integer, indicate the error and recall the addTeachers() method.
            System.out.println("Please enter an integer value.");
            System.out.println(lineTwo.repeat(10));
            addTeachers();
        }
    }
    /**
     * The removeTeachers method removes a teacher from the teacherList ArrayList by using a scanner and for-loop to search through the ArrayList.
     * At each iteration of the for-loop, an if statement compares a user provided String value with the value returned by the "getTeacherFName()" method.
     * If the values match, the Teacher class object at that index is removed.
     */
    public static void removeTeachers() {
        //print out current teacherList ArrayList.
        printTeacherList();
        System.out.println(lineTwo.repeat(10));
        //prompt user input.
        System.out.println("Enter Teacher First Name: ");
        Scanner scan = new Scanner(System.in);
        String delTeach = scan.nextLine();
        //for-loop to search the teacherList ArrayList.
        for (int i = 0; i < teacherList.size(); i++) {
            //see if the user given string value matches the value returned by the "getTeacherFName()" method for the current index "i".
            if ((teacherList.get(i).getTeacherFName()).equals(delTeach)) {
                //If true, the desired teacher object has been found. Print our the information of the teacher that will be removed.
                System.out.println("REMOVED: " + teacherList.get(i).getTeacherFName() + ", " + teacherList.get(i).getTeacherLName() + " teaching - " + teacherList.get(i).getTeacherSubject());
                //remove the teacher object from the teacherList ArrayList at index "i".
                teacherList.remove(i);
                //remove the course from the courseList ArrayList ar index "i" (since the teacher is no longer there to teach it).
                courseList.remove(i);
                System.out.println(lineTwo.repeat(10));
                //print out the updated "teacherList".
                printTeacherList();
            }
        }
    }

    /**
     * The printCourseList method prints out the current courseList ArrayList using a for-loop to go through each item.
     * The courseList consists of all the courses taught by the teachers in the school and reflects which courses are available.
     * Removing a teacher removes their respective course from this list.
     */
        public static void printCourseList() {
            //for-loop to go through each index in the courseList.
            for (int i = 0; i < courseList.size(); i++) {
                //at each index, print out the course, and first name of the teacher teaching the subject.
                System.out.println(courseList.get(i) + " - taught by " + teacherList.get(i).getTeacherFName());
            }
        }

    }