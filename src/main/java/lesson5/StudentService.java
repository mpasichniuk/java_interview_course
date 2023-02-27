package lesson5;

import java.util.List;

public class StudentService {

        private DAO dao = new DAO();

        public StudentService() {
        }

        public Student findStudent(int id) {
            return dao.findById(id);
        }

        public void saveStudent(Student student) {
            dao.save(student);
        }

        public static void deleteStudent(Student student) {
            dao.delete(student);
        }

        public void updateStudent(Student student) {
            dao.update(student);
        }

        public List<Student> findAllStudents() {
            return dao.findAll();
        }



}

