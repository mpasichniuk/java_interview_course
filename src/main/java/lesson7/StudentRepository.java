package lesson7;

import java.util.List;

public interface StudentRepository {

        List<Student> findAll();

        Student findById(long id);

        void insert(Student student);

        void update (Student student);

        void delete (Student student);

        long getCount();

    }
}
