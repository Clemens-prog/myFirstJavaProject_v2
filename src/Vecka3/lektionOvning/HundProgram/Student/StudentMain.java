package Vecka3.lektionOvning.HundProgram.Student;

public class StudentMain {
    static void main(String[] args) {
        Student student = new Student("Daniel",1);
        System.out.println("Student årskurs " + student.getArskurs() + " stadium " + student.getStadium());
    }
}