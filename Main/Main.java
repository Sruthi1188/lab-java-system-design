import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Create a Map with a key of the student's name (String)
        // and a value of a Student object

        Student student1 = new Student("Alice", 80);
        Student student2 = new Student("Bob", 85);
        Student student3 = new Student("Charlie", 90);
        Student student4 = new Student("David", 95);

        Map<String, Student> students = new HashMap<>();

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);

        //Create a method called increaseGrades that takes a Map<String, Student> as a parameter,
        // increases every student's grade by 10% and returns the updated map.

        // Increase grades by 10%
        students = increaseGrades(students);

        // Print updated grades
        for (Student student : students.values()) {
            System.out.println(student.getName() + ": " + student.getGrade());
        }
    }

    public static Map<String, Student> increaseGrades(Map <String,Student > students){
        for (Student student : students.values()) {
            int newGrade = (int) (student.getGrade() * 1.1);
            if(newGrade > 100)
            {
                newGrade = 100;
            }
            student.setGrade(newGrade);
        }
        return students;
    }
}



