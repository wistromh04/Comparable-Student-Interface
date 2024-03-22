package comparableStudentInterface;
/**
 * This has 3 steps:
 * 		1. Student objects are added to an ArrayList 
 * 		2. Students are sorted by the StudentSorter and put into a new ArrayList accordingly 
 * 		3. Student objects in the new sorted list are printed out
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 3.5));
        students.add(new Student(2, "Bob", 3.7));
        students.add(new Student(3, "Charlie", 3.5));

        //2.
        StudentSorter sorter = new StudentSorter();
        List<Student> sortedStudents = sorter.sortStudents(students);

        // 3.
        for (Student student : sortedStudents) {
            System.out.println(student);
        }
    }
}
