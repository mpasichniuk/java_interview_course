package lesson5;

import java.sql.SQLException;

public class App {
        public static void main(String[] args) throws SQLException {

            StudentService studentService = new StudentService();
            Student student = new Student("Masha",26);
            studentService.saveStudent(student);

            studentService.updateStudent(student);
            student.setName("Fred");
            StudentService.deleteStudent(student);
        }
    }

