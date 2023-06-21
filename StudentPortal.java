import java.util.Scanner;
import java.util.ArrayList;
public class StudentPortal {
    
    void displayStudents() {
        
        Student chemistry_student = new Student(123,"samuel"    ,9090);
        Student physics_student = new Student(1234,"deepa",909); 
        Student maths_student = new Student(123,"mahesh",809); 

        ArrayList<Student> students_list = new ArrayList<>();
        students_list.add(chemistry_student);
        students_list.add(physics_student);
        students_list.add(maths_student);
        students_list.forEach(student->System.out.println(student));
        
    }
    
    public static void main(String[] args) {
        
        StudentPortal portal = new StudentPortal();
        portal.displayStudents();
    }
}

class Student {
    int roll_number;
    long phone_number;
    String name;
    
    Student(int roll_number,String name,long phone_number) {
        this.roll_number = roll_number;
        this.name = name;
        this.phone_number = phone_number;
    }
    
    @Override
    public String toString() {
        return this.roll_number + "  " + this.name +"  "+this.phone_number;
    }
}
