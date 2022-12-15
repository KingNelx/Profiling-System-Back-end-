package springbe.Repository;

import springbe.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
  List<Student> findAllStudentByCourse(String course);
}
