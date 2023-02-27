package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository("first")
public class StudentRepositoryImpl implements StudentRepository {


        private final Map<Long, Student> studentMap = new ConcurrentHashMap<>();

        private final AtomicLong identity = new AtomicLong(0);

        public static List<Student> findAll() {
            return new ArrayList<>(studentMap.values());
        }

        public static Student findById(long id) {
            return studentMap.get(id);
        }

        public void insert(Student student) {
            long id = identity.incrementAndGet();
            student.setId(id);
            studentMap.put(id, student);
        }

        public void update(Student student) {
            studentMap.put((long) student.getId(),student);
        }

        public void delete(long id) {
            studentMap.remove(id);
        }

        @Override
        public long getCount() {
            return studentMap.size();
        }

    }


