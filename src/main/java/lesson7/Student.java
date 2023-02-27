package lesson7;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "name")
        private String name;

        private int mark;



        public Student() {
        }

        public Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }



        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }


        @Override
        public String toString() {
            return "models.Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", mark=" + mark +
                    '}';
        }
    }



}
