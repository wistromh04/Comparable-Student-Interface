package comparableStudentInterface;
//Wistrom Herfordt
//3/22/
import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    //default constructor
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

   //series of getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    //defines how  student objs should be compared/sorted, its ordered by gpa first and if the gpas are equa, then name 
    @Override
    public int compareTo(Student other) {
        if (this.gpa != other.gpa) {
            return Double.compare(other.gpa, this.gpa); // Higher GPA comes first
        } else {
            return this.name.compareTo(other.name); // If GPAs are equal, compare by name
        }
    }

    //string representation of a student obj 
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

//sorts the students based off the compareTo method 
class StudentSorter {
    public List<Student> sortStudents(List<Student> students) {
        Collections.sort(students);
        return students;
    }
}


