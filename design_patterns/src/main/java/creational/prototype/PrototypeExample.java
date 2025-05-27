package creational.prototype;

public class PrototypeExample {

    public static void main(String[] args) {

        Student student = new Student(12, "Niraj", 27);
        Student clonedStudent = (Student) student.clone();
        System.out.println(clonedStudent.toString());

    }
}
